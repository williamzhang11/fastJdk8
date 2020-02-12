package com.xiu.fastJdk8.generics.genericsclass;

public class GenericTest {

    public static void main(String [] args){

        //泛性类在创建对象时获取指定类型
        Generic<String> stringGeneric = new Generic<>("a");
        System.out.println(stringGeneric.getKey());


        //泛性类在创建对象时，没有指定类型，按照Object类型操作

        Generic generic = new Generic("11");
        System.out.println(generic.getKey());

        //泛性类在创建对象时获取指定类型
        Generic<Integer> intGeneric = new Generic<>(1);
        System.out.println(intGeneric.getKey());
        //同一泛型类，根据不同数据类型创建对象，本质上是同一类型。
        System.out.println(intGeneric.getClass()==stringGeneric.getClass());

    }
}
