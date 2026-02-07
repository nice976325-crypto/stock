package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HistoryinfoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HistoryinfoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HistoryinfoView;


/**
 * 历史数据
 *
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public interface HistoryinfoService extends IService<HistoryinfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HistoryinfoVO> selectListVO(Wrapper<HistoryinfoEntity> wrapper);
   	
   	HistoryinfoVO selectVO(@Param("ew") Wrapper<HistoryinfoEntity> wrapper);
   	
   	List<HistoryinfoView> selectListView(Wrapper<HistoryinfoEntity> wrapper);
   	
   	HistoryinfoView selectView(@Param("ew") Wrapper<HistoryinfoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HistoryinfoEntity> wrapper);

   	

}

