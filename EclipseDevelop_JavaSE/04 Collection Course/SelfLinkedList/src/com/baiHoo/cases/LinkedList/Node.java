package com.baiHoo.cases.LinkedList;
/**
 * 
 * @author baiHoo
 * 	½ÚµãÀà
 *
 */
public class Node {
	private Node preNode;
	private Object obj;
	private Node nextNode;
	
	public Node() {
		super();
	}
	
	public Node(Node preNode, Object obj, Node nextNode) {
		super();
		this.preNode = preNode;
		this.obj = obj;
		this.nextNode = nextNode;
	}

	public Node getPreNode() {
		return preNode;
	}
	public void setPreNode(Node preNode) {
		this.preNode = preNode;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
