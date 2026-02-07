package com.entity.view;

import com.entity.ToptenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 十大成交股
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
@TableName("topten")
public class ToptenView  extends ToptenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ToptenView(){
	}
 
 	public ToptenView(ToptenEntity toptenEntity){
 	try {
			BeanUtils.copyProperties(this, toptenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
