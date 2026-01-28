package com.entity.view;

import com.entity.XuexileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 学习类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
@TableName("xuexileixing")
public class XuexileixingView  extends XuexileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexileixingView(){
	}
 
 	public XuexileixingView(XuexileixingEntity xuexileixingEntity){
 	try {
			BeanUtils.copyProperties(this, xuexileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
