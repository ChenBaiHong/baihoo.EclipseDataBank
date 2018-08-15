package com.baihoo.hibernate4.demo3;

import java.util.HashSet;
import java.util.Set;

/**
 * 课程的实体类:
 * @author Administrator
 *
 */
public class Course {
	private Integer cid;
	private String cname;
	// 一个课程被多个学生选择:
	private Set<Student> students = new HashSet<Student>();
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
