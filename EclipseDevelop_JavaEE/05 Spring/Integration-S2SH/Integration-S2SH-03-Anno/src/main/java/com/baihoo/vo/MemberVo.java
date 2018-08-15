package com.baihoo.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 成员类
 * @author Administrator
 *
 */
public class MemberVo {
	/**
	 * @param meName 成员名称
	 * @param meAge 成员年纪
	 * @param meNo 成员编号
	 * @param meDesc  成员描述
	 * @param birthDate 成员出生日期
	 */
	
	@JsonProperty("成员名称")
	private String meName;
	@JsonProperty("成员年龄")
	private Integer meAge;
	@JsonProperty("成员编号")
	private String meNo;
	@JsonProperty("成员描述")
	private String meDesc;
	@JsonProperty("出生日期")
	private Date birthDate;

	public String getMeName() {
		return meName;
	}

	public void setMeName(String meName) {
		this.meName = meName;
	}

	public Integer getMeAge() {
		return meAge;
	}

	public void setMeAge(Integer meAge) {
		this.meAge = meAge;
	}

	public String getMeNo() {
		return meNo;
	}

	public void setMeNo(String meNo) {
		this.meNo = meNo;
	}

	public String getMeDesc() {
		return meDesc;
	}

	public void setMeDesc(String meDesc) {
		this.meDesc = meDesc;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
