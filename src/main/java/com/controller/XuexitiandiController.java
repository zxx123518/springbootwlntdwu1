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

import com.entity.XuexitiandiEntity;
import com.entity.view.XuexitiandiView;

import com.service.XuexitiandiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 学习天地
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
@RestController
@RequestMapping("/xuexitiandi")
public class XuexitiandiController {
    @Autowired
    private XuexitiandiService xuexitiandiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexitiandiEntity xuexitiandi,
		HttpServletRequest request){
        if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
            xuexitiandi.setUserid((Long)request.getSession().getAttribute("userId"));
        }
        EntityWrapper<XuexitiandiEntity> ew = new EntityWrapper<XuexitiandiEntity>();

		PageUtils page = xuexitiandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexitiandi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexitiandiEntity xuexitiandi, 
		HttpServletRequest request){
        EntityWrapper<XuexitiandiEntity> ew = new EntityWrapper<XuexitiandiEntity>();

		PageUtils page = xuexitiandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexitiandi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexitiandiEntity xuexitiandi){
       	EntityWrapper<XuexitiandiEntity> ew = new EntityWrapper<XuexitiandiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexitiandi, "xuexitiandi")); 
        return R.ok().put("data", xuexitiandiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexitiandiEntity xuexitiandi){
        EntityWrapper< XuexitiandiEntity> ew = new EntityWrapper< XuexitiandiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexitiandi, "xuexitiandi")); 
		XuexitiandiView xuexitiandiView =  xuexitiandiService.selectView(ew);
		return R.ok("查询学习天地成功").put("data", xuexitiandiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexitiandiEntity xuexitiandi = xuexitiandiService.selectById(id);
		xuexitiandi.setClicknum(xuexitiandi.getClicknum()+1);
		xuexitiandi.setClicktime(new Date());
		xuexitiandiService.updateById(xuexitiandi);
        xuexitiandi = xuexitiandiService.selectView(new EntityWrapper<XuexitiandiEntity>().eq("id", id));
        return R.ok().put("data", xuexitiandi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexitiandiEntity xuexitiandi = xuexitiandiService.selectById(id);
		xuexitiandi.setClicknum(xuexitiandi.getClicknum()+1);
		xuexitiandi.setClicktime(new Date());
		xuexitiandiService.updateById(xuexitiandi);
        xuexitiandi = xuexitiandiService.selectView(new EntityWrapper<XuexitiandiEntity>().eq("id", id));
        return R.ok().put("data", xuexitiandi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        XuexitiandiEntity xuexitiandi = xuexitiandiService.selectById(id);
        if(type.equals("1")) {
        	xuexitiandi.setThumbsupnum(xuexitiandi.getThumbsupnum()+1);
        } else {
        	xuexitiandi.setCrazilynum(xuexitiandi.getCrazilynum()+1);
        }
        xuexitiandiService.updateById(xuexitiandi);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexitiandiEntity xuexitiandi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexitiandi);
    	xuexitiandi.setUserid((Long)request.getSession().getAttribute("userId"));
        xuexitiandiService.insert(xuexitiandi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexitiandiEntity xuexitiandi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexitiandi);
        xuexitiandiService.insert(xuexitiandi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexitiandiEntity xuexitiandi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexitiandi);
        xuexitiandiService.updateById(xuexitiandi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexitiandiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XuexitiandiEntity xuexitiandi, HttpServletRequest request,String pre){
        EntityWrapper<XuexitiandiEntity> ew = new EntityWrapper<XuexitiandiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = xuexitiandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexitiandi), params), params));
        return R.ok().put("data", page);
    }










}
