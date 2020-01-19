package com.xiu.fastJdk8.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	
	public static List<String> filterString(List<String> list,PredicateInteface predicateInteface){
		List<String> filterList = new ArrayList<String>();
		
		for(String s:list) {
			if(predicateInteface.getString(s)) {
				filterList.add(s);
			}
		}
		
		return filterList;
	}
	
	public static List<String> filterString1(List<String> list,Predicate<String> p){
		List<String> filterList = new ArrayList<String>();
		
		for(String s:list) {
			if(p.test(s)) {
				filterList.add(s);
			}
		}
		
		return filterList;
	}
	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ab1111","dd2","d11111s");
		
		//第一种：匿名内部类
		PredicateInteface predicateInteface = new PredicateInteface() {
			
			@Override
			public boolean getString(String str) {
				return str.length() > 5;
			}
		};
		
		List<String> newList = filterString(list, predicateInteface);
		
		for(String string : newList) {
			System.out.println(string);
		}
		
		//第二种匿名内部类+内置函数式接口
		List<String> newList1 = filterString1(newList, new Predicate<String>() {

			@Override
			public boolean test(String arg0) {
				return arg0.length() >5;
			}
		});
		
		for(String string : newList1) {
			System.out.println(string);
		}
		
		//第三种匿名内部类+内置函数式接口+lambda表达式
		filterString1(newList1, str->str.length()>5);
		
		
		
		
		
	}
}
