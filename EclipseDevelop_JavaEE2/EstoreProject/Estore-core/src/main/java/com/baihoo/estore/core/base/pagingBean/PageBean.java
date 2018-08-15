package com.baihoo.estore.core.base.pagingBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PageBean<T> {
	
	/**
	 * @param 
	 */
	private List<T> list = new ArrayList<T>();//分页查询数库的管理员
	
	private Integer totalPage;//总页数
	
	private Integer totalRecord;//总记录数
	
	private Integer currentPage=1;//默认当前页是1
	
	private Integer pageSize=4;//默认网页大小是4条记录
	
	private Integer queryStartIndex;//数据库查询的开始下标
	
	private Integer[] pagingBar; //分頁碼，多少個
	
	private  Integer defaultBar =10; // 默认的页面分页的显示状态码
	
	public PageBean() {
		super();
	}
	/**
	 * 注意執行順序
	 * @param totalRecord
	 * @param currentPage
	 * @param pageSize
	 * @param defaultBar
	 */
	public PageBean(Integer totalRecord, Integer currentPage, Integer pageSize, Integer defaultBar_) {

		this.totalRecord = totalRecord;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		if(defaultBar_==null) {
			this.defaultBar=10;
		}else {
			this.defaultBar = defaultBar_;
		}
		this.getTotalPage();//先是總共多少頁
		this.getQueryStartIndex();//數據庫查詢下標
		this.getPagingBar();//分頁攔
	}
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Integer getTotalPage() {
		if(totalRecord%pageSize==0){
			this.totalPage=this.totalRecord/this.pageSize;
		}else{
			this.totalPage=this.totalRecord/this.pageSize+1;
		}
		return this.totalPage;
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getQueryStartIndex() {
		//从“0”开始显示3条数据
		//相当于     select name , type from customer limit 0,3;   中的“0”是开始数据查询的位置  currentPage=1
		//从“3”开始显示3条数据
		//以此类推  select name , type from customer limit 3,3;   中的“3”是开始数据查询的位置  currentPage=2
		//从“6”开始显示3条数据
		//以此类推  select name , type from customer limit 6,3;   中的“6”是开始数据查询的位置  currentPage=3
		this.queryStartIndex = (this.currentPage-1)*this.pageSize;
		return this.queryStartIndex;
	}
	public Integer getDefaultBar() {
		return defaultBar;
	}

	public void setDefaultBar(Integer defaultBar) {
		this.defaultBar = defaultBar;
	}
	
	//默认的页面分页的显示状态码
	public Integer[] getPagingBar() {
		Integer startPage;
		Integer endPage;
		Integer x;
		boolean isOdd=true;//默認是奇數爲真
		if(defaultBar%2==0) {//如果是偶數
			x = defaultBar>>1;
			isOdd=false;
		}else {//如果是基數
			x = defaultBar>>1;
		}
		if(totalPage<defaultBar){
			startPage=1;
			endPage=this.totalPage;
		}else{
			if(!isOdd){//不是奇數，是偶數
				startPage=this.currentPage-(x-1);
			}else {//是奇數
				startPage=this.currentPage-x;
			}
			endPage = this.currentPage+x;
			if(startPage<1){
				startPage=1;
				endPage=defaultBar;
			}
			if(endPage>this.totalPage){
				endPage=this.totalPage;
				startPage=this.totalPage-defaultBar-1;
			}
		}
		pagingBar = new Integer[endPage-startPage+1];//防止出现空指针异常，1-1+1
		Integer index=0;
		for(;startPage<=endPage;startPage++){
			pagingBar[index++]=startPage;
		}
		return pagingBar;
	}
	@Override
	public String toString() {
		return "PageBean [totalPage=" + totalPage + ", totalRecord=" + totalRecord + ", currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", queryStartIndex=" + queryStartIndex + ", pagingBar="
				+ Arrays.toString(pagingBar) + ", defaultBar=" + defaultBar + "]";
	}
	public static void main(String[] args) {
		//Integer totalRecord, Integer currentPage, Integer pageSize, Integer defaultBar
		//PageBean pageBean = new PageBean(100 , 5, 3 , 5);
		//System.out.println(pageBean);
		//System.out.println(Arrays.toString(pageBean.getPagingBar()));
	}
}
