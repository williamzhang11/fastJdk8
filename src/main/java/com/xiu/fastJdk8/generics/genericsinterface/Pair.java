package com.xiu.fastJdk8.generics.genericsinterface;

/**
 * 定义泛型类实现泛型接口，并进行了泛型扩充
 * @param <T>
 * @param <E>
 */
public class Pair<T,E> implements Generator<T> {

    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }

    public static void main(String [] args){

        Pair<String,Integer> pair = new Pair<>("hello",100);

        System.out.println("key:"+pair.getKey()+" value:"+pair.getValue());
    }
}
