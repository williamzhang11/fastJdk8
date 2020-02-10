package com.xiu.fastJdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamAPIFunctionTest {
	
	List<Student> list = Arrays.asList(
			new Student("lili", 19, 160.8),
			new Student("feifie", 12, 170.8),
			new Student("lulu", 21, 160.8),
			new Student("lili", 19, 160.8),
			new Student("nana", 18, 167.8),
			new Student("lili", 19, 160.8),
			new Student("xiaoming", 17, 150.8),
			new Student("xiaogang", 20, 190.8)
	);
	
	@Test
	public void testFilter() {
		
		//1.创建Stream
		Stream<Student> stream = list.stream();
		
		//2.中间操作
		//查找年龄大于18的
		Stream<Student> stream1 = stream.filter( x -> x.getAge() >= 18);

		//3.终止操作
		stream1.forEach(x->System.out.println(x));
	}

	@Test
	public void testFilter1() {

		//1.创建Stream
		Stream<Student> stream = list.stream();

		//2.中间操作
		//查找年龄大于18的
		Stream<Student> stream1 = stream.filter( x -> {
			System.out.println("正在过滤");
			return  x.getAge() >= 18;
		});

		//3.终止操作
		//stream1.forEach(x->System.out.println(x));
	}

	@Test
	public void testFilter2() {

		//内部迭代
		//1.创建Stream
		//2.中间操作
		//查找年龄大于18的
		//3.终止操作
		list.stream().filter( x -> {
			System.out.println("正在过滤");
			return  x.getAge() >= 18;
		}).forEach(x->System.out.println(x));
	}

	//limit:只要找到几个符合条件的，后面的就不在进行
	@Test
	public void testLimit(){
		list.stream().filter(x->

		{
			System.out.println("正在过滤");
			return x.getAge()>=18;

		}).limit(2).forEach(System.out::println);


	}

	//Skip：跳过前几个满足条件的
	@Test
	public void testSkip(){
		list.stream().filter(x->

		{
			System.out.println("正在过滤");
			return x.getAge()>=18;

		}).skip(2).forEach(System.out::println);
	}

	//distinct：去重，要重写hashCode与equals
	@Test
	public void testDistinct(){
		list.stream().filter(x->

		{
			System.out.println("正在过滤");
			return x.getAge()>=18;

		}).distinct().forEach(System.out::println);
	}


}















