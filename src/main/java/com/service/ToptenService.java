package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToptenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToptenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToptenView;


/**
 * 十大成交股
 *
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface ToptenService extends IService<ToptenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToptenVO> selectListVO(Wrapper<ToptenEntity> wrapper);
   	
   	ToptenVO selectVO(@Param("ew") Wrapper<ToptenEntity> wrapper);
   	
   	List<ToptenView> selectListView(Wrapper<ToptenEntity> wrapper);
   	
   	ToptenView selectView(@Param("ew") Wrapper<ToptenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToptenEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ToptenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ToptenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ToptenEntity> wrapper);



}

