package com.baihoo.mybatis.pojo;

import java.util.Date;

/**
 * 
 * 
 * 	@description pojo持久化实体对象卖家信息表
 * 
 * @author Administrator
 *
 */
public class SellerInfo {
	/**
	 * @param id 数据唯一识别ID
	 * @param username 用户名称
	 * @param password 用户密码
	 * @param openid 微信openid
	 * @param createTime 创建时间
	 * @param updateTime 修改时间
	 */
	private Integer id;
	private String username;
	private String password;
	private String openid;
	private Date createTime;
	private Date updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "SellerInfo [id=" + id + ", username=" + username + ", password=" + password + ", openid=" + openid
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
