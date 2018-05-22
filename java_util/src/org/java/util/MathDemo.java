package org.java.util;

/**
 * 
 * Java������֮Math(��ѧ������)��ʾ
 * 
 * ���÷���:
 * floor: ����С�ڵ��ڸ�ֵ�����ֵ(ȡ��)
 * round: ���ش��ڵ��ڸ�ֵ����Сֵ(��������)
 * 
 * @author VIC
 *
 */
public class MathDemo {

	public static void main(String[] args) {

		/**
		 * abs�����ֵ
		 */
		System.out.println(Math.abs(-10.4)); // 10.4
		System.out.println(Math.abs(10.1)); // 10.1

		/**
		 * ceil�컨�����˼�����Ƿ��ش��ֵ��ע��һЩ����ֵ
		 */
		System.out.println(Math.ceil(-10.1)); // -10.0
		System.out.println(Math.ceil(10.7)); // 11.0
		System.out.println(Math.ceil(-0.7)); // -0.0
		System.out.println(Math.ceil(0.0)); // 0.0
		System.out.println(Math.ceil(-0.0)); // -0.0

		/**
		 * floor�ذ����˼�����Ƿ���С��ֵ
		 */
		System.out.println(Math.floor(-10.1)); // -11.0
		System.out.println(Math.floor(10.7)); // 10.0
		System.out.println(Math.floor(-0.7)); // -1.0
		System.out.println(Math.floor(0.0)); // 0.0
		System.out.println(Math.floor(-0.0)); // -0.0

		/**
		 * max �����з��ش��ֵ,min�����෴���Ͳ�������
		 */
		System.out.println(Math.max(-10.1, -10)); // -10.0
		System.out.println(Math.max(10.7, 10)); // 10.7
		System.out.println(Math.max(0.0, -0.0)); // 0.0

		/**
		 * random ȡ��һ�����ڻ��ߵ���0.0С�ڲ�����1.0�������
		 */
		System.out.println(Math.random()); // 0.08417657924317234
		System.out.println(Math.random()); // 0.43527904004403717

		/**
		 * rint �������룬����doubleֵ ע��.5��ʱ���ȡż��
		 */
		System.out.println(Math.rint(10.1)); // 10.0
		System.out.println(Math.rint(10.7)); // 11.0
		System.out.println(Math.rint(11.5)); // 12.0
		System.out.println(Math.rint(10.5)); // 10.0
		System.out.println(Math.rint(10.51)); // 11.0
		System.out.println(Math.rint(-10.5)); // -10.0
		System.out.println(Math.rint(-11.5)); // -12.0
		System.out.println(Math.rint(-10.51)); // -11.0
		System.out.println(Math.rint(-10.6)); // -11.0
		System.out.println(Math.rint(-10.2)); // -10.0

		/**
		 * round �������룬floatʱ����intֵ��doubleʱ����longֵ
		 */
		System.out.println(Math.round(10.1)); // 10
		System.out.println(Math.round(10.7)); // 11
		System.out.println(Math.round(10.5)); // 11
		System.out.println(Math.round(10.51)); // 11
		System.out.println(Math.round(-10.5)); // -10
		System.out.println(Math.round(-10.51)); // -11
		System.out.println(Math.round(-10.6)); // -11
		System.out.println(Math.round(-10.2)); // -10

	}

}
