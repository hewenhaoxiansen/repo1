package org.java.util;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import javax.sql.RowSetInternal;

/**
 * 
 * Java常用类之System,RunTime演示
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
		// 获取运行时对象
		Runtime runtime = Runtime.getRuntime();
		// 调用第三方应用程序(打开记事本)
		String cmd="notepad";
		Process proc = runtime.exec(cmd);
	    int exitVal = proc.waitFor(); // 阻塞当前线程，并等待外部程序中止后获取结果码
	    System.out.println(exitVal == 0 ? "打开成功" : "打开失败");
	}
	
	public static void testRuntime1() throws Exception{
		// 获取运行时对象
		Runtime runtime = Runtime.getRuntime();
		// 获取系统处理器数量
		System.out.println("处理器: " + runtime.availableProcessors());
		// 获取系统内存
		System.out.println("JVM内存: " + runtime.totalMemory());
		// 获取可用内存
		System.out.println("JVM空闲内存: " + runtime.freeMemory());
		// 获取可用内存
		System.out.println("JVM最大可用内存: " + runtime.maxMemory());
	}
	
	public static void testSystem(){
		// 获取系统环境变量
		Map<String, String> envMap = System.getenv();
		System.out.println("==========环境变量=========");
		System.out.println("一般用于配置或设置系统级别参数");
		for(String key : envMap.keySet()){
			System.out.println(key + " = " + envMap.get(key));
		}
		System.out.println();
		
		// 获取所有属性
		Properties properties = System.getProperties();
		System.out.println("==========系统属性=========");
		System.out.println("一般用于获取系统默认路径等.");
		for(Object key : properties.keySet()){
			System.out.println(key + " = " + properties.get(key));
		}
		
		// 表示通知JVM进行垃圾回收(但JVM不一定立即回收)
		System.gc();
		
		// System.err 错误输出打印流,用于输出错误信息
		// System.in 输入流,用于输入信息
		// System.out 输出流,用于输出信息
		// System.console() 控制台对象
		// System.exit(status) 退出JVM
		// System.lineSeparator() 换行
		// System.nanoTime() 纳秒
		// System.identityHashCode(x) 鉴定2个对象在堆中是否是同一个
		
		
		// 其他参考API
	}

}
