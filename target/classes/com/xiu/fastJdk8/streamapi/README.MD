# Stream API

lambda表达式与Stream API是JDK8的2大特性.其中Stream API真正把函数式编程风格引入java中.

Stream API主要是用来进行集合的操作.可对集合进行复杂的查找,过滤,映射等操作.是一种高效且易于使用的
处理数据的方式.

## 1.过程 

	1.对数组,集合等数据源,通过Stream(流)进行一系列的流水线式操作,如:先过滤再切片/再查询
	2.处理后会产生一个新流,原来的数据源不会发生任何改变.

与原来集合增删该查操作的明显区别在于:

	1.原来的集合操作,会改变数据源的数据
	2.现在的stream的操作,数据源不会改变

## 2.步骤
	
	1.产生一个流(Stream).一个数据源,获取一个流
	2.中间链式操作.一个中间的操作链,对数据源的数据进行处理
	3.产生一个新流:一个终止操作,执行中间操作,产生结果
	
注意:Stream操作是延迟执行的,需要结果时才会执行
	
	
### 2.1创建流

方法1:Collection接口的方法
方法2:通过Arrays中的stream方法
方式3:Stream中的of方法
方式4:Stream中的方法,创造无限流:(结果是无限多个)



### 2.2中间操作

Stream操作是延迟的，只有有了终止操作，中间操作才会执行


#### 2.2.1筛选与切片

filter：过滤
利用Stream API内部迭代
之前写的for循环是外部迭代

limit:只要找到几个符合条件的，后面的就不在进行

skip:跳过前几个满足条件的

distinct:去重，自定义的类要重写hashCode与equals

#### 2.2.2映射

map:接收Lambda表达式,将元素转换成其他形式或提取信息。接收一个参数，该参数
会被应用到每个元素上，并将其映射成一个新元素

#### 2.2.3 排序

sorted:自然顺序，升序

### 3.终止操作

#### 3.1匹配

allMatch：是不是所有的都符合某个条件

anyMatch：存在一个符合某个条件

noneMatch：都不符合某个条件

#### 3.2查找

Optional：是为了防止出现空指针，出现的

findFirst：取第一个

findAny：获取任意一个

count：计数

max：最大值

min：最小值

forEach：每一个进行操作

#### 3.3规约操作

reduce:将流中的元素反复结合起来运算，得到一个值。

#### 3.4收集操作

用于给Stream中元素进行汇总

Collectors.toList():提取所有学生名字放入指定list集合

Collectors.toSet():提取所有学生名字放入指定set集合,去重

Collectors.toMap:提取所有学生名字放入指定map集合,去重

Collectors.counting():计数

Collectors.averagingDouble():平均值

Collectors.averagingDouble():总和

Collectors.averagingDouble():最大

Collectors.averagingDouble():最小

Collectors.groupingBy():分组

Collectors.partitioningBy():分区 符合条件的一组，不符合另一组

Collectors.joining():连接

























