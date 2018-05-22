package org.java.util;

/**
 * Object(对象)类: 是所有类的父类(超类,根类),所有类是Object类的子类,该类可以表示任何类型,所有的子类都继承了他的所有方法
 * 
 * Object类构造函数:
 * 
 * 1. Object(); 构造一个空对象
 * 
 * Object类方法:
 * 
 * clong(): 克隆对象
 * equeals(): 比较对象,Object类中的equeals方法默认是比较2个对象的地址
 * wait(): 让获取到该对象的对象锁的当前线程等待
 * notify(): 唤醒等待获取该对象的锁的任意一个线程
 * toString(): 获取该对象的字符串形式
 * hashCode(): 获取该对象的哈希码
 * getClass(): 获取该对象的类型对象
 * finalize(): gc调用该方法，释放该对象中的资源
 * 
 * 1. hashcode不同,值可以相同
 * 2. hashcode相同,但是值不一定相同(在hashMap中)
 * 3. Object类中的equeals方法默认是比较2个对象的引用地址
 * 4. 如果要重写hashcode或equeals，则2个都必须重写
 * 4.1 如果equeals比较2个对象相同，那么他们的hashcode也应该相同
 * 
 * @author VIC
 *
 */
public class ObjectDemo {
	
	public static void main(String[] args) {
		// 使用new关键字创建对象,在堆中会开辟对应的空间来存储新建的对象
		// 以下创建了2个Object对象,他们的内容是相同，但是他们在堆中存放的是不同的地方,是不同的2个对象，hashcode也不同
		Object object1 = new Object();
		Object object2 = new Object();
		// 获取对象的hashcode
		System.out.println("object1 hashcode: " + object1.hashCode());
		System.out.println("object2 hashcode: " + object2.hashCode());
		
		// 比较2个对象
		// object1与object2存在堆中不同的地址所有他们不是同一个对象
		boolean object1IsObject2 = object1.equals(object2);
		System.out.println("两个对象是否相同: " + object1IsObject2);
		
		// 比较2个对象(在没有重写equals方法时,默认调用的是Object类的equals方法),Object的equals是比较2个对象引用地址
		Student xiaoming = new Student(1, "小明");
		Student xiaohua = new Student(1, "小白");
		System.out.println("xiaoming hashcode: " + xiaoming.hashCode());
		System.out.println("xiaohua hashcode: " + xiaohua.hashCode());
		System.out.println("xiaoming.equals(xiaohua): " + xiaoming.equals(xiaohua));
		
		
	}
}


/**
 * 子类
 * @author VIC
 *
 */
class SubObject extends Object {
	
}

