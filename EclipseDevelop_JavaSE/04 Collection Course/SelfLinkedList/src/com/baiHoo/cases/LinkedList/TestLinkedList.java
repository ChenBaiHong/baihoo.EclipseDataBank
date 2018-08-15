package com.baiHoo.cases.LinkedList;

import java.util.Date;
/**
 * 
 * @author baiHoo.Chen
 *
 *	²âÊÔÊÖĞ´LinkedList
 */
public class TestLinkedList {
	public static void main(String [] args) {
		LinkedList list = new LinkedList();
		list.add("de");
		list.add("cc");
		list.add(new Date());
		list.add(0, 9);
		list.add(3, "dfds");
		list.remove(0);
		list.add(3, "dfdsdfasdasfsa");
		list.set(3, "baiHoo.Chen");
		list.add(4, "Ê±¼ä²î");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
