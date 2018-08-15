package com.baiHoo.gui.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * 
 *<p>类名称:MyFrame.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年3月18日
 */
@SuppressWarnings("serial")
public class MyFrame  extends Frame {
	
	/**
	 * 加载窗口的构造方法
	 */
	public void launchFrame(){
		//设置加载窗口的宽度和高度
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		//设置加载窗口所在屏幕的位置
		setLocation(100, 100);
		//重要的一环，设置加载的窗口是否可见，当然true
		setVisible(true);
		//启动重画线程
		new PaintThread().start();  
		//调用的MyFrame 父类的 添加窗口监听器方法 （addWindowListener ）
		addWindowListener(
				//方法内部类实现，窗口适配器类调用
				new WindowAdapter() {
			@Override
			//窗口监听器的调用方法就是关闭窗口，系统退出
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/**
	 * 
	 * 
	 *<p>类名称:MyFrame.java </p>
	 *<p>类说明: 
	 *
	 *		定义一个重画窗口的线程类，是一个内部类
	 *
	 *</p>
	 *
	 * @author baiHoo.chen
	 * @date 2018年3月18日
	 */
	class PaintThread extends Thread {
		
		public void run(){
			while(true){
				//内部类调用外部类MyFrame继承父类的 repaint方法
				repaint();
				
				try {
					Thread.sleep(40); //1s = 1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}   
			}
		}
		
	}
}
