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


import com.dao.GupiaojiaoyiDao;
import com.entity.GupiaojiaoyiEntity;
import com.service.GupiaojiaoyiService;
import com.entity.vo.GupiaojiaoyiVO;
import com.entity.view.GupiaojiaoyiView;

@Service("gupiaojiaoyiService")
public class GupiaojiaoyiServiceImpl extends ServiceImpl<GupiaojiaoyiDao, GupiaojiaoyiEntity> implements GupiaojiaoyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GupiaojiaoyiEntity> page = this.selectPage(
                new Query<GupiaojiaoyiEntity>(params).getPage(),
                new EntityWrapper<GupiaojiaoyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GupiaojiaoyiEntity> wrapper) {
		  Page<GupiaojiaoyiView> page =new Query<GupiaojiaoyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GupiaojiaoyiVO> selectListVO(Wrapper<GupiaojiaoyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GupiaojiaoyiVO selectVO(Wrapper<GupiaojiaoyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GupiaojiaoyiView> selectListView(Wrapper<GupiaojiaoyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GupiaojiaoyiView selectView(Wrapper<GupiaojiaoyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
