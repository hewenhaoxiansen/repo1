package org.java.util;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 学生类
 * @author VIC
 *
 */
public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return o.id - this.id;
	}
	
	/**
	 * 重写hashcode方法
	 */
	@Override
	public int hashCode() {
//		System.out.println("this.hashcode");
		return this.getName().hashCode();
	}
	
	/**
	 * 重写equals方法
	 */
	@Override
	public boolean equals(Object obj) {
//		System.out.println("this.equals");
		if(null == obj){
			return false;
		}
		
		if(!(obj instanceof Student)){
			return false;
		}
		
		Student student = (Student)obj;
		return this.getName().equals(student.getName());
	}
	
	
}
