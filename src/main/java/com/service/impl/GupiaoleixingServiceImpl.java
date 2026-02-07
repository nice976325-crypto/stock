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


import com.dao.GupiaoleixingDao;
import com.entity.GupiaoleixingEntity;
import com.service.GupiaoleixingService;
import com.entity.vo.GupiaoleixingVO;
import com.entity.view.GupiaoleixingView;

@Service("gupiaoleixingService")
public class GupiaoleixingServiceImpl extends ServiceImpl<GupiaoleixingDao, GupiaoleixingEntity> implements GupiaoleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GupiaoleixingEntity> page = this.selectPage(
                new Query<GupiaoleixingEntity>(params).getPage(),
                new EntityWrapper<GupiaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GupiaoleixingEntity> wrapper) {
		  Page<GupiaoleixingView> page =new Query<GupiaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GupiaoleixingVO> selectListVO(Wrapper<GupiaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GupiaoleixingVO selectVO(Wrapper<GupiaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GupiaoleixingView> selectListView(Wrapper<GupiaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GupiaoleixingView selectView(Wrapper<GupiaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
