package org.java.util;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器(Timer): 可以定时执行定时任务
 * 定时任务(TimerTask): 是一个线程任务执行体
 * 
 * @author VIC
 *
 */
public class TimerDemo {
	
	public static void main(String[] args) {
		System.out.println("程序启动时间: " + System.currentTimeMillis());
		// 创建定时器
		Timer timer = new Timer();
		// 在指定的实际执行定时任务(只执行一次)
		// task: 表示执行的任务
		// delay: 程序启动后延迟执行时间(毫秒)
		timer.schedule(new DataProcessTask(), 3000);
		timer.schedule(new DataProcessTask() , new Date(System.currentTimeMillis() + 5000));
		
		// 指定定时循环执行任务
		// task: 表示执行的任务
		// delay: 首次执行时间
		// period: 间隔执行时间
		timer.schedule(new DataProcessTask(), 8000, 3000);
		
	}
}

/**
 * 数据处理任务
 * @author VIC
 *
 */
class DataProcessTask extends TimerTask {

	@Override
	public void run() {
		// 任务具体执行步骤
		System.out.println("任务执行时间: " + System.currentTimeMillis());
	}
	
}
