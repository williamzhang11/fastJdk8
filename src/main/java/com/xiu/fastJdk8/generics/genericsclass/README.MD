# 泛型类

泛型类，是在实例化类时指明泛型的具体类型


语法

```
class 类名称 <泛型标识，泛型标识，...>{

private 泛型标识 变量名;
}

```
常用泛型标识：

T,E,K,V

使用语法

```$xslt
类名<具体的数据类型> 对象名 =new 类名<具体的数据类型>();

```
## 从泛型类派生子类

1.如果子类也是泛型类，子类要和父类泛型类一致(至少一个一致，因为子类可以进行类型扩展)

```$xslt
    class ChildGeneric<T> extends Generic<T>
```

2.如果子类不是泛型类，父类则要明确泛型类型，父类如果不指定，则父类默认Object

```$xslt
    class ChildGeneric extend Generic<String>  
```
















