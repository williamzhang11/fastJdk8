package com.xiu.fastJdk8.generics.genericsclass;

public class Parent<E> {

    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
