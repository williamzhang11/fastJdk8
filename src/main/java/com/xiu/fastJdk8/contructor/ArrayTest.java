package com.xiu.fastJdk8.contructor;

import java.util.function.Function;

public class ArrayTest {

	public static void main(String[] args) {
		//lambda表达式
		Function<Integer, String[]> func =(x) ->new String[x];
		String[] strings = func.apply(3);
		//数组引用
		Function<Integer, String[]> func2 =String[]::new;
		String[] strings2 = func2.apply(3);
		
		System.out.println(strings2.length);
		
		
	}
}
