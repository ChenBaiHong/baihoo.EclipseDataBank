package com.baihoo.mybatis.pojoDto;

import java.util.Date;

public class BhCateDto {
	/**
	 * @param id 						唯一识别主键
	 * @param parentCate		父级类
	 * @param topCate			隶属祖宗类
	 * @param name 				分类名称
	 * @param layer 				分类层级
	 * @param updateTime 	最后更新时间
	 * @param createTime 		创建时间
	 */
	private String id;	
	private BhCateDto parentCateDto;	
	private BhCateDto topCateDto;		
	private String name;	
	private String layer;	
	private Date updateTime;	
	private Date createTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BhCateDto getParentCateDto() {
		return parentCateDto;
	}
	public void setParentCateDto(BhCateDto parentCateDto) {
		this.parentCateDto = parentCateDto;
	}
	public BhCateDto getTopCateDto() {
		return topCateDto;
	}
	public void setTopCateDto(BhCateDto topCateDto) {
		this.topCateDto = topCateDto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
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
		return "BhCateDto [id=" + id + ", parentCateDto=" + parentCateDto + ", topCateDto=" + topCateDto + ", name="
				+ name + ", layer=" + layer + ", updateTime=" + updateTime + ", createTime=" + createTime + "]";
	}

}
