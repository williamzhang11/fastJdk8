package com.xiu.fastJdk8.generics.typeerasure;

import java.lang.reflect.Field;

public class ErasureTest {
    public static void main(String [] args){

        Erasure<Integer> erasure = new Erasure<>();
        Class<? extends Erasure> clz = erasure.getClass();
        Field[] declaredFields = clz.getDeclaredFields();

        for(Field declaredFiled:declaredFields){
            //打印成员变量的名称和类型
            System.out.println(declaredFiled.getName()+":"+declaredFiled.getType());
        }

    }
}











