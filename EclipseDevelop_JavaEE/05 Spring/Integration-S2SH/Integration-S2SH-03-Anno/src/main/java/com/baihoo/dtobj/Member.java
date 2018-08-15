package com.baihoo.dtobj;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.LockModeType;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 成员类
 * @author Administrator
 *
 */
@NamedQueries({
	@NamedQuery(name = "findByNameIsHQL", query = "from Member where meName like ? ", lockMode = LockModeType.OPTIMISTIC)
})
@SqlResultSetMapping(name = "all_fields", entities = {
		@EntityResult(entityClass =com.baihoo.dtobj.Member.class, fields = {
				@FieldResult(name = "id", column = "ID"), 
				@FieldResult(name = "meName", column = "ME_NAME"),
				@FieldResult(name = "meAge", column = "ME_AGE"), 
				@FieldResult(name = "meNo", column = "ME_NO"),
				@FieldResult(name = "meDesc", column = "ME_DESC"),
				@FieldResult(name = "birthDate", column = "BIRTH_DATE"),
				@FieldResult(name = "updateTime", column = "UPDATE_TIME"),
				@FieldResult(name = "createTime", column = "CREATE_TIME"),
				@FieldResult(name = "version", column = "VERSION") 
				}) 
		})
@NamedNativeQueries({
		@NamedNativeQuery(name = "findByNameIsSQL", query = "SELECT * FROM BH_MEMBER B WHERE B.ME_NAME LIKE ? ", resultSetMapping = "all_fields")
})

@Entity
@Table(name="BH_MEMBER")
@DynamicUpdate
public class Member  implements Serializable{
	/**
	 * @param id 组员唯一识别ID
	 * @param meName 成员名称
	 * @param meAge 成员年纪
	 * @param meNo 成员编号
	 * @param meDesc  成员描述
	 * @param birthDate 成员出生日期
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID" )
	private Integer id;
	@Column(name="ME_NAME" , length=225)
	private String meName;
	@Column(name="ME_AGE")
	private Integer meAge;
	@Column(name="ME_NO", length=32)
	private String meNo;
	@Lob
	@Column(name="ME_DESC")
	private String meDesc;
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_TIME")
	private Date updateTime;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME")
	private Date createTime;
	@Version
	@Column(name="VERSION")
	private Integer version;
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
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", meName=" + meName + ", meAge=" + meAge + ", meNo=" + meNo + ", meDesc=" + meDesc
				+ ", birthDate=" + birthDate + ", updateTime=" + updateTime + ", createTime=" + createTime
				+ ", version=" + version + "]";
	}
	

}
