package com.xiu.fastJdk8.generics.genericsarray;

import java.lang.reflect.Array;

public class Fruit<T> {

    private T[] array ;

    public Fruit(Class<T>clz,int length) {
        this.array = (T[])Array.newInstance(clz,length);
    }

    /**
     *
     * @param index
     * @param item
     */
    public void put(int index,T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] getArray(){
        return array;
    }
}
