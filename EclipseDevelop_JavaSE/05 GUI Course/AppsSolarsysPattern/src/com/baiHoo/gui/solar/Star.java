package com.baiHoo.gui.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.baiHoo.gui.util.GameUtil;

/**
 * 
 * 
 *<p>类名称:Star.java </p>
 *<p>类说明: 
 *		star ---恒星类
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年3月18日
 */
public class Star {
	Image img;
	double x,y;
	int width,height;
	/**
	 * Graphics 制图工具类
	 * @param g
	 */
	public void draw(Graphics g){
		//图片 ， 长 ， 宽
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star(){
	}
	/**
	 * 
	 * @param img
	 */
	public Star(Image img){
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		
	}
	
	public Star(Image img,double x,double y){
		this(img);
		this.x = x;
		this.y = y;
		
	}
	
	public Star(String imgpath,double x,double y){
		this(GameUtil.getImage(imgpath), x, y);   //通过this调用另一个构造方法
	}
	
	
}
