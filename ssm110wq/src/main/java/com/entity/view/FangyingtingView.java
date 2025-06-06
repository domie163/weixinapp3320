package com.entity.view;

import com.entity.FangyingtingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 放映厅
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 11:16:43
 */
@TableName("fangyingting")
public class FangyingtingView  extends FangyingtingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangyingtingView(){
	}
 
 	public FangyingtingView(FangyingtingEntity fangyingtingEntity){
 	try {
			BeanUtils.copyProperties(this, fangyingtingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
