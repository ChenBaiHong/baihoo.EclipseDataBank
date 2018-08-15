package com.baiHoo.gui.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * 
 * 
 *<p>类名称:GameUtil.java </p>
 *<p>类说明: 
 *		加载资源图片的工具类
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年3月18日
 */
public class GameUtil {
	
	private GameUtil(){}  //工具类最好将构造器私有了。
	
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
