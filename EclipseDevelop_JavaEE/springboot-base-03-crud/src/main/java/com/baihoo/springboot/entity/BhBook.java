package com.baihoo.springboot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 数据表关联的实体表
 * @author Administrator
 */
@Entity
@Table(name="BH_BOOK")
public class BhBook implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param id					主键
	 * @param author			作者
	 * @param bookName	书名
	 * @param pubDate			发布日期
	 * @param sellPrice 		售价
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	@Column(name="AUTHOR" , length=25)
	private String  author;
	@Column(name="BOOK_NAME" , length=125)
	private String bookName;
	@Column(name="PUB_DATE")
	private Date pubDate;
	@Column(name="SELL_PRICE" , precision=3)
	private Double sellPrice;
	
	public BhBook() {
		super();
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public Double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}
	@Override
	public String toString() {
		return "BhBook [id=" + id + ", author=" + author + ", bookName=" + bookName + ", pubDate=" + pubDate
				+ ", sellPrice=" + sellPrice + "]";
	}
	
}
