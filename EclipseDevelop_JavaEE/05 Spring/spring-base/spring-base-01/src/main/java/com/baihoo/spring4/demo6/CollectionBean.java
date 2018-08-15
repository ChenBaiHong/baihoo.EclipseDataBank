package com.baihoo.spring4.demo6;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Spring 集合属性注入
 * @author Administrator
 *
 */
public class CollectionBean {
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	private Properties properties;
	
	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionBean [list=" + list + ", set=" + set + ", map=" + map
				+ ", properties=" + properties + "]";
	}


}
