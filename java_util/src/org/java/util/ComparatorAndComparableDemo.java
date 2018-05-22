package org.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 类排序接口(Comparable): 实现该接口的类具有排序功能
 * 比较器接口(Comparator): 是一个比较排序器接口,可以自定义排序比较规则
 * 
 * @author VIC
 *
 */
public class ComparatorAndComparableDemo {
	
	public static void main(String[] args) {
		// 学生集合
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"小马"));
		students.add(new Student(2,"小虾"));
		students.add(new Student(3,"小陈"));
		students.add(new Student(4,"小李"));
		students.add(new Student(5,"小王"));
		
		System.out.println("未排序学生列表: " + students);
		// 使用Collections.sort排序
		Collections.sort(students);
		System.out.println("已排序学生列表: " + students);
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().hashCode() - o2.getName().hashCode();
			}
		});
		
		System.out.println("再排序学生列表: " + students);
	}

}
