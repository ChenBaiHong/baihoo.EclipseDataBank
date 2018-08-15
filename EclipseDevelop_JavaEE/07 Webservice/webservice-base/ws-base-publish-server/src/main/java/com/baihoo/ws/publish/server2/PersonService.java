package com.baihoo.ws.publish.server2;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.baihoo.ws.publish.server2.model.Person;

/**
 * Person webservice 对外服务类
 * 
 * @author Administrator
 *
 */
@WebService
public class PersonService {

	List<Person> pList = new ArrayList<Person>();

	/**
	 * 添加人
	 * 
	 * @param person
	 */
	public void addPerson(Person person) {
		pList.add(person);
	}

	/**
	 * 获得所有的人
	 * 
	 * @return
	 */
	public List<Person> getPersonAll() {
		return pList;
	}
	
	
}
