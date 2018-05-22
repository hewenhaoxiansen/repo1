package org.java.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Java常用类之Pattern,Matcher(正则表达式)演示
 * 
 * @author VIC
 *
 */
public class PatternMatcherDemo {
	
	public static void main(String[] args) {
		
		// 使用正则表达式匹配字符
		String content = "hello welcome to java 9";
		
		boolean hasNumber = content.matches("[0-9]");
		System.out.println(content + "是否包含数字: " + hasNumber);
		
		// 创建匹配模式
		Pattern pattern = Pattern.compile("hello welcome to java");
		// 创建匹配引擎
		Matcher matcher = pattern.matcher(content);
		
		if(matcher.matches()){
			System.out.println("matches: " + matcher.group());
		}
		
		// 使用find方法以匹配模式从字符序列中查找目标字符
		if(matcher.find()){
			// 获取目标字符
			System.out.println("find: " + matcher.group());
		}
		
		if(matcher.lookingAt()){
			// 获取目标字符
			System.out.println("lookingAt: " + matcher.group());
		}
		
		
//		testAnalyzerCount();
//		testGetSylo();
//		testGetChinaChar();
//		testGetLetter();
//		testGetNotNumber();
//		testGetNumber();
//		testMatcher();
//		testPattern();
	}
	
	public static void testAnalyzerCount() {
		
		// 统计“act"出现的次数
		Pattern p = Pattern.compile("[act]+"); 
		Matcher m = p.matcher("aaactbbactccdd33dskactfjdk");
		int count = 0;
		while(m.find()) { 
		     count++;
		}
		System.out.println("act出现: " + count);
	}

	public static void testGetSylo() {
		// 利用java的正则表达式,将文本中所有符号都取出来
		Pattern p=Pattern.compile("[@:.]+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testGetChinaChar(){
		// 利用java的正则表达式,将文本中所有汉字都取出来
		Pattern p=Pattern.compile("[^a-zA-Z0-9@:.]+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testGetLetter(){
		// 利用java的正则表达式,将文本中所有字母都取出来
		Pattern p=Pattern.compile("[a-zA-Z]+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}

	public static void testGetNotNumber(){
		// 利用java的正则表达式,将文本中所有非数字都取出来
		Pattern p=Pattern.compile("\\D+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testGetNumber(){
		// 利用java的正则表达式,将文本中所有数字都取出来
		Pattern p= Pattern.compile("\\d+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testMatcher() {
		
		// Matcher类的构造方法也是私有的,不能随意创建,只能通过Pattern.matcher(CharSequence input)方法得到该类的实例.
		// Pattern类只能做一些简单的匹配操作,要想得到更强更便捷的正则匹配操作,那就需要将Pattern与Matcher一起合作.
		// Matcher类提供了对正则表达式的分组支持,以及对正则表达式的多次匹配支持.
		
		Pattern p= Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		m.pattern();//返回p 也就是返回该Matcher对象是由哪个Pattern对象的创建的 
		
		// Matcher类提供三个匹配操作方法,三个方法均返回boolean类型,当匹配到时返回true,没匹配到则返回false 
		// 1. matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true 
		Pattern p2=Pattern.compile("\\d+"); 
		Matcher m2=p2.matcher("22bb23"); 
		m2.matches();//返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功. 
		Matcher m3=p2.matcher("2223"); 
		m3.matches();//返回true,因为\d+匹配到了整个字符串 
		
		// 2. lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true 
		Pattern p3=Pattern.compile("\\d+"); 
		Matcher m4=p3.matcher("22bb23"); 
		m4.lookingAt();//返回true,因为\d+匹配到了前面的22 
		Matcher m5=p3.matcher("aa2223"); 
		m5.lookingAt();//返回false,因为\d+不能匹配前面的aa 
		
		// find()对字符串进行匹配,匹配到的字符串可以在任何位置. 
		Pattern p4=Pattern.compile("\\d+"); 
		Matcher m6=p4.matcher("22bb23"); 
		m6.find();//返回true 
		Matcher m7=p4.matcher("aa2223"); 
		m7.find();//返回true 
		Matcher m8=p4.matcher("aa2223bb"); 
		m8.find();//返回true 
		Matcher m9=p4.matcher("aabb"); 
		m9.find();//返回false 
		
		// Mathcer.start()/ Matcher.end()/ Matcher.group() 
		// 当使用matches(),lookingAt(),find()执行匹配操作后,就可以利用以上三个方法得到更详细的信息.
		// start()返回匹配到的子字符串在字符串中的索引位置. 
		// end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置. 
		// group()返回匹配到的子字符串
		
		Pattern p5=Pattern.compile("\\d+"); 
		Matcher m10=p5.matcher("aaa2223bb"); 
		m10.find();//匹配2223 
		m10.start();//返回3 
		m10.end();//返回7,返回的是2223后的索引号 
		m10.group();//返回2223 
		 
		Matcher m11=p5.matcher("2223bb"); 
		m11.lookingAt();   //匹配2223 
		m11.start();   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0 
		m11.end();   //返回4 
		m11.group();   //返回2223 
		 
		Matcher m12=p5.matcher("2223"); //如果Matcher m3=p.matcher("2223bb"); 那么下面的方法出错，因为不匹配返回false
		m12.matches();   //匹配整个字符串 
		m12.start();   //返回0
		m12.end();   //返回3,原因相信大家也清楚了,因为matches()需要匹配所有字符串 
		m12.group();   //返回2223
		
		//Mathcer类还有一个groupCount()用于返回有多少组. 
		Pattern p6 = Pattern.compile("([a-z]+)(\\d+)"); 
		Matcher m13 = p6.matcher("aaa2223bb"); 
		m13.find();   //匹配aaa2223 
		m13.groupCount();   //返回2,因为有2组 
		m13.start(1);   //返回0 返回第一组匹配到的子字符串在字符串中的索引号 
		m13.start(2);   //返回3 
		m13.end(1);   //返回3 返回第一组匹配到的子字符串的最后一个字符在字符串中的索引位置. 
		m13.end(2);   //返回7 
		m13.group(1);   //返回aaa,返回第一组匹配到的子字符串 
		m13.group(2);   //返回2223,返回第二组匹配到的子字符串 

	}

	public static void testPattern() {
		
		// Pattern类: 是正则表达式的编译表示形式,指定为字符串的正则表达式必须首先被编译为此类的实例(可以理解是"正则表达式")。
		// 用Pattern只能使用Pattern.matcher(String regex,CharSequence input)一种最基础最简单的匹配。
		Pattern p = Pattern.compile("\\w+"); 
		System.out.println("正则表达式的字符串形式: "+p.pattern());
		
		// Pattern有一个split(CharSequence input)方法,用于分隔字符串,并返回一个String[]
		Pattern p2=Pattern.compile("\\d+"); 
		String[] str=p2.split("我的QQ是:88888我的电话是:777777我的邮箱是:aaa@aaa.com");
		System.out.println(Arrays.toString(str));
		System.out.println();
		
		// Pattern.matcher(String regex,CharSequence input)是一个静态方法,
		// 用于快速匹配字符串,该方法适合用于只匹配一次,且匹配全部字符串.
		System.out.println(Pattern.matches("\\d+","2223"));//返回true 
		Pattern.matches("\\d+","2223aa");//返回false,需要匹配到所有字符串才能返回true,这里aa不能匹配到 
		Pattern.matches("\\d+","22bb23");//返回false,需要匹配到所有字符串才能返回true,这里bb不能匹配到 

	}

}
