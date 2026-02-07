package com.dao;

import com.entity.ToptenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToptenVO;
import com.entity.view.ToptenView;


/**
 * 十大成交股
 * 
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface ToptenDao extends BaseMapper<ToptenEntity> {
	
	List<ToptenVO> selectListVO(@Param("ew") Wrapper<ToptenEntity> wrapper);
	
	ToptenVO selectVO(@Param("ew") Wrapper<ToptenEntity> wrapper);
	
	List<ToptenView> selectListView(@Param("ew") Wrapper<ToptenEntity> wrapper);

	List<ToptenView> selectListView(Pagination page,@Param("ew") Wrapper<ToptenEntity> wrapper);

	
	ToptenView selectView(@Param("ew") Wrapper<ToptenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToptenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToptenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToptenEntity> wrapper);



}
