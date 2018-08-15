package com.baiHoo.cases.arrayList;

@SuppressWarnings("all")
public class ArrayList {

	private Object[] elementData; // ʵ�ʣ�Object����

	private int size; // ����

	public ArrayList() { // Ĭ�ϳ�ʼ������10
		this(10);
	}

	public ArrayList(int initalCapacity) { // ����ֵʱ���жϳ�ֵ�Ƿ����0
		if (initalCapacity < 0) {
			try {
				throw new Exception(); // ���Ǿ����쳣
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData = new Object[initalCapacity]; // �Ǿ͸�Object��
	}

	public int size() { // �����жϳ��ȷ���size()
		return size;
	}

	public boolean isEmpty() { // �ж��Ƿ�ǿ�
		return size == 0;
	}

	public void rangeCheck(int index) { // ����Խ���жϣ��Ǿ����쳣
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void ensureCapacity() { // ��չ����
		if (size >= elementData.length) {
			Object[] temp = new Object[elementData.length * 3 / 2];
			System.arraycopy(elementData, 0, temp, 0, size);//���鿽������
			elementData = temp;
		}
	}

	/*
	 * ��ɾ�Ĳ�
	 */
	public void add(Object obj) {
		ensureCapacity();
		elementData[size++] = obj;
	}

	public void add(int index, Object obj) {
		rangeCheck(index);
		ensureCapacity();
		/**
		 * 
		 */
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = obj;
		size++;
	}

	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}

	public Object set(int index, Object obj) {
		rangeCheck(index);
		Object oldValue = elementData[index];
		elementData[index] = obj;
		return oldValue;
	}

	public void remove(int index) {
		rangeCheck(index);
		ensureCapacity();
		System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
		size--;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList(2);
		list.add("a");
		list.add("b");
		System.out.println(list.size());
		list.add(1, "c");
		System.out.println(list.get(1));
		list.remove(1);
		System.out.println(list.get(1));
	}
}
