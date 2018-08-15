package com.baiHoo.bufferedIo.systemIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ∑‚◊∞ ‰»Î
 * @author Administrator
 *
 */
public class BufferedSystemIn {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStream is =System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("«Î ‰»Î°£°£°£°£");
		String msg =br.readLine();
		System.out.println(msg);
	}

}