package com.baihoo.estore.core.base;

import java.util.List;

/**
 * 
 * BaseUser 通用的功能<br>
 * 
 * @ClassName: BaseUser
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 上午11:35:40
 */
public interface BaseUser<P>{
	/**
	 * 每个用户的主键<br>
	 * 
	 * @return
	 */
	public String getId() ;
	/**
	 * 每个用户的登陆名<br>
	 * @return
	 */
	public String getUsername();
	/**
	 * 用户的登陆密码<br>
	 * @return
	 */
	public String getPassword();
	/**
	 * 泛型 P 表示权限类<br>
	 * 获取登陆用户的权限<br>
	 * @return
	 */
	public List<P> getPermissions();
}
