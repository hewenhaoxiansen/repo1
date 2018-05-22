package org.java.util;

/**
 * Object(����)��: ��������ĸ���(����,����),��������Object�������,������Ա�ʾ�κ�����,���е����඼�̳����������з���
 * 
 * Object�๹�캯��:
 * 
 * 1. Object(); ����һ���ն���
 * 
 * Object�෽��:
 * 
 * clong(): ��¡����
 * equeals(): �Ƚ϶���,Object���е�equeals����Ĭ���ǱȽ�2������ĵ�ַ
 * wait(): �û�ȡ���ö���Ķ������ĵ�ǰ�̵߳ȴ�
 * notify(): ���ѵȴ���ȡ�ö������������һ���߳�
 * toString(): ��ȡ�ö�����ַ�����ʽ
 * hashCode(): ��ȡ�ö���Ĺ�ϣ��
 * getClass(): ��ȡ�ö�������Ͷ���
 * finalize(): gc���ø÷������ͷŸö����е���Դ
 * 
 * 1. hashcode��ͬ,ֵ������ͬ
 * 2. hashcode��ͬ,����ֵ��һ����ͬ(��hashMap��)
 * 3. Object���е�equeals����Ĭ���ǱȽ�2����������õ�ַ
 * 4. ���Ҫ��дhashcode��equeals����2����������д
 * 4.1 ���equeals�Ƚ�2��������ͬ����ô���ǵ�hashcodeҲӦ����ͬ
 * 
 * @author VIC
 *
 */
public class ObjectDemo {
	
	public static void main(String[] args) {
		// ʹ��new�ؼ��ִ�������,�ڶ��лῪ�ٶ�Ӧ�Ŀռ����洢�½��Ķ���
		// ���´�����2��Object����,���ǵ���������ͬ�����������ڶ��д�ŵ��ǲ�ͬ�ĵط�,�ǲ�ͬ��2������hashcodeҲ��ͬ
		Object object1 = new Object();
		Object object2 = new Object();
		// ��ȡ�����hashcode
		System.out.println("object1 hashcode: " + object1.hashCode());
		System.out.println("object2 hashcode: " + object2.hashCode());
		
		// �Ƚ�2������
		// object1��object2���ڶ��в�ͬ�ĵ�ַ�������ǲ���ͬһ������
		boolean object1IsObject2 = object1.equals(object2);
		System.out.println("���������Ƿ���ͬ: " + object1IsObject2);
		
		// �Ƚ�2������(��û����дequals����ʱ,Ĭ�ϵ��õ���Object���equals����),Object��equals�ǱȽ�2���������õ�ַ
		Student xiaoming = new Student(1, "С��");
		Student xiaohua = new Student(1, "С��");
		System.out.println("xiaoming hashcode: " + xiaoming.hashCode());
		System.out.println("xiaohua hashcode: " + xiaohua.hashCode());
		System.out.println("xiaoming.equals(xiaohua): " + xiaoming.equals(xiaohua));
		
		
	}
}


/**
 * ����
 * @author VIC
 *
 */
class SubObject extends Object {
	
}

