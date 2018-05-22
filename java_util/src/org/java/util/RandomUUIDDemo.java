package org.java.util;

import java.util.Random;
import java.util.UUID;

/**
 * Java常用类之Random,UUID演示
 * 
 */
public class RandomUUIDDemo {
	
	public static void main(String[] args) {
		
		// 创建random对象生成随机数
		Random random = new Random();
		int count = random.nextInt(10);
		for(int i = 0; i < count; i++){
			System.out.println(random.nextInt());
		}
		
		// UUID生成随机唯一性字符串(一般用于标识唯一对象)
		for(int i = 0; i < count; i++){
			System.out.println("UUID: " + UUID.randomUUID());
		}
	}
}
