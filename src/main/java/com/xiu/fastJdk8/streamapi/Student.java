package com.xiu.fastJdk8.streamapi;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;
		Student student = (Student) o;
		return getAge() == student.getAge() &&
				Double.compare(student.getSalary(), getSalary()) == 0 &&
				Objects.equals(getName(), student.getName());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getName(), getAge(), getSalary());
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}

	public Student(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
