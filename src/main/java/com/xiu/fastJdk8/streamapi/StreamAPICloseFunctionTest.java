package com.xiu.fastJdk8.streamapi;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPICloseFunctionTest {

    List<Student> list = Arrays.asList(
            new Student("lili1", 19, 160.8),
            new Student("feifie", 12, 170.8),
            new Student("lulu", 21, 160.8),
            new Student("lili2", 19, 160.8),
            new Student("nana", 18, 167.8),
            new Student("lil3i", 19, 160.8),
            new Student("xiaoming", 17, 150.8),
            new Student("xiaogang", 20, 190.8)
    );

    //是不是所有人都大于18
    @Test
    public void allMatchTest(){

        Boolean b = list.stream().allMatch(x->x.getAge()>18);
        System.out.println(b);
    }

    //是不是有一个大于18
    @Test
    public void anyMatchTest(){

        Boolean b = list.stream().anyMatch(x->x.getAge()>18);
        System.out.println(b);
    }

    //都不大于18
    @Test
    public void noneMatchTest(){

        Boolean b = list.stream().noneMatch(x->x.getAge()>18);
        System.out.println(b);
    }

    //获取排序后第一个
    @Test
    public void findFirstTest(){

        Optional<Student> op = list.stream().sorted((x, y)->{
            return x.getAge() - y.getAge();
        }
        ).findFirst();

        System.out.println(op.get());
    }

    //获取任意一个
    @Test
    public void findAnyTest(){

        Optional<Student> op = list.stream().filter(x->x.getAge()==19).findAny();

        System.out.println(op.get());
    }

    //计数
    @Test
    public void countTest(){

        Long count = list.stream().count();

        System.out.println(count);
    }

    //最大值
    @Test
    public void maxTest(){

       Optional<Student> student = list.stream().max((x,y)->x.getAge()-y.getAge());

        System.out.println(student);
    }

    //最小值
    @Test
    public void minTest(){

        Optional<Student> student = list.stream().min((x,y)->x.getAge()-y.getAge());

        System.out.println(student);
    }

    //每一个进行操作
    @Test
    public void foreachTest(){

        list.stream().forEach(x->System.out.println(x));

    }

    //规约：将流中的元素反复结合起来运算，得到一个值。
    @Test
    public void reduceTest(){
        List<Integer> list =Arrays.asList(1,2,3,4,5);
        Integer sum = list.stream().reduce(0,(x,y)-> x + y);

        System.out.println(sum);
    }

    //reduce:每一个进行操作
    @Test
    public void reduceTest1(){

       double sum = list.stream().
               map(x->x.getSalary()).
               reduce(0.0,(x,y)->Double.sum(x,y));
        System.out.println(sum);
    }

    //Collectors.toList():提取所有学生名字放入指定list集合
    @Test
    public void collectionListTest(){

        List<String> list1 = list.stream()
                .map(x->x.getName())
                .collect(Collectors.toList());

        for(String a:list1){
            System.out.println(a);
        }
    }

    //Collectors.toSet():提取所有学生名字放入指定set集合,去重
    @Test
    public void collectionSetTest(){

        Set<String> list1 = list.stream()
                .map(x->x.getName())
                .collect(Collectors.toSet());

        for(String a:list1){
            System.out.println(a);
        }
    }

    //Collectors.toMap:提取所有学生名字放入指定map集合,去重
    @Test
    public void collectionMapTest(){

        Map<String,Double> map = list.stream()
                .collect(Collectors.toMap(x->x.getName(),y->y.getSalary()));

        Set<Map.Entry<String, Double>> entries = map.entrySet();

        for(Map.Entry<String, Double> entry :entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }


    //Collectors.counting():计数
    @Test
    public void collectorCountingTest(){

        Long num = list.stream()
                .collect(Collectors.counting());
        System.out.println(num);
    }

    //Collectors.averagingDouble():平均值
    @Test
    public void collectorAveragingTest(){

        Double collect = list.stream()
                .collect(Collectors.averagingDouble(x -> x.getSalary()));
        System.out.println(collect);
    }
    //Collectors.averagingDouble():总和
    @Test
    public void collectorSumTest(){

        Double collect = list.stream()
                .collect(Collectors.summingDouble(x -> x.getSalary()));
        System.out.println(collect);
    }
    //Collectors.averagingDouble():最大
    @Test
    public void collectorMaxTest(){

        Optional<Student> student = list.stream()
                .collect(Collectors.maxBy((x,y)->Double.compare(x.getSalary(),y.getSalary())));
        System.out.println(student);
    }

    //Collectors.averagingDouble():最小
    @Test
    public void collectorMinTest(){

        Optional<Student> student = list.stream()
                .collect(Collectors.minBy((x,y)->Double.compare(x.getSalary(),y.getSalary())));
        System.out.println(student);
    }

    //Collectors.groupingBy():分组
    @Test
    public void collectorGroupByTest(){

        Map<Integer, List<Student>> collect = list.stream()
                .collect(Collectors.groupingBy(x -> x.getAge()));

        Set<Map.Entry<Integer, List<Student>>> entries = collect.entrySet();

        for(Map.Entry<Integer, List<Student>> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    //Collectors.partitioningBy():分区 符合条件的一组，不符合另一组
    @Test
    public void collectorPartitioningByTest(){

        Map<Boolean, List<Student>> collect = list.stream()
                .collect(Collectors.partitioningBy(x -> x.getAge() >= 18));

        Set<Map.Entry<Boolean, List<Student>>> entries = collect.entrySet();

        for(Map.Entry<Boolean, List<Student>> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    //Collectors.joining():连接
    @Test
    public void collectorJoiningTest(){

        String collect = list.stream()
                .map(x -> x.getName()).collect(Collectors.joining());


        System.out.println(collect);

    }


}
