package com.xiu.fastJdk8.generics.genericsfunction;

import java.util.ArrayList;
import java.util.Random;

/**
 *泛型类不支持包含泛型标识的静态方法
 * @param <T>
 */
public class ProductGetter<T> {

    Random random = new Random();

    private T product;

    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T t){
        list.add(t);
    }

    public T getProduct(){
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 泛型方法中的泛型标识，只能使用当前方法中泛型列表中定义 的泛型标识
     * 泛型方法是独立于泛型类的
     * @param list 参数
     * @param <E>   泛型标识，
     * @return
     */
    public <E> E getProduct(ArrayList<E> list){

        return list.get(random.nextInt(list.size()));
    }

    /**
     * 静态泛型方法
     * @param t
     * @param e
     * @param k
     * @param <T>
     * @param <E>
     * @param <K>
     */
    public static <T,E,K> void printType(T t,E e,K k){

        System.out.println(t + "\t" +t.getClass().getSimpleName());
        System.out.println(e + "\t" +e.getClass().getSimpleName());
        System.out.println(k + "\t" +k.getClass().getSimpleName());
    }

    /**
     * 泛型可变参数
     * @param e
     * @param <E>
     */
    public static <E> void print(E ... e){
        for( int i =0;i<e.length;i++){
            System.out.println(e[i]);
        }
    }

    public static void main(String [] args){


        ProductGetter<Integer> integerProductGetter = new ProductGetter<>();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("biji");
        strings.add("shouji");
        strings.add("jiqiren");
        String pr =integerProductGetter.getProduct(strings);
        System.out.println(pr+"\t"+pr.getClass().getSimpleName());

        System.out.println("-------------------------------------------");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);
        Integer pr1 =integerProductGetter.getProduct(integers);
        System.out.println(pr1+"\t"+pr1.getClass().getSimpleName());

        ProductGetter.printType("100",11,true);

        ProductGetter.print(1,2,3,4,4);
    }
}
