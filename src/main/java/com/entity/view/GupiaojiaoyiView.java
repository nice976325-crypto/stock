package com.entity.view;

import com.entity.GupiaojiaoyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 股票交易
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
@TableName("gupiaojiaoyi")
public class GupiaojiaoyiView  extends GupiaojiaoyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GupiaojiaoyiView(){
	}
 
 	public GupiaojiaoyiView(GupiaojiaoyiEntity gupiaojiaoyiEntity){
 	try {
			BeanUtils.copyProperties(this, gupiaojiaoyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
