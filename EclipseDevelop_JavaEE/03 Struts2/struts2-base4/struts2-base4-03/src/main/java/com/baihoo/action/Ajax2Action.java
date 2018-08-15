package com.baihoo.action;

import java.util.ArrayList;
import java.util.List;

import com.baihoo.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

public class Ajax2Action extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Product> ps;

	private Product p;

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public List<Product> getPs() {
		return ps;
	}

	public void setPs(List<Product> ps) {
		this.ps = ps;
	}

	@Override
	public String execute() throws Exception {

		ps = new ArrayList<Product>();
		ps.add(new Product(1, "洗衣机", 1800, 10));

		ps.add(new Product(2, "电视机", 2800, 20));
		ps.add(new Product(3, "缝纫机", 800, 50));

		p = new Product(3, "缝纫机", 800, 50);

		return SUCCESS;
	}
}
