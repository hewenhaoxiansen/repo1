package org.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ������ӿ�(Comparable): ʵ�ָýӿڵ������������
 * �Ƚ����ӿ�(Comparator): ��һ���Ƚ��������ӿ�,�����Զ�������ȽϹ���
 * 
 * @author VIC
 *
 */
public class ComparatorAndComparableDemo {
	
	public static void main(String[] args) {
		// ѧ������
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"С��"));
		students.add(new Student(2,"СϺ"));
		students.add(new Student(3,"С��"));
		students.add(new Student(4,"С��"));
		students.add(new Student(5,"С��"));
		
		System.out.println("δ����ѧ���б�: " + students);
		// ʹ��Collections.sort����
		Collections.sort(students);
		System.out.println("������ѧ���б�: " + students);
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().hashCode() - o2.getName().hashCode();
			}
		});
		
		System.out.println("������ѧ���б�: " + students);
	}

}
