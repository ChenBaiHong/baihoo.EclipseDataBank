package com.baiHoo.cases.LinkedList;
/**
 * 
 * @author baiHoo.Chen
 * 	˫��������
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
	 * 	���
	 * 		�ؼ���1 ���� first �� last�� ��δ��ʵ�����Ķ���ֻ����ջ��
	 * 
	 */
	public void add(Object obj) {
		Node node = new Node();
		node.setObj(obj);
		if(first == null) {
			node.setPreNode(null);
			node.setNextNode(null);
			//��һ�Σ����ֵʱ��(true ���� 1 ��)
			//first �� last�� ��δ��ʵ�����Ķ���������ͬ��ʵ�����������ǽ�������ͬһ������
			first=node;
			last=node;
			//System.out.println((first == last)+" ���� "+(size+1)+" ��");
		}else {
			node.setPreNode(last);
			node.setNextNode(null);
			//�ڶ��Σ����ֵʱ��(true ���� 2 ��)
			//first ��  last�� ���õ���ͬһ��ʵ�������� �� last ָ��Ķ���ֵ�ı䣬firstҲ��ͬ��
			//last ���±����ã�ע�⣺nodeʵ�������󣬾��� last ָ��Ķ���ֵ�ı䣩ʵ��������node����ô��first �� last ָ�������ͬ��Ӱ�컥������
			
			//�����Σ����ֵʱ��(false ���� 3 ��l)
			//first ��  last���������õ���ͬһ��ʵ�������� ���� last ����ʱ�ڶ��γ���node ���� last �� �ڶ��γ��� node ��ͬһʵ��������ָ��ͬһ������, first�Ķ����ı��ֵ��node
			//last ���±�����ʵ����������ô��last ��ڶ��γ��� node ָ�������ַ��ͬ��Ӱ�컥������
			//......��������
			last.setNextNode(node);	//System.out.println((first == last)+" ���� "+(size+1)+" ��");
			last=node;
		}
		size++;
	}
	public void add (int index , Object obj) {
		if(first!=null && index>=0 && index<size) {
			//һ���ڵ��д洢һ�����ݶ���
			Node node = new Node();
			node.setObj(obj);
			//��һ���ڵ㿪ʼ
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
			//��һ���ڵ㿪ʼ
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
			//��һ���ڵ㿪ʼ
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
