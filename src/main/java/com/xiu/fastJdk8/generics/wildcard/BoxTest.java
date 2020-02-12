package com.xiu.fastJdk8.generics.wildcard;

public class BoxTest {

    /**
     * 参数中有泛型，无法进行重载，也无法使用动态的思想进行继承
     * @param box
     */
  /*  public static void showBox(Box<Number> box){

        Number first = box.getFirst();
        System.out.println(first);
    }*/

    public static void showBox(Box<?> box){
        Object first = box.getFirst();
        System.out.println(first);
    }

    public static void showBox1(Box<? extends Number> box){
        Number first = box.getFirst();
        System.out.println(first);
    }

    public static void main(String [] args){

        Box<Number> box1 = new Box<>();
        box1.setFirst(100);
        showBox(box1);

        Box<Integer> box2 = new Box<>();
        box2.setFirst(2222);
        showBox1(box2);

    }
}
