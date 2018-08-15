package com.baihoo.mybatis.pojoDto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_brand </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhBrand.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 11:52:20
 */
public class BhBrandDto implements Serializable{
	/**
	 * @param id					主键
	 * @param name			品牌名称
	 * @param description	品牌描述
	 * @param createTime
	 * @param updateTime
	 * @param 
	 */
	private String id;	
	private String name;	
	private String description;	
	private Date createTime;
	private Date updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "BhBrandDto [id=" + id + ", name=" + name + ", description=" + description + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

}

