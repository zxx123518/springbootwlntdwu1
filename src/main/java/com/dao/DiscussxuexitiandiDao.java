package com.dao;

import com.entity.DiscussxuexitiandiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexitiandiVO;
import com.entity.view.DiscussxuexitiandiView;


/**
 * 学习天地评论表
 * 
 * @author 
 * @email 
 * @date 2024-05-06 20:42:25
 */
public interface DiscussxuexitiandiDao extends BaseMapper<DiscussxuexitiandiEntity> {
	
	List<DiscussxuexitiandiVO> selectListVO(@Param("ew") Wrapper<DiscussxuexitiandiEntity> wrapper);
	
	DiscussxuexitiandiVO selectVO(@Param("ew") Wrapper<DiscussxuexitiandiEntity> wrapper);
	
	List<DiscussxuexitiandiView> selectListView(@Param("ew") Wrapper<DiscussxuexitiandiEntity> wrapper);

	List<DiscussxuexitiandiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexitiandiEntity> wrapper);

	
	DiscussxuexitiandiView selectView(@Param("ew") Wrapper<DiscussxuexitiandiEntity> wrapper);
	

}
