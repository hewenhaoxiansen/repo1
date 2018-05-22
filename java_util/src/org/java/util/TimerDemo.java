package org.java.util;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ʱ��(Timer): ���Զ�ʱִ�ж�ʱ����
 * ��ʱ����(TimerTask): ��һ���߳�����ִ����
 * 
 * @author VIC
 *
 */
public class TimerDemo {
	
	public static void main(String[] args) {
		System.out.println("��������ʱ��: " + System.currentTimeMillis());
		// ������ʱ��
		Timer timer = new Timer();
		// ��ָ����ʵ��ִ�ж�ʱ����(ִֻ��һ��)
		// task: ��ʾִ�е�����
		// delay: �����������ӳ�ִ��ʱ��(����)
		timer.schedule(new DataProcessTask(), 3000);
		timer.schedule(new DataProcessTask() , new Date(System.currentTimeMillis() + 5000));
		
		// ָ����ʱѭ��ִ������
		// task: ��ʾִ�е�����
		// delay: �״�ִ��ʱ��
		// period: ���ִ��ʱ��
		timer.schedule(new DataProcessTask(), 8000, 3000);
		
	}
}

/**
 * ���ݴ�������
 * @author VIC
 *
 */
class DataProcessTask extends TimerTask {

	@Override
	public void run() {
		// �������ִ�в���
		System.out.println("����ִ��ʱ��: " + System.currentTimeMillis());
	}
	
}
