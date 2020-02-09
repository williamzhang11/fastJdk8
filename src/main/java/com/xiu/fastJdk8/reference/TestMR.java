package com.xiu.fastJdk8.reference;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class TestMR {
	public static void main(String[] args) {
		
		//使用lambda表达式 +匿名内部类+内置函数式接口
		Student student = new Student("lili", 18, 167.5);
		Supplier<String> supplier = ()->  student.getName();
		String str =supplier.get();
		System.out.println(str);
		
		//方法引用(对象::实例方法名)
		
		Student student1 = new Student("liming", 18, 167.5);
		Supplier<String> supplier1 = student1::getName;
		String str1 =supplier1.get();
		System.out.println(str1);
		
		//lambda表达式
		Comparator<Integer> comparator = (x,y)->Integer.compare(x, y);
		System.out.println(comparator.compare(12, 19));
		
		//方法引用(类::静态方法名)
		Comparator<Integer> com2=Integer::compare;
		System.out.println(com2.compare(12, 19));
		
		//lambda表达式
		BiPredicate<String, String> bp = (x,y)->x.equals(y);
		System.out.println(bp.test("abc", "abc"));
		
		//方法引用:
		BiPredicate<String, String> bp2 = String::equals; 
		System.out.println(bp2.test("abc", "abc"));
	}
}










