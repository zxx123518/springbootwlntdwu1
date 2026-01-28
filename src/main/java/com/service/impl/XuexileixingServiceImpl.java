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


import com.dao.XuexileixingDao;
import com.entity.XuexileixingEntity;
import com.service.XuexileixingService;
import com.entity.vo.XuexileixingVO;
import com.entity.view.XuexileixingView;

@Service("xuexileixingService")
public class XuexileixingServiceImpl extends ServiceImpl<XuexileixingDao, XuexileixingEntity> implements XuexileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexileixingEntity> page = this.selectPage(
                new Query<XuexileixingEntity>(params).getPage(),
                new EntityWrapper<XuexileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexileixingEntity> wrapper) {
		  Page<XuexileixingView> page =new Query<XuexileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XuexileixingVO> selectListVO(Wrapper<XuexileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexileixingVO selectVO(Wrapper<XuexileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexileixingView> selectListView(Wrapper<XuexileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexileixingView selectView(Wrapper<XuexileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
