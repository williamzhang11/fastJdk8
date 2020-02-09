package com.xiu.fastJdk8.contructor;

public class Student1 {
	
	private String name;
	private int age;
	
	
	public Student1() {
		System.out.println("空构造器");
	}
	
	public Student1(int age) {
		System.out.println("构造器age");
		this.age = age;
	}




	public Student1(String name, int age) {
		System.out.println("有参构造器");
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
	
}
