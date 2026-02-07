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

import com.entity.GupiaojiaoyiEntity;
import com.entity.view.GupiaojiaoyiView;

import com.service.GupiaojiaoyiService;
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
 * 股票交易
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
@RestController
@RequestMapping("/gupiaojiaoyi")
public class GupiaojiaoyiController {
    @Autowired
    private GupiaojiaoyiService gupiaojiaoyiService;
    @Autowired
    private JavaSparkContext javaSparkContext;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GupiaojiaoyiEntity gupiaojiaoyi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			gupiaojiaoyi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GupiaojiaoyiEntity> ew = new EntityWrapper<GupiaojiaoyiEntity>();

		PageUtils page = gupiaojiaoyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gupiaojiaoyi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GupiaojiaoyiEntity gupiaojiaoyi, 
		HttpServletRequest request){
        EntityWrapper<GupiaojiaoyiEntity> ew = new EntityWrapper<GupiaojiaoyiEntity>();

		PageUtils page = gupiaojiaoyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gupiaojiaoyi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GupiaojiaoyiEntity gupiaojiaoyi){
       	EntityWrapper<GupiaojiaoyiEntity> ew = new EntityWrapper<GupiaojiaoyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gupiaojiaoyi, "gupiaojiaoyi")); 
        return R.ok().put("data", gupiaojiaoyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GupiaojiaoyiEntity gupiaojiaoyi){
        EntityWrapper< GupiaojiaoyiEntity> ew = new EntityWrapper< GupiaojiaoyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gupiaojiaoyi, "gupiaojiaoyi")); 
		GupiaojiaoyiView gupiaojiaoyiView =  gupiaojiaoyiService.selectView(ew);
		return R.ok("查询股票交易成功").put("data", gupiaojiaoyiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GupiaojiaoyiEntity gupiaojiaoyi = gupiaojiaoyiService.selectById(id);
        return R.ok().put("data", gupiaojiaoyi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GupiaojiaoyiEntity gupiaojiaoyi = gupiaojiaoyiService.selectById(id);
        return R.ok().put("data", gupiaojiaoyi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GupiaojiaoyiEntity gupiaojiaoyi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gupiaojiaoyi);
        gupiaojiaoyiService.insert(gupiaojiaoyi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GupiaojiaoyiEntity gupiaojiaoyi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gupiaojiaoyi);
        gupiaojiaoyiService.insert(gupiaojiaoyi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GupiaojiaoyiEntity gupiaojiaoyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gupiaojiaoyi);
        gupiaojiaoyiService.updateById(gupiaojiaoyi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gupiaojiaoyiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
