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

import com.entity.DiscussxuexitiandiEntity;
import com.entity.view.DiscussxuexitiandiView;

import com.service.DiscussxuexitiandiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学习天地评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-06 20:42:25
 */
@RestController
@RequestMapping("/discussxuexitiandi")
public class DiscussxuexitiandiController {
    @Autowired
    private DiscussxuexitiandiService discussxuexitiandiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussxuexitiandiEntity discussxuexitiandi,
		HttpServletRequest request){
        EntityWrapper<DiscussxuexitiandiEntity> ew = new EntityWrapper<DiscussxuexitiandiEntity>();

		PageUtils page = discussxuexitiandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuexitiandi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussxuexitiandiEntity discussxuexitiandi, 
		HttpServletRequest request){
        EntityWrapper<DiscussxuexitiandiEntity> ew = new EntityWrapper<DiscussxuexitiandiEntity>();

		PageUtils page = discussxuexitiandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuexitiandi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussxuexitiandiEntity discussxuexitiandi){
       	EntityWrapper<DiscussxuexitiandiEntity> ew = new EntityWrapper<DiscussxuexitiandiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussxuexitiandi, "discussxuexitiandi")); 
        return R.ok().put("data", discussxuexitiandiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussxuexitiandiEntity discussxuexitiandi){
        EntityWrapper< DiscussxuexitiandiEntity> ew = new EntityWrapper< DiscussxuexitiandiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussxuexitiandi, "discussxuexitiandi")); 
		DiscussxuexitiandiView discussxuexitiandiView =  discussxuexitiandiService.selectView(ew);
		return R.ok("查询学习天地评论表成功").put("data", discussxuexitiandiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussxuexitiandiEntity discussxuexitiandi = discussxuexitiandiService.selectById(id);
        return R.ok().put("data", discussxuexitiandi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussxuexitiandiEntity discussxuexitiandi = discussxuexitiandiService.selectById(id);
        return R.ok().put("data", discussxuexitiandi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussxuexitiandiEntity discussxuexitiandi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussxuexitiandi);
        discussxuexitiandiService.insert(discussxuexitiandi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussxuexitiandiEntity discussxuexitiandi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussxuexitiandi);
        discussxuexitiandiService.insert(discussxuexitiandi);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussxuexitiandiEntity discussxuexitiandi = discussxuexitiandiService.selectOne(new EntityWrapper<DiscussxuexitiandiEntity>().eq("", username));
        return R.ok().put("data", discussxuexitiandi);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussxuexitiandiEntity discussxuexitiandi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussxuexitiandi);
        discussxuexitiandiService.updateById(discussxuexitiandi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussxuexitiandiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussxuexitiandiEntity discussxuexitiandi, HttpServletRequest request,String pre){
        EntityWrapper<DiscussxuexitiandiEntity> ew = new EntityWrapper<DiscussxuexitiandiEntity>();
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
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussxuexitiandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuexitiandi), params), params));
        return R.ok().put("data", page);
    }










}
