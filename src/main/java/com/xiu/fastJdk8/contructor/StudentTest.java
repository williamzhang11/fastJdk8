package com.xiu.fastJdk8.contructor;

import java.util.function.Function;
import java.util.function.Supplier;

public class StudentTest {

	public static void main(String[] args) {
		
		//lambda表达式
		Supplier<Student1> supp = ()->new Student1();
		Student1 student1 = supp.get();
		System.out.println(student1);
		
		//构造器引用(无参数传入)
		Supplier<Student1> supp2 = Student1::new;
		Student1 student2 = supp2.get();
		System.out.println(student2);
		
		//构造器引用
		Function<Integer, Student1> func = Student1::new;
		
		Student1 student3 = func.apply(18);
		
		System.out.println(student3);
	}
}
