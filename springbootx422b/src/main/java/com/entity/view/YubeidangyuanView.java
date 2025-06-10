package com.entity.view;

import com.entity.YubeidangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预备党员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
@TableName("yubeidangyuan")
public class YubeidangyuanView  extends YubeidangyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YubeidangyuanView(){
	}
 
 	public YubeidangyuanView(YubeidangyuanEntity yubeidangyuanEntity){
 	try {
			BeanUtils.copyProperties(this, yubeidangyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
