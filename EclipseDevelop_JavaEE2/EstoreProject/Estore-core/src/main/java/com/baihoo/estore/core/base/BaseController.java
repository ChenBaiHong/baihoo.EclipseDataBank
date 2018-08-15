package com.baihoo.estore.core.base;

import org.springframework.stereotype.Component;

/**
 * 抽取页面关于action对象基本的共同通用的方法
 * 
 * @author 陈柏宏
 *
 */
@Component
public class BaseController {
	
	
	public Integer currentPage = 1;				//默认分页的页面，特指当前前页，默认当前页是1
	public Integer pageDataCount = 6;			//默认分页页面的数据个数
	public Integer totalPage;					//总共多少页
	public Integer totalData;					//总共多少数据
	public Integer[] pagination; 				//多数据分页页码数组
	
	/**
	 * 根据总共数据的数量算出总共多少页
	 * @param totalData  总共数据的数量
	 */
	public void setTotalData(Integer totalData) {
		this.totalData = totalData;
		this.totalPage = (totalData + pageDataCount -1) / pageDataCount;//在这里除数包含小数点会向下取整
	}
	/**
	 * 
	 * @return pagination 分页页码的数组
	 */
	public Integer[] getPagination() {
		int startPage;
		int endPage;
		if(totalPage==null){//没有数据就返回一个空初始数组容器
			return pagination = new Integer[1];
		}
		if(totalPage<10){
			startPage=1;
			endPage=totalPage;
		}else{
			startPage=currentPage-4;
			endPage=currentPage+5;
			if(startPage<1){
				startPage=1;
				endPage=10;
			}
			if(endPage>totalPage){
				endPage=totalPage;
				startPage=totalPage-9;
			}
		}
		pagination = new Integer[endPage-startPage+1]; //防止出现空指针异常，10-1+1
		int index=0;
		for(;startPage<=endPage;startPage++){
			pagination[index++]=startPage;
		}
		return pagination;
	}
	/**
	 * 
	 * @return 返回当前action的名字
	 * 		DepAction ->dep
	 * 		EmpAction ->emp
	 */
	public String getControllerName(){
		//BaseAction ->base
		String controllerName = this.getClass().getSimpleName();
		//Base ->base
		String temp = controllerName.substring(0, controllerName.length()-6);
		return temp.substring(0,1).toLowerCase()+temp.substring(1);
	}
}
