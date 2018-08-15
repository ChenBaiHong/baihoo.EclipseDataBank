package com.baiHoo.gui.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * 
 *<p>������:MyFrame.java </p>
 *<p>��˵��: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018��3��18��
 */
@SuppressWarnings("serial")
public class MyFrame  extends Frame {
	
	/**
	 * ���ش��ڵĹ��췽��
	 */
	public void launchFrame(){
		//���ü��ش��ڵĿ�Ⱥ͸߶�
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		//���ü��ش���������Ļ��λ��
		setLocation(100, 100);
		//��Ҫ��һ�������ü��صĴ����Ƿ�ɼ�����Ȼtrue
		setVisible(true);
		//�����ػ��߳�
		new PaintThread().start();  
		//���õ�MyFrame ����� ��Ӵ��ڼ��������� ��addWindowListener ��
		addWindowListener(
				//�����ڲ���ʵ�֣����������������
				new WindowAdapter() {
			@Override
			//���ڼ������ĵ��÷������ǹرմ��ڣ�ϵͳ�˳�
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/**
	 * 
	 * 
	 *<p>������:MyFrame.java </p>
	 *<p>��˵��: 
	 *
	 *		����һ���ػ����ڵ��߳��࣬��һ���ڲ���
	 *
	 *</p>
	 *
	 * @author baiHoo.chen
	 * @date 2018��3��18��
	 */
	class PaintThread extends Thread {
		
		public void run(){
			while(true){
				//�ڲ�������ⲿ��MyFrame�̳и���� repaint����
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
