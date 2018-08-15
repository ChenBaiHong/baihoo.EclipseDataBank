package com.baihoo.ws.client;

import java.util.List;

import com.baihoo.ws.personWS.Person;
import com.baihoo.ws.personWS.PersonService;
import com.baihoo.ws.personWS.PersonServiceService;

/**
 * 测试 复杂形式的，webservice
 * 
 * @author Administrator
 *
 */
public class TestPersonWSClient {
	public static void main(String[] args) {
		// 创建服务访问点集合
		PersonServiceService pss = new PersonServiceService();
		// 根据服务访问点获得绑定的类
		PersonService ps = pss.getPersonServicePort();
		// 调用具体业务逻辑
		Person p1 = new Person();
		p1.setAge(1);
		p1.setId(1);
		p1.setName("baihoo");
		Person p2 = new Person();
		p2.setAge(2);
		p2.setId(2);
		p2.setName("baihoo2");
		Person p3 = new Person();
		p3.setAge(3);
		p3.setId(3);
		p3.setName("baihoo3");
		// 调用添加人的webservice服务方法
		ps.addPerson(p1);
		ps.addPerson(p2);
		ps.addPerson(p3);
		// 调用查询所有人的webservice服务方法
		List<Person> list = ps.getPersonAll();
		list.forEach(e -> System.out.println(e.getName()));
	}
}
