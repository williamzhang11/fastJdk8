package com.xiu.fastJdk8.generics.typeerasure;

public class Erasure<T extends Number> {

    private  T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
