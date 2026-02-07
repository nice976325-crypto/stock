package com.dao;

import com.entity.HistoryinfoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HistoryinfoVO;
import com.entity.view.HistoryinfoView;


/**
 * 历史数据
 * 
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface HistoryinfoDao extends BaseMapper<HistoryinfoEntity> {
	
	List<HistoryinfoVO> selectListVO(@Param("ew") Wrapper<HistoryinfoEntity> wrapper);
	
	HistoryinfoVO selectVO(@Param("ew") Wrapper<HistoryinfoEntity> wrapper);
	
	List<HistoryinfoView> selectListView(@Param("ew") Wrapper<HistoryinfoEntity> wrapper);

	List<HistoryinfoView> selectListView(Pagination page,@Param("ew") Wrapper<HistoryinfoEntity> wrapper);

	
	HistoryinfoView selectView(@Param("ew") Wrapper<HistoryinfoEntity> wrapper);
	

}
