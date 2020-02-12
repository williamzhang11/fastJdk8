package com.xiu.fastJdk8.generics.genericsinterface;

/**
 * 实现泛型接口的类，不是泛型类的话，需要明确实现泛型接口的数据类型
 *
 */
public class Apple implements Generator<String>{

    @Override
    public String getKey() {
        return "hello";
    }

    public static void main(String [] args){

        Apple apple = new Apple();
        System.out.println(apple.getKey());
    }
}
