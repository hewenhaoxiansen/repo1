package org.java.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ������(Date): ��Java�����ʾ���ڣ�����һ��ʱ�䡣��java.util����
 * 
 * ---1. ����Ĭ�����ڶ���
 * ---Date date = new Date();
 * ---���ϴ���һ�����ڶ���,����ʱ���ǵ�ǰϵͳ������ʱ��
 * 
 * ---2. ����ָ�����ڶ���
 * ---Date date = new Date(ĳ���ض�ʱ��ĺ�����);
 * 
 * ���÷���:
 * getTime: ��ȡ��ǰ���ڵĺ�����
 * setTime: ���õ�ǰ���ڵĺ�����
 * 
 * ���ڸ�ʽ����(SimpleDateFormat): �������ڸ�ʽ������,���Խ����ڸ�ʽ��Ϊ�ַ���,Ҳ�ɽ��ַ�����ʽ��Ϊ���ڣ���java.util����
 * 
 * ---1. �������ڸ�ʽ������
 * ---SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
 * ---����Ĭ�����ڸ�ʽ������
 * 
 * ---2. ����ָ�����ڸ�ʽ������
 * ---SimpleDateFormat simpleDateFormat = new SimpleDateFormat(���ڸ�ʽ);
 * ---���ڸ�ʽ�У�
 * ---y: ��ʾ���
 * ---M: ��ʾ�·�
 * ---d: ��ʾ����
 * ---H: ��ʾСʱ
 * ---m: ��ʾ����
 * ---s: ��ʾ����
 * ---S: ��ʾ����
 * 
 * ���÷���:
 * format: �����ڶ����ʽ��Ϊ�ַ���
 * parse: ���ַ���ת��Ϊ���ڶ���
 * 
 * ---�����ο�API
 * 
 * @author VIC
 *
 */
public class DateDemo {
	
	public static void main(String[] args) throws Exception {
		// �������ڶ���(Ĭ���ǵ�ǰϵͳʱ��)
		Date currentDate =  new Date();
		System.out.println("��ǰϵͳʱ��: " + currentDate);
		
		// Ĭ�����ڸ�ʽ������
		SimpleDateFormat defaultSimpleDateFormat = new SimpleDateFormat();
		// ��ʽ������
		String defaultFormatCurrentDate = defaultSimpleDateFormat.format(currentDate);
		System.out.println("Ĭ�ϸ�ʽ��ʽ����ǰϵͳ����: " + defaultFormatCurrentDate);
		
		// ����ָ�����ڸ�ʽ�ĸ�ʽ������
		// ��ʽ��Ŀ���ʽ: 2018-03-23 14:21:12
		// ָ�����ڸ�ʽ: yyyy-MM-dd HH:mm:ss:SSS
		SimpleDateFormat targetSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String targetFormatCurrentDate = targetSimpleDateFormat.format(currentDate);
		System.out.println("ָ����ʽ��ʽ����ǰϵͳ����: " + targetFormatCurrentDate);
		
		// ����ָ�����ڶ���(�����������ʱ������ڶ���)
		Date targetDate = new Date(currentDate.getTime() + (1000 * 60 * 60 * 24));
		String targetFormatDate = targetSimpleDateFormat.format(targetDate);
		System.out.println("������������: " + targetFormatDate);
		
		// ʹ��after,����ĳ�������Ƿ���ĳ������֮��
		if(currentDate.after(targetDate)){
			System.out.println(targetFormatCurrentDate + "��" + targetFormatDate + "֮��");
		}else{
			System.out.println(targetFormatCurrentDate + "��" + targetFormatDate + "֮ǰ");
		}
		
		// ��ȡ��ǰʱ��ĺ�����
		long currentTime = currentDate.getTime();
		System.out.println("��ǰ���ں�����: " + currentTime);
		
		// ���ַ�����ʽ��Ϊ���ڶ���
		String targetString = "2018-03-23 14:37:23:334";
		Date newDate = targetSimpleDateFormat.parse(targetString);
		System.out.println("���ַ�����ʽ��Ϊ���ڶ���: " + newDate);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeZone());
		
	}

}
