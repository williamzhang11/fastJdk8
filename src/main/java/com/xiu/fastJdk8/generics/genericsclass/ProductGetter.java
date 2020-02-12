package com.xiu.fastJdk8.generics.genericsclass;

import java.util.ArrayList;
import java.util.Random;

/**
 *
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

    public static void main(String [] args){

        ProductGetter<String> stringProductGetter = new ProductGetter<>();
        String[] strings = {"苹果","华为"};

        for(int i=0; i< strings.length;i++){
            stringProductGetter.addProduct(strings[i]);
        }

        System.out.println(stringProductGetter.getProduct());


        System.out.println("-------------------------------------");

        ProductGetter<Integer> integerProductGetter = new ProductGetter<>();
        int[] intProducts = {1,2,3};

        for(int i=0; i< intProducts.length;i++){
            integerProductGetter.addProduct(intProducts[i]);
        }

        System.out.println(integerProductGetter.getProduct());
    }
}
