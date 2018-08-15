package com.baiHoo.web.system.pojo.base;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 *<p>Title: TSDocument</p>
 *<p>Description: 
 *
 *	文档下载,新闻,法规表
 *
 *</p>
 *<p>Company: www.baiHoo.com</p> 
 * @author baiHoo.chen
 * @date May 8, 2017
 */
@SuppressWarnings("all")
@Entity
@Table(name = "t_s_document")
@PrimaryKeyJoinColumn(name = "id")
public class TSDocument extends TSAttachment implements java.io.Serializable {
	private String documentTitle;//文档标题
	private byte[] pictureIndex;//焦点图导航
	private Short documentState;//状态：0未发布，1已发布
	private Short showHome;//是否首页显示
	private TSType TSType;//文档分类
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeid")
	public TSType getTSType() {
		return TSType;
	}
	public void setTSType(TSType tSType) {
		TSType = tSType;
	}
	@Column(name = "documenttitle", length = 100)
	public String getDocumentTitle() {
		return documentTitle;
	}
	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}
	@Column(name = "pictureindex",length=3000)
	public byte[] getPictureIndex() {
		return pictureIndex;
	}
	public void setPictureIndex(byte[] pictureIndex) {
		this.pictureIndex = pictureIndex;
	}
	@Column(name = "documentstate")
	public Short getDocumentState() {
		return documentState;
	}
	public void setDocumentState(Short documentState) {
		this.documentState = documentState;
	}
	@Column(name = "showhome")
	public Short getShowHome() {
		return showHome;
	}
	public void setShowHome(Short showHome) {
		this.showHome = showHome;
	}
}