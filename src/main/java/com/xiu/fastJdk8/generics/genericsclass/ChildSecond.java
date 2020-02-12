package com.xiu.fastJdk8.generics.genericsclass;
//如果子类不是泛型类，父类则要明确泛型类型，父类如果不指定，则父类默认Object
public class ChildSecond extends Parent<Integer> {

    @Override
    public Integer getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Integer value) {
        super.setValue(value);
    }

    public static void main(String [] args){

        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(100);
        System.out.println(childSecond.getValue());
    }
}
