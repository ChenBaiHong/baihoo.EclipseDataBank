package com.baihoo.dto;

import java.util.Date;

/**
 * 成员类
 * @author Administrator
 *
 */
public class MemberDto {
	/**
	 * @param id 组员唯一识别ID
	 * @param meName 成员名称
	 * @param meAge 成员年纪
	 * @param meNo 成员编号
	 * @param meDesc  成员描述
	 * @param birthDate 成员出生日期
	 */

	private Integer id;

	private String meName;

	private Integer meAge;

	private String meNo;

	private String meDesc;
	
	private Date birthDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
