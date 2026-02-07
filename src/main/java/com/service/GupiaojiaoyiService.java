package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GupiaojiaoyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GupiaojiaoyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GupiaojiaoyiView;


/**
 * 股票交易
 *
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface GupiaojiaoyiService extends IService<GupiaojiaoyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GupiaojiaoyiVO> selectListVO(Wrapper<GupiaojiaoyiEntity> wrapper);
   	
   	GupiaojiaoyiVO selectVO(@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);
   	
   	List<GupiaojiaoyiView> selectListView(Wrapper<GupiaojiaoyiEntity> wrapper);
   	
   	GupiaojiaoyiView selectView(@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GupiaojiaoyiEntity> wrapper);

   	

}

