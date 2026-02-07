package com.dao;

import com.entity.GupiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GupiaoxinxiVO;
import com.entity.view.GupiaoxinxiView;


/**
 * 股票信息
 * 
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface GupiaoxinxiDao extends BaseMapper<GupiaoxinxiEntity> {
	
	List<GupiaoxinxiVO> selectListVO(@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);
	
	GupiaoxinxiVO selectVO(@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);
	
	List<GupiaoxinxiView> selectListView(@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);

	List<GupiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);

	
	GupiaoxinxiView selectView(@Param("ew") Wrapper<GupiaoxinxiEntity> wrapper);
	

}
