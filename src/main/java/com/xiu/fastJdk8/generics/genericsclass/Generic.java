package com.xiu.fastJdk8.generics.genericsclass;

/**
 * 泛型类
 * @param <T>泛型标识
 *           T创建对象时指定具体数据类型
 */
public class Generic<T> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Generic(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
