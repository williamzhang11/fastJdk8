package com.xiu.fastJdk8.streamapi;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Student(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;
		Student student = (Student) o;
		return getAge() == student.getAge() &&
				Double.compare(student.getHeight(), getHeight()) == 0 &&
				Objects.equals(getName(), student.getName());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getName(), getAge(), getHeight());
	}
}
