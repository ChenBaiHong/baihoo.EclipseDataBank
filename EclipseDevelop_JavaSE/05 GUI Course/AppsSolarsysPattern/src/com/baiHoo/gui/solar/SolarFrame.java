package com.baiHoo.gui.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.baiHoo.gui.util.Constant;
import com.baiHoo.gui.util.GameUtil;
import com.baiHoo.gui.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author dell
 *
 */
/**
 * 
 * 
 *<p>类名称:SolarFrame.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年3月18日
 */
@SuppressWarnings("serial")
public class SolarFrame extends MyFrame {
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet earth = new Planet(sun, "images/earth.jpg", 150, 100, 0.1);
	Planet moon = new Planet(earth, "images/moon.jpg", 30, 20, 0.3,true);
	Planet mars = new Planet(sun, "images/Mars.jpg", 200, 130, 0.2);
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
