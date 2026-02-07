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


import com.dao.ToptenDao;
import com.entity.ToptenEntity;
import com.service.ToptenService;
import com.entity.vo.ToptenVO;
import com.entity.view.ToptenView;

@Service("toptenService")
public class ToptenServiceImpl extends ServiceImpl<ToptenDao, ToptenEntity> implements ToptenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToptenEntity> page = this.selectPage(
                new Query<ToptenEntity>(params).getPage(),
                new EntityWrapper<ToptenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToptenEntity> wrapper) {
		  Page<ToptenView> page =new Query<ToptenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ToptenVO> selectListVO(Wrapper<ToptenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ToptenVO selectVO(Wrapper<ToptenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ToptenView> selectListView(Wrapper<ToptenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToptenView selectView(Wrapper<ToptenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ToptenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ToptenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ToptenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
