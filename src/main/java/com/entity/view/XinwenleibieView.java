package com.entity.view;

import com.entity.XinwenleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 新闻类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-06 20:42:24
 */
@TableName("xinwenleibie")
public class XinwenleibieView  extends XinwenleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwenleibieView(){
	}
 
 	public XinwenleibieView(XinwenleibieEntity xinwenleibieEntity){
 	try {
			BeanUtils.copyProperties(this, xinwenleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
