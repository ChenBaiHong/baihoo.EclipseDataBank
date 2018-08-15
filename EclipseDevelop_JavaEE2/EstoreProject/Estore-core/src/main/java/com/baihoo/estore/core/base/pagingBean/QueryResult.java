package com.baihoo.estore.core.base.pagingBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: QueryResult
 * @Description: 查詢結果
 * @author: Administrator
 * @date: 2018年7月29日 下午4:37:43
 * @param <T>
 */
public class QueryResult<T> {
	private List<T> list = new ArrayList<T>();
	
	private int totalRecord;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}


}
