package com.baihoo.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_user </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhUser.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 11:52:20
 */
public class BhUser implements Serializable{
	/**
	 * @param id				唯一识别主键
	 * @param username	用户名称
	 * @param password	用户密码
	 * @param address	地址
	 * @param birth			生日
	 * @param sex			性别
	 * @param updateTime		最后更新时间
	 * @param createTime		创建时间
	 */
	private String id;	
	private String username;	
	private String password;	
	private String address;	
	private Date birth;	
	private String sex;	
	private Date updateTime;	
	private Date createTime;	

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setBirth(Date birth){
		this.birth=birth;
	}
	public Date getBirth(){
		return birth;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
}

