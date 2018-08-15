package com.baiHoo.gui.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.baiHoo.gui.util.GameUtil;

/**
 * 
 * 
 *<p>������:Star.java </p>
 *<p>��˵��: 
 *		star ---������
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018��3��18��
 */
public class Star {
	Image img;
	double x,y;
	int width,height;
	/**
	 * Graphics ��ͼ������
	 * @param g
	 */
	public void draw(Graphics g){
		//ͼƬ �� �� �� ��
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
		this(GameUtil.getImage(imgpath), x, y);   //ͨ��this������һ�����췽��
	}
	
	
}
