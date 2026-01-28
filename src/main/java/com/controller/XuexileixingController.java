package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XuexileixingEntity;
import com.entity.view.XuexileixingView;

import com.service.XuexileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学习类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
@RestController
@RequestMapping("/xuexileixing")
public class XuexileixingController {
    @Autowired
    private XuexileixingService xuexileixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexileixingEntity xuexileixing,
		HttpServletRequest request){
        EntityWrapper<XuexileixingEntity> ew = new EntityWrapper<XuexileixingEntity>();

		PageUtils page = xuexileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexileixingEntity xuexileixing, 
		HttpServletRequest request){
        EntityWrapper<XuexileixingEntity> ew = new EntityWrapper<XuexileixingEntity>();

		PageUtils page = xuexileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexileixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexileixingEntity xuexileixing){
       	EntityWrapper<XuexileixingEntity> ew = new EntityWrapper<XuexileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexileixing, "xuexileixing")); 
        return R.ok().put("data", xuexileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexileixingEntity xuexileixing){
        EntityWrapper< XuexileixingEntity> ew = new EntityWrapper< XuexileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexileixing, "xuexileixing")); 
		XuexileixingView xuexileixingView =  xuexileixingService.selectView(ew);
		return R.ok("查询学习类型成功").put("data", xuexileixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexileixingEntity xuexileixing = xuexileixingService.selectById(id);
        return R.ok().put("data", xuexileixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexileixingEntity xuexileixing = xuexileixingService.selectById(id);
        return R.ok().put("data", xuexileixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexileixingEntity xuexileixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexileixing);
        xuexileixingService.insert(xuexileixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexileixingEntity xuexileixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexileixing);
        xuexileixingService.insert(xuexileixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexileixingEntity xuexileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexileixing);
        xuexileixingService.updateById(xuexileixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
