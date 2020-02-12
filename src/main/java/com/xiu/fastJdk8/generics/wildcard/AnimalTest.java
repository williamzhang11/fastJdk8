package com.xiu.fastJdk8.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

    public static void main(String [] args){

        ArrayList<Animal>animals = new ArrayList<>();
        ArrayList<Cat>cats = new ArrayList<>();
        ArrayList<MiniCat>miniCats = new ArrayList<>();

        showAnimal(cats);
        showAnimal(miniCats);



    }

    /**
     * 泛型上限通配符，传递集合类型，只能是Cat类型或其子类型
     * @param list
     */
    public static void showAnimal(ArrayList<? extends Cat> list){
       // list.add(new Cat());
        //list.add(new Animal());
       // list.add(new MiniCat());
        //此处不能填充元素，因为类型不确定
        for(int i=0; i< list.size();i++){
            Cat cat = list.get(i);
            System.out.println(cat);
        }

    }

    /**
     * 类型通配符下限,要求集合只能是Cat或Cat的父类类型
     * @param list
     */
    public static void showAnimal1(List<?super Cat>list){
        //此处可以填充元素

        for(Object o :list){
            System.out.println(o);
        }
    }



}
