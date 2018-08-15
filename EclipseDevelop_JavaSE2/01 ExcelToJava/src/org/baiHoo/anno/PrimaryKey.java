package org.baiHoo.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 
 *<p>类名称:PrimaryKey.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月17日
 */
@Retention(RetentionPolicy.RUNTIME) //运行时加载
@Target(ElementType.FIELD) //注解类型适用类
public @interface PrimaryKey {
	
}
