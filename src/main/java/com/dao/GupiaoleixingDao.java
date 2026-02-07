package com.dao;

import com.entity.GupiaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GupiaoleixingVO;
import com.entity.view.GupiaoleixingView;


/**
 * 股票类型
 * 
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface GupiaoleixingDao extends BaseMapper<GupiaoleixingEntity> {
	
	List<GupiaoleixingVO> selectListVO(@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);
	
	GupiaoleixingVO selectVO(@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);
	
	List<GupiaoleixingView> selectListView(@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);

	List<GupiaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);

	
	GupiaoleixingView selectView(@Param("ew") Wrapper<GupiaoleixingEntity> wrapper);
	

}
