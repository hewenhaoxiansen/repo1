package org.java.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期类(Date): 在Java该类表示日期，描述一个时间。在java.util包下
 * 
 * ---1. 创建默认日期对象
 * ---Date date = new Date();
 * ---以上创建一个日期对象,日期时间是当前系统的日期时间
 * 
 * ---2. 创建指定日期对象
 * ---Date date = new Date(某个特定时间的毫秒数);
 * 
 * 常用方法:
 * getTime: 获取当前日期的毫秒数
 * setTime: 设置当前日期的毫秒数
 * 
 * 日期格式化类(SimpleDateFormat): 该类用于格式化日期,可以将日期格式化为字符串,也可将字符串格式化为日期，在java.util包下
 * 
 * ---1. 创建日期格式化对象
 * ---SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
 * ---创建默认日期格式化对象
 * 
 * ---2. 创建指定日期格式化对象
 * ---SimpleDateFormat simpleDateFormat = new SimpleDateFormat(日期格式);
 * ---日期格式有：
 * ---y: 表示年份
 * ---M: 表示月份
 * ---d: 表示天数
 * ---H: 表示小时
 * ---m: 表示分钟
 * ---s: 表示秒数
 * ---S: 表示毫秒
 * 
 * 常用方法:
 * format: 将日期对象格式化为字符串
 * parse: 将字符串转换为日期对象
 * 
 * ---其他参考API
 * 
 * @author VIC
 *
 */
public class DateDemo {
	
	public static void main(String[] args) throws Exception {
		// 创建日期对象(默认是当前系统时间)
		Date currentDate =  new Date();
		System.out.println("当前系统时间: " + currentDate);
		
		// 默认日期格式化对象
		SimpleDateFormat defaultSimpleDateFormat = new SimpleDateFormat();
		// 格式化日期
		String defaultFormatCurrentDate = defaultSimpleDateFormat.format(currentDate);
		System.out.println("默认格式格式化后当前系统日期: " + defaultFormatCurrentDate);
		
		// 创建指定日期格式的格式化对象
		// 格式化目标格式: 2018-03-23 14:21:12
		// 指定日期格式: yyyy-MM-dd HH:mm:ss:SSS
		SimpleDateFormat targetSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String targetFormatCurrentDate = targetSimpleDateFormat.format(currentDate);
		System.out.println("指定格式格式化后当前系统日期: " + targetFormatCurrentDate);
		
		// 创建指定日期对象(创建明天这个时间的日期对象)
		Date targetDate = new Date(currentDate.getTime() + (1000 * 60 * 60 * 24));
		String targetFormatDate = targetSimpleDateFormat.format(targetDate);
		System.out.println("明天的这个日期: " + targetFormatDate);
		
		// 使用after,测试某个日期是否在某个日期之后
		if(currentDate.after(targetDate)){
			System.out.println(targetFormatCurrentDate + "在" + targetFormatDate + "之后");
		}else{
			System.out.println(targetFormatCurrentDate + "在" + targetFormatDate + "之前");
		}
		
		// 获取当前时间的毫秒数
		long currentTime = currentDate.getTime();
		System.out.println("当前日期毫秒数: " + currentTime);
		
		// 将字符串格式化为日期对象
		String targetString = "2018-03-23 14:37:23:334";
		Date newDate = targetSimpleDateFormat.parse(targetString);
		System.out.println("将字符串格式化为日期对象: " + newDate);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeZone());
		
	}

}
