package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HistoryinfoDao;
import com.entity.HistoryinfoEntity;
import com.service.HistoryinfoService;
import com.entity.vo.HistoryinfoVO;
import com.entity.view.HistoryinfoView;

@Service("historyinfoService")
public class HistoryinfoServiceImpl extends ServiceImpl<HistoryinfoDao, HistoryinfoEntity> implements HistoryinfoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HistoryinfoEntity> page = this.selectPage(
                new Query<HistoryinfoEntity>(params).getPage(),
                new EntityWrapper<HistoryinfoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HistoryinfoEntity> wrapper) {
		  Page<HistoryinfoView> page =new Query<HistoryinfoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HistoryinfoVO> selectListVO(Wrapper<HistoryinfoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HistoryinfoVO selectVO(Wrapper<HistoryinfoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HistoryinfoView> selectListView(Wrapper<HistoryinfoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HistoryinfoView selectView(Wrapper<HistoryinfoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
