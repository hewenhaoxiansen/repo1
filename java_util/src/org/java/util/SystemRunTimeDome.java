package org.java.util;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import javax.sql.RowSetInternal;

/**
 * 
 * Java������֮System,RunTime��ʾ
 * 
 * @author VIC
 *
 */
public class SystemRunTimeDome {
	
	public static void main(String[] args) throws Exception {
//		testRuntime1();
		testRuntime2();
//		testSystem();
		
	}
	
	public static void testRuntime2() throws Exception{
		// ��ȡ����ʱ����
		Runtime runtime = Runtime.getRuntime();
		// ���õ�����Ӧ�ó���(�򿪼��±�)
		String cmd="notepad";
		Process proc = runtime.exec(cmd);
	    int exitVal = proc.waitFor(); // ������ǰ�̣߳����ȴ��ⲿ������ֹ���ȡ�����
	    System.out.println(exitVal == 0 ? "�򿪳ɹ�" : "��ʧ��");
	}
	
	public static void testRuntime1() throws Exception{
		// ��ȡ����ʱ����
		Runtime runtime = Runtime.getRuntime();
		// ��ȡϵͳ����������
		System.out.println("������: " + runtime.availableProcessors());
		// ��ȡϵͳ�ڴ�
		System.out.println("JVM�ڴ�: " + runtime.totalMemory());
		// ��ȡ�����ڴ�
		System.out.println("JVM�����ڴ�: " + runtime.freeMemory());
		// ��ȡ�����ڴ�
		System.out.println("JVM�������ڴ�: " + runtime.maxMemory());
	}
	
	public static void testSystem(){
		// ��ȡϵͳ��������
		Map<String, String> envMap = System.getenv();
		System.out.println("==========��������=========");
		System.out.println("һ���������û�����ϵͳ�������");
		for(String key : envMap.keySet()){
			System.out.println(key + " = " + envMap.get(key));
		}
		System.out.println();
		
		// ��ȡ��������
		Properties properties = System.getProperties();
		System.out.println("==========ϵͳ����=========");
		System.out.println("һ�����ڻ�ȡϵͳĬ��·����.");
		for(Object key : properties.keySet()){
			System.out.println(key + " = " + properties.get(key));
		}
		
		// ��ʾ֪ͨJVM������������(��JVM��һ����������)
		System.gc();
		
		// System.err ���������ӡ��,�������������Ϣ
		// System.in ������,����������Ϣ
		// System.out �����,���������Ϣ
		// System.console() ����̨����
		// System.exit(status) �˳�JVM
		// System.lineSeparator() ����
		// System.nanoTime() ����
		// System.identityHashCode(x) ����2�������ڶ����Ƿ���ͬһ��
		
		
		// �����ο�API
	}

}
