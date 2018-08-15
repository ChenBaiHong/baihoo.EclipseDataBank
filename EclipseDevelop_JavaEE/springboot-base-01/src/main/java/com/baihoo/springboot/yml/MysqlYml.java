package com.baihoo.springboot.yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * yml自定义文件中的数据获取
 * @author Administrator
 *
 */
@Component
public class MysqlYml {
	
	@Value("${mysql.username}")
	private String username;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	@Value("${mysql.url}")
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
		return "MysqlYml [username=" + username + ", password=" + password + ", driver=" + driver + ", url=" + url
				+ "]";
	}
	
}
