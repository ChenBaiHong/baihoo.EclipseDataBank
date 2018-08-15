package com.baihoo.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 模擬銀行賬戶
 * 
 * @author Administrator
 *
 */
@DynamicUpdate
@Entity
@Table(name="BH_ACCOUNT")
public class BhAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param id 主鍵
	 * @param accountName 賬戶名稱
	 * @param money 賬戶資金
	 * @param updateTime 最後更新時間
	 * @param  createTime 創建時間
	 */
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="ACCOUNT_NAME" , length=50)
	private String accountName;
	@Column(name="MONEY" ,precision=4)
	private Double money;
	@Column(name="UPDATE_TIME")
	private Date updateTime;
	@Column(name="CRATE_TIME")
	private Date createTime;
	
	
	public BhAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "BhAccount [id=" + id + ", accountName=" + accountName + ", money=" + money + ", updateTime="
				+ updateTime + ", createTime=" + createTime + "]";
	}
	
}
