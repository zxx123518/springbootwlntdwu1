package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexileixingView;


/**
 * 学习类型
 *
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
public interface XuexileixingService extends IService<XuexileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexileixingVO> selectListVO(Wrapper<XuexileixingEntity> wrapper);
   	
   	XuexileixingVO selectVO(@Param("ew") Wrapper<XuexileixingEntity> wrapper);
   	
   	List<XuexileixingView> selectListView(Wrapper<XuexileixingEntity> wrapper);
   	
   	XuexileixingView selectView(@Param("ew") Wrapper<XuexileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexileixingEntity> wrapper);

   	

}

