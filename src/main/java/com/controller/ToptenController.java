package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ToptenEntity;
import com.entity.view.ToptenView;

import com.service.ToptenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaPairRDD;
import scala.Tuple2;

/**
 * 十大成交股
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
@RestController
@RequestMapping("/topten")
public class ToptenController {
    @Autowired
    private ToptenService toptenService;
    @Autowired
    private JavaSparkContext javaSparkContext;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ToptenEntity topten,
		HttpServletRequest request){
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();

		PageUtils page = toptenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, topten), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ToptenEntity topten, 
		HttpServletRequest request){
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();

		PageUtils page = toptenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, topten), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ToptenEntity topten){
       	EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( topten, "topten")); 
        return R.ok().put("data", toptenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ToptenEntity topten){
        EntityWrapper< ToptenEntity> ew = new EntityWrapper< ToptenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( topten, "topten")); 
		ToptenView toptenView =  toptenService.selectView(ew);
		return R.ok("查询十大成交股成功").put("data", toptenView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ToptenEntity topten = toptenService.selectById(id);
        return R.ok().put("data", topten);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ToptenEntity topten = toptenService.selectById(id);
        return R.ok().put("data", topten);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ToptenEntity topten, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(topten);
        toptenService.insert(topten);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ToptenEntity topten, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(topten);
        toptenService.insert(topten);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ToptenEntity topten, HttpServletRequest request){
        //ValidatorUtils.validateEntity(topten);
        toptenService.updateById(topten);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        toptenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
        List<Map<String, Object>> result = toptenService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        List<Map<String, Object>> result2 = new ArrayList<Map<String,Object>>();
        for(Map<String, Object> m : result) {
            List<Tuple2<String, Object>> data = new ArrayList<>();
            for(String s : m.keySet()) {
                data.add(new Tuple2<>(s, m.get(s)));
            }
            JavaPairRDD<String, Object> originRDD = javaSparkContext.parallelizePairs(data);
            result2.add(originRDD.collectAsMap());
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = toptenService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
        List<Map<String, Object>> result = toptenService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        List<Map<String, Object>> result2 = new ArrayList<Map<String,Object>>();
        for(Map<String, Object> m : result) {
            List<Tuple2<String, Object>> data = new ArrayList<>();
            for(String s : m.keySet()) {
                data.add(new Tuple2<>(s, m.get(s)));
            }
            JavaPairRDD<String, Object> originRDD = javaSparkContext.parallelizePairs(data);
            result2.add(originRDD.collectAsMap());
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = toptenService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
        List<Map<String, Object>> result = toptenService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        List<Map<String, Object>> result2 = new ArrayList<Map<String,Object>>();
        for(Map<String, Object> m : result) {
            List<Tuple2<String, Object>> data = new ArrayList<>();
            for(String s : m.keySet()) {
                data.add(new Tuple2<>(s, m.get(s)));
            }
            JavaPairRDD<String, Object> originRDD = javaSparkContext.parallelizePairs(data);
            result2.add(originRDD.collectAsMap());
        }
        return R.ok().put("data", result2);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,ToptenEntity topten, HttpServletRequest request){
        EntityWrapper<ToptenEntity> ew = new EntityWrapper<ToptenEntity>();
        int count = toptenService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, topten), params), params));
        return R.ok().put("data", count);
    }



}
