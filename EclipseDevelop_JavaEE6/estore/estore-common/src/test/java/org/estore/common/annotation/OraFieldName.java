package org.estore.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 *
 *<p> 项目名称：baiHoo 电子商城</p>
 *<p>类名称:OraFieldName.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月8日下午12:52:04
 */
@Retention(RetentionPolicy.RUNTIME) //运行时加载
@Target(ElementType.FIELD) //注解类型适用类
public @interface OraFieldName {
	public String fieldName();
}
