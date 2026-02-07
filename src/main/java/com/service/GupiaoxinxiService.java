package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GupiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GupiaoxinxiView;


/**
 * 股票信息
 *
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface GupiaoxinxiService extends IService<GupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GupiaoxinxiVO> selectListVO(Wrapper<GupiaoxinxiEntity> wrapper);
   	
   	GupiaoxinxiVO selectVO(@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);
   	
   	List<GupiaoxinxiView> selectListView(Wrapper<GupiaoxinxiEntity> wrapper);
   	
   	GupiaoxinxiView selectView(@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GupiaoxinxiEntity> wrapper);

   	

}

