package com.xiu.fastJdk8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamTest {

	public static void main(String[] args) {
		
		//方法1:Collection接口的方法
		Collection<String> collection = new ArrayList<String>();
		Stream<String> s1 = collection.stream();
		Stream<String> s2 = collection.parallelStream();
		
		//方法2:通过Arrays中的stream方法:
		IntStream s3 = Arrays.stream(new int[] {1,2,3});
		
		//方式3:Stream中的of方法:
		Stream<String> s4 = Stream.of("aa","bb","cc");
		
		//方式4:Stream中的方法,创造无限流:(结果是无限多个)
		
		Stream<Integer> s5 = Stream.iterate(2, (x)->x+2);
		//s5.forEach(System.out::println);
		Stream<Double> s6 = Stream.generate(()->Math.random());
		s6.forEach((x)->System.out.println(x));
	}
}
















