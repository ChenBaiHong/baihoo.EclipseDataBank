package com.baiHoo.gui.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * 
 * 
 *<p>������:GameUtil.java </p>
 *<p>��˵��: 
 *		������ԴͼƬ�Ĺ�����
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018��3��18��
 */
public class GameUtil {
	
	private GameUtil(){}  //��������ý�������˽���ˡ�
	
	public static Image getImage(String path){
		BufferedImage bi=null;
		try {
			URL u = GameUtil.class.getClassLoader().getResource(path);
			System.out.println(u); 
			bi = javax.imageio.ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bi;
	}
}
