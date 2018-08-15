package com.baiHoo.cases.arrayList;

@SuppressWarnings("all")
public class ArrayList {

	private Object[] elementData; // 实质：Object数组

	private int size; // 长度

	public ArrayList() { // 默认初始长度是10
		this(10);
	}

	public ArrayList(int initalCapacity) { // 赋初值时，判断初值是否大于0
		if (initalCapacity < 0) {
			try {
				throw new Exception(); // 不是就抛异常
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData = new Object[initalCapacity]; // 是就给Object；
	}

	public int size() { // 定义判断长度方法size()
		return size;
	}

	public boolean isEmpty() { // 判断是否非空
		return size == 0;
	}

	public void rangeCheck(int index) { // 数组越界判断，是就抛异常
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void ensureCapacity() { // 扩展长度
		if (size >= elementData.length) {
			Object[] temp = new Object[elementData.length * 3 / 2];
			System.arraycopy(elementData, 0, temp, 0, size);//数组拷贝方法
			elementData = temp;
		}
	}

	/*
	 * 增删改查
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
