package org.java.util;

import java.util.Timer;

/**
 * 
 * 定时任务测试类
 * 
 * @author VIC
 *
 */
public class TaskDemo {
	
	public static void main(String[] args) {
		// 创建定时器
		Timer timer = new Timer();
		// 延迟5秒执行
		//timer.schedule(new MyJob(), 5000);
		// 延迟5秒执行之后并每3秒重复执行一次
		timer.schedule(new MyJob(), 5000, 3000);
	}

}
