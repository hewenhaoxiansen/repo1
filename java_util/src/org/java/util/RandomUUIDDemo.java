package org.java.util;

import java.util.Random;
import java.util.UUID;

/**
 * Java������֮Random,UUID��ʾ
 * 
 */
public class RandomUUIDDemo {
	
	public static void main(String[] args) {
		
		// ����random�������������
		Random random = new Random();
		int count = random.nextInt(10);
		for(int i = 0; i < count; i++){
			System.out.println(random.nextInt());
		}
		
		// UUID�������Ψһ���ַ���(һ�����ڱ�ʶΨһ����)
		for(int i = 0; i < count; i++){
			System.out.println("UUID: " + UUID.randomUUID());
		}
	}
}
