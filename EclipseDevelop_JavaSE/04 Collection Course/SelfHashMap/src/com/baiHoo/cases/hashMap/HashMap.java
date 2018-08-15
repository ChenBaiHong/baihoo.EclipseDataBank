package com.baiHoo.cases.hashMap;

/**
 * 
 * @author Administrator 散列链表
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> {

	private int size;
	private int threshold;// 阀值,当size大于阈值时就需要将数组扩容了
	private Entry<K, V>[] table;// 节点数组，每个元素都指向一个单向链表

	private float loadFactor = 0.75f;// 负载因子
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	/**
	 * 节点类
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
	 * 添加键值对
	 * <p>
	 * 1、计算键的哈希值 2、根据哈希值得到保存位置（取模） 3、插到对应位置的链表头部或更新已有值 4、根据需要扩展table大小
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
			// 如果key已存在，更新value
			if (e.hash == hash && e.key.equals(key)) {
				e.value = value;
				isFind = true;
				size--;// 更新的时候减一，防止等下size+1后不符合实际情况
				System.out.println("key存在：key=" + key + "\tvalue=" + value);
			}
		}
		if (!isFind) {
			// 如果key不存在，插入单向链表的头部
			Entry<K, V> first = table[index];
			table[index] = new Entry<>(hash, key, value, first);
			System.out.println("key不存在：key=" + key + "\tvalue=" + value);
		}
	}

	/**
	 * 根据键，获取值
	 * <p>
	 * 1、计算键的哈希值 2、根据hash找到table中的对应链表 3、在链表中遍历查找
	 * 4、逐个比较，先通过hash快速比较，hash相同再通过equals比较
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
	 * 移除键值对
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
				// 干掉节点间的关系
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
	 * 元素的长度
	 */
	public int size() {
		return size;
	}

	/**
	 * 转字符串
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

	// 计算hash值
	private int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	// 计算index值
	private int indexFor(int h, int length) {
		// 当length为2的幂次方时，h&(length-1)等价于h%length。
		return h & (length - 1);
	}

	// 动态扩容
	private void resize() {
		Entry<K, V>[] oldTable = table;
		int newCapacity = oldTable.length << 1;
		System.out.println(
				"需要扩容到：" + newCapacity + "\tsize=" + size + "\tthreshold=" + threshold + "\tlength=" + oldTable.length);
		@SuppressWarnings({ "unchecked" })
		Entry<K, V>[] newTable = (Entry<K, V>[]) new Entry[newCapacity];
		table = newTable;
		transfer(oldTable, newTable);
		threshold = (int) (loadFactor * newCapacity);
		System.out.println("刷新threshold=" + threshold);
	}

	// 扩容后，将键值对从旧的数组，移植到新的数组上，此时将重排链表
	private void transfer(Entry<K, V>[] oldTable, Entry<K, V>[] newTable) {
		for (Entry<K, V> entry : oldTable) {
			for (Entry<K, V> first = entry; first != null; first = first.next) {
				putKey(first.key, first.value);
			}
		}
	}
}
