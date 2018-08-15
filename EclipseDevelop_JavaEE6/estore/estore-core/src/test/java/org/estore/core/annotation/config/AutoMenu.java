package org.estore.core.annotation.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * 
 *
 *<p> 项目名称：baiHoo 电子商城</p>
 *<p>类名称:AutoMenu.java </p>
 *<p>类说明: 
 * 		菜单注释标签
 * 		系统启动自动加载菜单配置
 * 		Class级别
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月4日上午9:38:51
 */
@Retention(RetentionPolicy.RUNTIME) //运行时加载
@Target(ElementType.TYPE) //注解类型适用类
public @interface AutoMenu {
	/**
	 * 菜单名称
	 * @return
	 */
	public String name();
	/**
	 * 等级
	 * @return
	 */
	public String level() default "0";
	/**
	 * 菜单地址
	 * @return
	 */
	public String url();
	
	/**
	 * 图标
	 * @return
	 */
	public String icon() default "402880e740ec1fd70140ec2064ec0002";
	/**
	 * 顺序
	 * @return
	 */
	public int order() default 0;
}
