package org.java.util;

import java.util.Timer;

/**
 * 
 * ��ʱ���������
 * 
 * @author VIC
 *
 */
public class TaskDemo {
	
	public static void main(String[] args) {
		// ������ʱ��
		Timer timer = new Timer();
		// �ӳ�5��ִ��
		//timer.schedule(new MyJob(), 5000);
		// �ӳ�5��ִ��֮��ÿ3���ظ�ִ��һ��
		timer.schedule(new MyJob(), 5000, 3000);
	}

}
