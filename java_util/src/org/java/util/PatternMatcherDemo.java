package org.java.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Java������֮Pattern,Matcher(������ʽ)��ʾ
 * 
 * @author VIC
 *
 */
public class PatternMatcherDemo {
	
	public static void main(String[] args) {
		
		// ʹ��������ʽƥ���ַ�
		String content = "hello welcome to java 9";
		
		boolean hasNumber = content.matches("[0-9]");
		System.out.println(content + "�Ƿ��������: " + hasNumber);
		
		// ����ƥ��ģʽ
		Pattern pattern = Pattern.compile("hello welcome to java");
		// ����ƥ������
		Matcher matcher = pattern.matcher(content);
		
		if(matcher.matches()){
			System.out.println("matches: " + matcher.group());
		}
		
		// ʹ��find������ƥ��ģʽ���ַ������в���Ŀ���ַ�
		if(matcher.find()){
			// ��ȡĿ���ַ�
			System.out.println("find: " + matcher.group());
		}
		
		if(matcher.lookingAt()){
			// ��ȡĿ���ַ�
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
		
		// ͳ�ơ�act"���ֵĴ���
		Pattern p = Pattern.compile("[act]+"); 
		Matcher m = p.matcher("aaactbbactccdd33dskactfjdk");
		int count = 0;
		while(m.find()) { 
		     count++;
		}
		System.out.println("act����: " + count);
	}

	public static void testGetSylo() {
		// ����java��������ʽ,���ı������з��Ŷ�ȡ����
		Pattern p=Pattern.compile("[@:.]+"); 
		Matcher m=p.matcher("�ҵ�QQ��:456456 �ҵĵ绰��:0532214 �ҵ�������:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testGetChinaChar(){
		// ����java��������ʽ,���ı������к��ֶ�ȡ����
		Pattern p=Pattern.compile("[^a-zA-Z0-9@:.]+"); 
		Matcher m=p.matcher("�ҵ�QQ��:456456 �ҵĵ绰��:0532214 �ҵ�������:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testGetLetter(){
		// ����java��������ʽ,���ı���������ĸ��ȡ����
		Pattern p=Pattern.compile("[a-zA-Z]+"); 
		Matcher m=p.matcher("�ҵ�QQ��:456456 �ҵĵ绰��:0532214 �ҵ�������:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}

	public static void testGetNotNumber(){
		// ����java��������ʽ,���ı������з����ֶ�ȡ����
		Pattern p=Pattern.compile("\\D+"); 
		Matcher m=p.matcher("�ҵ�QQ��:456456 �ҵĵ绰��:0532214 �ҵ�������:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testGetNumber(){
		// ����java��������ʽ,���ı����������ֶ�ȡ����
		Pattern p= Pattern.compile("\\d+"); 
		Matcher m=p.matcher("�ҵ�QQ��:456456 �ҵĵ绰��:0532214 �ҵ�������:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		}
	}
	
	public static void testMatcher() {
		
		// Matcher��Ĺ��췽��Ҳ��˽�е�,�������ⴴ��,ֻ��ͨ��Pattern.matcher(CharSequence input)�����õ������ʵ��.
		// Pattern��ֻ����һЩ�򵥵�ƥ�����,Ҫ��õ���ǿ����ݵ�����ƥ�����,�Ǿ���Ҫ��Pattern��Matcherһ�����.
		// Matcher���ṩ�˶�������ʽ�ķ���֧��,�Լ���������ʽ�Ķ��ƥ��֧��.
		
		Pattern p= Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		m.pattern();//����p Ҳ���Ƿ��ظ�Matcher���������ĸ�Pattern����Ĵ����� 
		
		// Matcher���ṩ����ƥ���������,��������������boolean����,��ƥ�䵽ʱ����true,ûƥ�䵽�򷵻�false 
		// 1. matches()�������ַ�������ƥ��,ֻ�������ַ�����ƥ���˲ŷ���true 
		Pattern p2=Pattern.compile("\\d+"); 
		Matcher m2=p2.matcher("22bb23"); 
		m2.matches();//����false,��Ϊbb���ܱ�\d+ƥ��,���������ַ���ƥ��δ�ɹ�. 
		Matcher m3=p2.matcher("2223"); 
		m3.matches();//����true,��Ϊ\d+ƥ�䵽�������ַ��� 
		
		// 2. lookingAt()��ǰ����ַ�������ƥ��,ֻ��ƥ�䵽���ַ�������ǰ��ŷ���true 
		Pattern p3=Pattern.compile("\\d+"); 
		Matcher m4=p3.matcher("22bb23"); 
		m4.lookingAt();//����true,��Ϊ\d+ƥ�䵽��ǰ���22 
		Matcher m5=p3.matcher("aa2223"); 
		m5.lookingAt();//����false,��Ϊ\d+����ƥ��ǰ���aa 
		
		// find()���ַ�������ƥ��,ƥ�䵽���ַ����������κ�λ��. 
		Pattern p4=Pattern.compile("\\d+"); 
		Matcher m6=p4.matcher("22bb23"); 
		m6.find();//����true 
		Matcher m7=p4.matcher("aa2223"); 
		m7.find();//����true 
		Matcher m8=p4.matcher("aa2223bb"); 
		m8.find();//����true 
		Matcher m9=p4.matcher("aabb"); 
		m9.find();//����false 
		
		// Mathcer.start()/ Matcher.end()/ Matcher.group() 
		// ��ʹ��matches(),lookingAt(),find()ִ��ƥ�������,�Ϳ��������������������õ�����ϸ����Ϣ.
		// start()����ƥ�䵽�����ַ������ַ����е�����λ��. 
		// end()����ƥ�䵽�����ַ��������һ���ַ����ַ����е�����λ��. 
		// group()����ƥ�䵽�����ַ���
		
		Pattern p5=Pattern.compile("\\d+"); 
		Matcher m10=p5.matcher("aaa2223bb"); 
		m10.find();//ƥ��2223 
		m10.start();//����3 
		m10.end();//����7,���ص���2223��������� 
		m10.group();//����2223 
		 
		Matcher m11=p5.matcher("2223bb"); 
		m11.lookingAt();   //ƥ��2223 
		m11.start();   //����0,����lookingAt()ֻ��ƥ��ǰ����ַ���,���Ե�ʹ��lookingAt()ƥ��ʱ,start()�������Ƿ���0 
		m11.end();   //����4 
		m11.group();   //����2223 
		 
		Matcher m12=p5.matcher("2223"); //���Matcher m3=p.matcher("2223bb"); ��ô����ķ���������Ϊ��ƥ�䷵��false
		m12.matches();   //ƥ�������ַ��� 
		m12.start();   //����0
		m12.end();   //����3,ԭ�����Ŵ��Ҳ�����,��Ϊmatches()��Ҫƥ�������ַ��� 
		m12.group();   //����2223
		
		//Mathcer�໹��һ��groupCount()���ڷ����ж�����. 
		Pattern p6 = Pattern.compile("([a-z]+)(\\d+)"); 
		Matcher m13 = p6.matcher("aaa2223bb"); 
		m13.find();   //ƥ��aaa2223 
		m13.groupCount();   //����2,��Ϊ��2�� 
		m13.start(1);   //����0 ���ص�һ��ƥ�䵽�����ַ������ַ����е������� 
		m13.start(2);   //����3 
		m13.end(1);   //����3 ���ص�һ��ƥ�䵽�����ַ��������һ���ַ����ַ����е�����λ��. 
		m13.end(2);   //����7 
		m13.group(1);   //����aaa,���ص�һ��ƥ�䵽�����ַ��� 
		m13.group(2);   //����2223,���صڶ���ƥ�䵽�����ַ��� 

	}

	public static void testPattern() {
		
		// Pattern��: ��������ʽ�ı����ʾ��ʽ,ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ��(���������"������ʽ")��
		// ��Patternֻ��ʹ��Pattern.matcher(String regex,CharSequence input)һ���������򵥵�ƥ�䡣
		Pattern p = Pattern.compile("\\w+"); 
		System.out.println("������ʽ���ַ�����ʽ: "+p.pattern());
		
		// Pattern��һ��split(CharSequence input)����,���ڷָ��ַ���,������һ��String[]
		Pattern p2=Pattern.compile("\\d+"); 
		String[] str=p2.split("�ҵ�QQ��:88888�ҵĵ绰��:777777�ҵ�������:aaa@aaa.com");
		System.out.println(Arrays.toString(str));
		System.out.println();
		
		// Pattern.matcher(String regex,CharSequence input)��һ����̬����,
		// ���ڿ���ƥ���ַ���,�÷����ʺ�����ֻƥ��һ��,��ƥ��ȫ���ַ���.
		System.out.println(Pattern.matches("\\d+","2223"));//����true 
		Pattern.matches("\\d+","2223aa");//����false,��Ҫƥ�䵽�����ַ������ܷ���true,����aa����ƥ�䵽 
		Pattern.matches("\\d+","22bb23");//����false,��Ҫƥ�䵽�����ַ������ܷ���true,����bb����ƥ�䵽 

	}

}
