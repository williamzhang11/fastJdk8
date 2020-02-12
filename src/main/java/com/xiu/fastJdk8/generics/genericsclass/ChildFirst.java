package com.xiu.fastJdk8.generics.genericsclass;

public class ChildFirst<T> extends Parent<T> {

    @Override
    public T getValue() {
        return super.getValue();
    }

    public static void main(String [] args){

        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("abc");
        System.out.println(childFirst.getValue());
    }
}
