# 泛型与数组

可以声明带泛型的数组引用，但不能直接创建带泛型的数组对象

可通过java.lang.reflect.array的newInstance(Class<T>,int ) 创建T[]数组