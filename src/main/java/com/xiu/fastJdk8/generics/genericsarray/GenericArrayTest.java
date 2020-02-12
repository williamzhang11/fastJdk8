package com.xiu.fastJdk8.generics.genericsarray;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArrayTest {

    public static void main(String [] args){

        ArrayList[] list = new ArrayList[5];
        ArrayList<String> [] listArr = list;

        System.out.println("-----------------------------");

        Fruit<String> fruit = new Fruit<>(String.class,3);

        fruit.put(0,"pingguo");
        fruit.put(1,"xigua");
        fruit.put(2,"xiangjiao");

        System.out.println(Arrays.toString(fruit.getArray()));
        System.out.println(fruit.get(2));

    }
}
