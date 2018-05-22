package org.java.util;

import java.util.TimerTask;

/**
 * 自定义任务类,继承TimerTask即可
 * 
 */
public class MyJob extends TimerTask {

	@Override
	public void run() {
		// 任务内容
		System.out.println("快下课了,大家准备回家写代码..");
	}

}
