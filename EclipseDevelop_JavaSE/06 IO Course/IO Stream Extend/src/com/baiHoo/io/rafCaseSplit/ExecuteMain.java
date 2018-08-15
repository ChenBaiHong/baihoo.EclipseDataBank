package com.baiHoo.io.rafCaseSplit;

/**
 * 
 * @author Administrator
 *
 */
public class ExecuteMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RafFileSplit split = new RafFileSplit("D:/Desktop Pictures/01.jpg","D:/Desktop Pictures/Temp",51);
		//開始切割
		split.split();
		//切割合并至另一個文件
		split.merge("D:/Desktop Pictures/Test/城市.jpg");
	}
}
