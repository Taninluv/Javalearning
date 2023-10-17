package Reflect;

import java.lang.reflect.Method;

// 反射创建对象
//        反射创建对象，也叫做反射之后实例化对象，这里用到的是我们之前讲过的 newInstance() 方法
//        这里也顺便说下 invoke 方法，invoke 方法位于 java.lang.reflect.Method 类中，用于执行某个的对象的目标方法。
//        一般会和 getMethod 方法配合进行调用。
//
//        用法
//public Object invoke(Object obj, Object... args)
//        第一个参数为类的实例，第二个参数为相应函数中的参数
//
//        obj：从中调用底层方法的对象，必须是实例化对象
//
//        args： 用于方法的调用，是一个 object 的数组，参数有可能是多个
//
//        但需要注意的是，invoke 方法第一个参数并不是固定的：
//
//        如果调用这个方法是普通方法，第一个参数就是类对象；
//
//        如果调用这个方法是静态方法，第一个参数就是类；
public class AdvanceUsage {
    public static void main(String[] args)throws  Exception {
        Class c1 =Class.forName("Reflect.Person");
        Object m = c1.newInstance();
        Method method = c1.getMethod("reflect");
        Method method2 = c1.getDeclaredMethod("reflect2"); //私有方法
        method2.setAccessible(true);
        Method method3 = c1.getMethod("reflect3");//静态方法
        method.invoke(m);
        method2.invoke(m); //
        method3.invoke(null);
        System.out.println(method3);

    }
}
