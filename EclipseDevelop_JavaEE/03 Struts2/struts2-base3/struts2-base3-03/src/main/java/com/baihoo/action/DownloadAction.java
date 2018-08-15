package com.baihoo.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.baihoo.utils.DownloadUtils;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {

	private String filename; // 要下载文件的名称

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	// 设置下载文件mimeType类型
	public String getContentType() {

		String mimeType = ServletActionContext.getServletContext().getMimeType(
				filename);
		return mimeType;
	}

	// 获取下载文件名称
	public String getDownloadFileName() throws UnsupportedEncodingException {

		return DownloadUtils.getDownloadFileName(ServletActionContext
				.getRequest().getHeader("user-agent"), filename);

	}

	public InputStream getInputStream() throws FileNotFoundException,
			UnsupportedEncodingException {

		filename = new String(filename.getBytes("iso8859-1"), "utf-8"); // 解决中文名称乱码.

		FileInputStream fis = new FileInputStream("d:/upload/" + filename);
		return fis;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("进行下载....");
		return SUCCESS;
	}

}
