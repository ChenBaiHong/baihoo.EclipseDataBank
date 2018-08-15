package com.baihoo.action;

import java.util.ArrayList;
import java.util.List;

import com.baihoo.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

public class OgnlDemo6Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Product> ps;

	public List<Product> getPs() {
		return ps;
	}

	public void setPs(List<Product> ps) {
		this.ps = ps;
	}

	@Override
	public String execute() throws Exception {

		// 对ps进行赋值
		ps = new ArrayList<Product>();

		ps.add(new Product("电视机", 1800, 100));
		ps.add(new Product("洗衣机", 800, 10));
		ps.add(new Product("空调", 3800, 100));

		return SUCCESS;
	}
}
