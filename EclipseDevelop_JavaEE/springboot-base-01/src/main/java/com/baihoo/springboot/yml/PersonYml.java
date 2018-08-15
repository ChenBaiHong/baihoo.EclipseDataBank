package com.baihoo.springboot.yml;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * yml自定义文件中，获取复杂数据
 * @author Administrator
 *
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonYml {
	
	private String nikeName;
	private Integer age;
	private Boolean boss;	
	private Date birth;
	private Map<String, Object> maps;
	private List<String> lists;
	private Dog dog;
	public String getNikeName() {
		return nikeName;
	}
	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Dog getDog() {
		return dog;
	}
	
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
