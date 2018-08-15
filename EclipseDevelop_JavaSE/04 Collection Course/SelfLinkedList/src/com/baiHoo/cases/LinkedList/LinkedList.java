package com.baiHoo.cases.LinkedList;
/**
 * 
 * @author baiHoo.Chen
 * 	双向链表集合
 *
 */
public class LinkedList {
	private int size=0;
	private Node  first;
	private Node last;
	public int size() {
		return size;
	}
	/**
	 * 
	 * @param obj
	 * 	解惑：
	 * 		关键点1 —— first 与 last， 是未被实例化的对象！只存在栈区
	 * 
	 */
	public void add(Object obj) {
		Node node = new Node();
		node.setObj(obj);
		if(first == null) {
			node.setPreNode(null);
			node.setNextNode(null);
			//第一次，添加值时：(true ，第 1 次)
			//first 与 last， 是未被实例化的对象。若赋相同的实例化对象，它们将会引用同一个堆区
			first=node;
			last=node;
			//System.out.println((first == last)+" ，第 "+(size+1)+" 次");
		}else {
			node.setPreNode(last);
			node.setNextNode(null);
			//第二次，添加值时：(true ，第 2 次)
			//first 与  last， 引用的是同一个实例化对象。 若 last 指向的堆区值改变，first也是同理
			//last 重新被引用（注意：node实例化对象，就是 last 指向的堆区值改变）实例化对象node。那么，first 与 last 指向堆区不同，影响互不干扰
			
			//第三次，添加值时：(false ，第 3 次l)
			//first 与  last，不再引用的是同一个实例化对象。 但是 last 引用时第二次出现node （即 last 和 第二次出现 node 是同一实例化对象，指向同一堆区）, first的堆区改变的值即node
			//last 重新被引用实例化对象。那么，last 与第二次出现 node 指向堆区地址不同，影响互不干扰
			//......依此类推
			last.setNextNode(node);	//System.out.println((first == last)+" ，第 "+(size+1)+" 次");
			last=node;
		}
		size++;
	}
	public void add (int index , Object obj) {
		if(first!=null && index>=0 && index<size) {
			//一个节点中存储一个数据对象
			Node node = new Node();
			node.setObj(obj);
			//第一个节点开始
			Node temp =first;
			for(int i = 0 ; i<index; i++) {
				temp = temp.getNextNode();
			}
			Node tPre = temp.getPreNode();
			if(tPre!=null) {
				tPre.setNextNode(node);
				node.setPreNode(tPre);
				node.setNextNode(temp);
				temp.setPreNode(node);
			}else {
				node.setPreNode(null);
				temp.setPreNode(node);
				node.setNextNode(temp);
				first = node;
			}
			size++;
		}else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void set(int index , Object obj) {
		if(first!=null && index>=0 && index<size) {
			//第一个节点开始
			Node temp =first;
			for(int i = 0 ; i<index; i++) {
				temp = temp.getNextNode();
			}
			temp.setObj(obj);
		}else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void remove(int index) {
		if(first!=null && index>=0 && index<size) {
			//第一个节点开始
			Node temp =first;
			for(int i = 0 ; i<index; i++) {
				temp = temp.getNextNode();
			}
			Node tPre = temp.getPreNode();
			Node tNext = temp.getNextNode();
			if(tPre != null && tNext !=null) {
				tPre.setNextNode(tNext);
				tNext.setPreNode(tPre);
			}else if(tPre != null && tNext ==null){
				tPre.setNextNode(null);
				last = tPre;
			}else if(tPre == null && tNext !=null) {
				tNext.setPreNode(null);
				first = tNext;
			}else {
				first = null;
				last = null;
			}
			size--;
		}else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public Object get(int index) {
		if(first!=null && index>=0 && index<size) {
			Node temp =first;
			for(int i = 0 ; i<index; i++) {
				temp = temp.getNextNode();
			}
			return temp.getObj();
		}else {
			return null;
		}
		
	}
}
