package com.xiu.fastJdk8.function;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void buySomething(double money,SpendMoney sMoney) {
		
		sMoney.buy(money);
	}
	
	
	public static void buySomething1(double money,Consumer<Double> sMoney) {
		
		sMoney.accept(money);
	}
	
	public static void main(String[] args) {
		//第一种匿名内部类
		SpendMoney sMoney = new SpendMoney() {
			@Override
			public void buy(double money) {
				System.out.println("购买spend："+money);
			}
		};
		
		buySomething(1000, sMoney);
		
		//第二种：匿名内部类+内置函数式接口 一个接口，只需要传入参数
		Consumer<Double> consumer = new Consumer<Double>() {
			@Override
			public void accept(Double money) {
				System.out.println("购买spend："+money);
			}
		};
		
		buySomething1(1000, consumer);
		
		
		//第三种：使用lambda表达式 +匿名内部类+内置函数式接口
		
		Consumer<Double> consumer2 = money -> System.out.println("spend:"+money);
		
		buySomething1(10000, consumer2);
		
		
	}
	
	
}
