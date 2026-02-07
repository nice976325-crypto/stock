package com.dao;

import com.entity.GupiaojiaoyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GupiaojiaoyiVO;
import com.entity.view.GupiaojiaoyiView;


/**
 * 股票交易
 * 
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface GupiaojiaoyiDao extends BaseMapper<GupiaojiaoyiEntity> {
	
	List<GupiaojiaoyiVO> selectListVO(@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);
	
	GupiaojiaoyiVO selectVO(@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);
	
	List<GupiaojiaoyiView> selectListView(@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);

	List<GupiaojiaoyiView> selectListView(Pagination page,@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);

	
	GupiaojiaoyiView selectView(@Param("ew") Wrapper<GupiaojiaoyiEntity> wrapper);
	

}
