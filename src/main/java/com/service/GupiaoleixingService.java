package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GupiaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GupiaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GupiaoleixingView;


/**
 * 股票类型
 *
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface GupiaoleixingService extends IService<GupiaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GupiaoleixingVO> selectListVO(Wrapper<GupiaoleixingEntity> wrapper);
   	
   	GupiaoleixingVO selectVO(@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);
   	
   	List<GupiaoleixingView> selectListView(Wrapper<GupiaoleixingEntity> wrapper);
   	
   	GupiaoleixingView selectView(@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GupiaoleixingEntity> wrapper);

   	

}

