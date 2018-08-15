package com.baihoo.action;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	// 在action类中需要声明三个属性
	private List<File> upload;
	private List<String> uploadContentType;
	private List<String> uploadFileName;

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	@Override
	public String execute() throws Exception {

		for (int i = 0; i < upload.size(); i++) {
			
			
			System.out.println("上传文件的类型:" + uploadContentType.get(i));
			System.out.println("上传文件的名称:" + uploadFileName.get(i));

			// 完成文件上传.
			FileUtils.copyFile(upload.get(i), new File("d:/upload", uploadFileName.get(i)));
		}
		return null;
	}

}
