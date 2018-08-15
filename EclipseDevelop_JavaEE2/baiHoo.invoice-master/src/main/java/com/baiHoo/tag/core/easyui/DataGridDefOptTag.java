package com.baiHoo.tag.core.easyui;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 
 *<p>Title: DataGridDefOptTag</p>
 *<p>Description: 
 *
 *	类描述：列表默认操作项标签
 *
 *</p>
 *<p>Company: www.baiHoo.com</p> 
 * @author baiHoo.chen
 * @date 2017年5月2日
 */

@SuppressWarnings("all")
public class DataGridDefOptTag extends TagSupport {
	protected String url;
	protected String title;
	private String exp;//判断链接是否显示的表达式
	private String operationCode;//按钮的操作Code
	public int doStartTag() throws JspTagException {
		return EVAL_PAGE;
	}
	public int doEndTag() throws JspTagException {
		Tag t = findAncestorWithClass(this, DataGridTag.class);
		DataGridTag parent = (DataGridTag) t;
		parent.setDefUrl(url, title, exp,operationCode);
		return EVAL_PAGE;
	}
	
	public void setExp(String exp) {
		this.exp = exp;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}
	
}