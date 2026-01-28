package com.dao;

import com.entity.XuexileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexileixingVO;
import com.entity.view.XuexileixingView;


/**
 * 学习类型
 * 
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
public interface XuexileixingDao extends BaseMapper<XuexileixingEntity> {
	
	List<XuexileixingVO> selectListVO(@Param("ew") Wrapper<XuexileixingEntity> wrapper);
	
	XuexileixingVO selectVO(@Param("ew") Wrapper<XuexileixingEntity> wrapper);
	
	List<XuexileixingView> selectListView(@Param("ew") Wrapper<XuexileixingEntity> wrapper);

	List<XuexileixingView> selectListView(Pagination page,@Param("ew") Wrapper<XuexileixingEntity> wrapper);

	
	XuexileixingView selectView(@Param("ew") Wrapper<XuexileixingEntity> wrapper);
	

}
