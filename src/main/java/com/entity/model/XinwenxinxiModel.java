package com.entity.model;

import com.entity.XinwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 新闻信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
public class XinwenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 新闻类别
	 */
	
	private String xinwenleibie;
		
	/**
	 * 新闻来源
	 */
	
	private String xinwenlaiyuan;
		
	/**
	 * 新闻标签
	 */
	
	private String xinwenbiaoqian;
		
	/**
	 * 新闻视频
	 */
	
	private String xinwenshipin;
		
	/**
	 * 新闻内容
	 */
	
	private String xinwenneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 新闻封面
	 */
	
	private String xinwenfengmian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：新闻类别
	 */
	 
	public void setXinwenleibie(String xinwenleibie) {
		this.xinwenleibie = xinwenleibie;
	}
	
	/**
	 * 获取：新闻类别
	 */
	public String getXinwenleibie() {
		return xinwenleibie;
	}
				
	
	/**
	 * 设置：新闻来源
	 */
	 
	public void setXinwenlaiyuan(String xinwenlaiyuan) {
		this.xinwenlaiyuan = xinwenlaiyuan;
	}
	
	/**
	 * 获取：新闻来源
	 */
	public String getXinwenlaiyuan() {
		return xinwenlaiyuan;
	}
				
	
	/**
	 * 设置：新闻标签
	 */
	 
	public void setXinwenbiaoqian(String xinwenbiaoqian) {
		this.xinwenbiaoqian = xinwenbiaoqian;
	}
	
	/**
	 * 获取：新闻标签
	 */
	public String getXinwenbiaoqian() {
		return xinwenbiaoqian;
	}
				
	
	/**
	 * 设置：新闻视频
	 */
	 
	public void setXinwenshipin(String xinwenshipin) {
		this.xinwenshipin = xinwenshipin;
	}
	
	/**
	 * 获取：新闻视频
	 */
	public String getXinwenshipin() {
		return xinwenshipin;
	}
				
	
	/**
	 * 设置：新闻内容
	 */
	 
	public void setXinwenneirong(String xinwenneirong) {
		this.xinwenneirong = xinwenneirong;
	}
	
	/**
	 * 获取：新闻内容
	 */
	public String getXinwenneirong() {
		return xinwenneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：新闻封面
	 */
	 
	public void setXinwenfengmian(String xinwenfengmian) {
		this.xinwenfengmian = xinwenfengmian;
	}
	
	/**
	 * 获取：新闻封面
	 */
	public String getXinwenfengmian() {
		return xinwenfengmian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
