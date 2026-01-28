package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学习天地
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
@TableName("xuexitiandi")
public class XuexitiandiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexitiandiEntity() {
		
	}
	
	public XuexitiandiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 学习标题
	 */
					
	private String xuexibiaoti;
	
	/**
	 * 学习类型
	 */
					
	private String xuexileixing;
	
	/**
	 * 学习标签
	 */
					
	private String xuexibiaoqian;
	
	/**
	 * 学习视频
	 */
					
	private String xuexishipin;
	
	/**
	 * 学习内容
	 */
					
	private String xuexineirong;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 学习封面
	 */
					
	private String xuexifengmian;
	
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
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学习标题
	 */
	public void setXuexibiaoti(String xuexibiaoti) {
		this.xuexibiaoti = xuexibiaoti;
	}
	/**
	 * 获取：学习标题
	 */
	public String getXuexibiaoti() {
		return xuexibiaoti;
	}
	/**
	 * 设置：学习类型
	 */
	public void setXuexileixing(String xuexileixing) {
		this.xuexileixing = xuexileixing;
	}
	/**
	 * 获取：学习类型
	 */
	public String getXuexileixing() {
		return xuexileixing;
	}
	/**
	 * 设置：学习标签
	 */
	public void setXuexibiaoqian(String xuexibiaoqian) {
		this.xuexibiaoqian = xuexibiaoqian;
	}
	/**
	 * 获取：学习标签
	 */
	public String getXuexibiaoqian() {
		return xuexibiaoqian;
	}
	/**
	 * 设置：学习视频
	 */
	public void setXuexishipin(String xuexishipin) {
		this.xuexishipin = xuexishipin;
	}
	/**
	 * 获取：学习视频
	 */
	public String getXuexishipin() {
		return xuexishipin;
	}
	/**
	 * 设置：学习内容
	 */
	public void setXuexineirong(String xuexineirong) {
		this.xuexineirong = xuexineirong;
	}
	/**
	 * 获取：学习内容
	 */
	public String getXuexineirong() {
		return xuexineirong;
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
	 * 设置：学习封面
	 */
	public void setXuexifengmian(String xuexifengmian) {
		this.xuexifengmian = xuexifengmian;
	}
	/**
	 * 获取：学习封面
	 */
	public String getXuexifengmian() {
		return xuexifengmian;
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
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
