package com.baiHoo.cases.hashMap;

/**
 * 
 * @author Administrator ɢ������
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> {

	private int size;
	private int threshold;// ��ֵ,��size������ֵʱ����Ҫ������������
	private Entry<K, V>[] table;// �ڵ����飬ÿ��Ԫ�ض�ָ��һ����������

	private float loadFactor = 0.75f;// ��������
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	/**
	 * �ڵ���
	 */
	public static class Entry<K, V> {
		int hash;
		K key;
		V value;
		Entry<K, V> next;

		public Entry(int hash, K key, V value, Entry<K, V> next) {
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return "Entry{" + "key=" + key + ", value=" + value + '}';
		}
	}

	@SuppressWarnings("unchecked")
	public HashMap() {
		this.threshold = (int) (DEFAULT_INITIAL_CAPACITY * loadFactor);
		this.table = (Entry<K, V>[]) new Entry[DEFAULT_INITIAL_CAPACITY];
	}

	/**
	 * ��Ӽ�ֵ��
	 * <p>
	 * 1��������Ĺ�ϣֵ 2�����ݹ�ϣֵ�õ�����λ�ã�ȡģ�� 3���嵽��Ӧλ�õ�����ͷ�����������ֵ 4��������Ҫ��չtable��С
	 */
	@SuppressWarnings("unused")
	private void put(K key, V value) {
		putKey(key, value);
		size++;
		if (size >= threshold) {
			resize();
		}
	}

	private void putKey(K key, V value) {
		int hash = hash(key);
		int index = indexFor(hash, table.length);
		boolean isFind = false;
		for (Entry<K, V> e = table[index]; e != null; e = e.next) {
			// ���key�Ѵ��ڣ�����value
			if (e.hash == hash && e.key.equals(key)) {
				e.value = value;
				isFind = true;
				size--;// ���µ�ʱ���һ����ֹ����size+1�󲻷���ʵ�����
				System.out.println("key���ڣ�key=" + key + "\tvalue=" + value);
			}
		}
		if (!isFind) {
			// ���key�����ڣ����뵥�������ͷ��
			Entry<K, V> first = table[index];
			table[index] = new Entry<>(hash, key, value, first);
			System.out.println("key�����ڣ�key=" + key + "\tvalue=" + value);
		}
	}

	/**
	 * ���ݼ�����ȡֵ
	 * <p>
	 * 1��������Ĺ�ϣֵ 2������hash�ҵ�table�еĶ�Ӧ���� 3���������б�������
	 * 4������Ƚϣ���ͨ��hash���ٱȽϣ�hash��ͬ��ͨ��equals�Ƚ�
	 */
	@SuppressWarnings("unused")
	private V get(K key) {
		int hash = hash(key);
		int index = indexFor(hash, table.length);
		for (Entry<K, V> e = table[index]; e != null; e = e.next) {
			if (e.hash == hash && e.key.equals(key)) {
				return e.value;
			}
		}
		return null;
	}

	/**
	 * �Ƴ���ֵ��
	 */
	@SuppressWarnings("unused")
	private V remove(K key) {
		int hash = hash(key);
		int index = indexFor(hash, table.length);
		Entry<K, V> prev = table[index];
		Entry<K, V> e = prev;
		while (e != null) {
			Entry<K, V> next = e.next;
			if (next.hash == hash && next.key.equals(key)) {
				size--;
				// �ɵ��ڵ��Ĺ�ϵ
				if (prev == e) {
					table[index] = next;
				} else {
					prev.next = next;
				}
				return next.value;
			}
			prev = e;
			e = next;
		}
		return null;
	}

	/**
	 * Ԫ�صĳ���
	 */
	public int size() {
		return size;
	}

	/**
	 * ת�ַ���
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		int index = 0;
		for (Entry<K, V> entry : table) {
			for (Entry<K, V> first = entry; first != null; first = first.next) {
				sb.append(first.toString());
				if (index < size) {
					sb.append(",");
				}
				index++;
			}
		}
		sb.append(']');
		return sb.toString();
	}

	// ����hashֵ
	private int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	// ����indexֵ
	private int indexFor(int h, int length) {
		// ��lengthΪ2���ݴη�ʱ��h&(length-1)�ȼ���h%length��
		return h & (length - 1);
	}

	// ��̬����
	private void resize() {
		Entry<K, V>[] oldTable = table;
		int newCapacity = oldTable.length << 1;
		System.out.println(
				"��Ҫ���ݵ���" + newCapacity + "\tsize=" + size + "\tthreshold=" + threshold + "\tlength=" + oldTable.length);
		@SuppressWarnings({ "unchecked" })
		Entry<K, V>[] newTable = (Entry<K, V>[]) new Entry[newCapacity];
		table = newTable;
		transfer(oldTable, newTable);
		threshold = (int) (loadFactor * newCapacity);
		System.out.println("ˢ��threshold=" + threshold);
	}

	// ���ݺ󣬽���ֵ�ԴӾɵ����飬��ֲ���µ������ϣ���ʱ����������
	private void transfer(Entry<K, V>[] oldTable, Entry<K, V>[] newTable) {
		for (Entry<K, V> entry : oldTable) {
			for (Entry<K, V> first = entry; first != null; first = first.next) {
				putKey(first.key, first.value);
			}
		}
	}
}
