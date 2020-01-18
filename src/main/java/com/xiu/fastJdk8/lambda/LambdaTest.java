package com.xiu.fastJdk8.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyInterfaceImpl();
		
		//实现类
		myInterface.testMethod();
		
		//匿名内部类
		MyInterface myInterface2 = new MyInterface() {
			
			public void testMethod() {
				System.out.println("匿名内部类");
			}
		};
		
		myInterface2.testMethod();
		//lambda表达式
		MyInterface myInterface3 = () -> System.out.println("lambda");
		myInterface3.testMethod();
		//lambda表达式创建接口实现类对象
		MyInterface2 mInterface22 = (int x)-> System.out.println("lambda参数是"+x);
		
		mInterface22.testMethod(99);
		
		MyInterface3 mInterface33 = (x,y)->{
			System.out.println("参数1："+x);
			System.out.println("参数2："+y);
			return "lambda";
		};
		mInterface33.testMethod(11, 22);
		
		MyInterface3 mInterface44 = (x,y)->"lambda";
		System.out.println(mInterface44.testMethod(11, 22));
		
		
		
	}
}
