package com.baihoo.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 读取自定义properties文件的配置
 * @author Administrator
 *
 */
@Component// 以组件的方式使用，使用的时候可以直接注入
@ConfigurationProperties(prefix="jdbc")// 用来指定properties配置文件中的key前缀
@PropertySource("classpath:db.properties")// 用来指定配置文件的位置
public class MysqProperties {
	private String username;
	private String password;
	private String driver;
	private String url;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "MysqProperties [username=" + username + ", password=" + password + ", driver=" + driver + ", url=" + url
				+ "]";
	}
	
	
}
