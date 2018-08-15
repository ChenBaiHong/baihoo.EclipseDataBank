package com.baihoo.mybatis.pojoDto;

import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_product </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhProduct.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 11:52:20
 */
public class BhProductDto {
	/**
	 * @param id						唯一识别主键
	 * @param name				产品名称
	 * @param price					价格
	 * @param bhCate 			关联分类 ， 一个商品关联它的分类 ， 一对一
	 * @param bhBrand 			关联品牌 ， 一个商品关联它的品牌，一对一
	 * @param createTime		创建时间
	 * @param updateTime		最后更新时间
	 */
	private String id;	
	private String name;	
	private Double price;	
	private BhCateDto bhCateDto; 
	private BhBrandDto bhBrandDto; 
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public BhCateDto getBhCateDto() {
		return bhCateDto;
	}
	public void setBhCateDto(BhCateDto bhCateDto) {
		this.bhCateDto = bhCateDto;
	}
	public BhBrandDto getBhBrandDto() {
		return bhBrandDto;
	}
	public void setBhBrandDto(BhBrandDto bhBrandDto) {
		this.bhBrandDto = bhBrandDto;
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
		return "BhProductDto [id=" + id + ", name=" + name + ", price=" + price + ", bhCateDto=" + bhCateDto
				+ ", bhBrandDto=" + bhBrandDto + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	

}

