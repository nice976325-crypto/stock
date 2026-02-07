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


import com.dao.GupiaoxinxiDao;
import com.entity.GupiaoxinxiEntity;
import com.service.GupiaoxinxiService;
import com.entity.vo.GupiaoxinxiVO;
import com.entity.view.GupiaoxinxiView;

@Service("gupiaoxinxiService")
public class GupiaoxinxiServiceImpl extends ServiceImpl<GupiaoxinxiDao, GupiaoxinxiEntity> implements GupiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GupiaoxinxiEntity> page = this.selectPage(
                new Query<GupiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<GupiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GupiaoxinxiEntity> wrapper) {
		  Page<GupiaoxinxiView> page =new Query<GupiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GupiaoxinxiVO> selectListVO(Wrapper<GupiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GupiaoxinxiVO selectVO(Wrapper<GupiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GupiaoxinxiView> selectListView(Wrapper<GupiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GupiaoxinxiView selectView(Wrapper<GupiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
