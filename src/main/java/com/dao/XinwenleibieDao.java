package com.dao;

import com.entity.XinwenleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenleibieVO;
import com.entity.view.XinwenleibieView;


/**
 * 新闻类别
 * 
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
public interface XinwenleibieDao extends BaseMapper<XinwenleibieEntity> {
	
	List<XinwenleibieVO> selectListVO(@Param("ew") Wrapper<XinwenleibieEntity> wrapper);
	
	XinwenleibieVO selectVO(@Param("ew") Wrapper<XinwenleibieEntity> wrapper);
	
	List<XinwenleibieView> selectListView(@Param("ew") Wrapper<XinwenleibieEntity> wrapper);

	List<XinwenleibieView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenleibieEntity> wrapper);

	
	XinwenleibieView selectView(@Param("ew") Wrapper<XinwenleibieEntity> wrapper);
	

}
