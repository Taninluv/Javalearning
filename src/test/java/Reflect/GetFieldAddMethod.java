package Reflect;
//获取成员变量 Field
//获取成员变量Field位于 java.lang.reflect.Field 包中
//
//        Field[] getFields() ：获取所有 public 修饰的成员变量
//
//        Field[] getDeclaredFields() 获取所有的成员变量，不考虑修饰符
//
//        Field getField(String name) 获取指定名称的 public 修饰的成员变量
//
//        Field getDeclaredField(String name) 获取指定的成员变量


import java.lang.reflect.Method;

//获取成员方法 Method
//        要注意以下，第一个参数是传参，第二个参数是确定重载的是哪个函数。
//        JAVA
//        Method getMethod(String name, 类<?>... parameterTypes) //返回该类所声明的public方法
//
//        Method getDeclaredMethod(String name, 类<?>... parameterTypes) //返回该类所声明的所有方法
//
////第一个参数获取该方法的名字，第二个参数获取标识该方法的参数类型
//
//        Method[] getMethods() //获取所有的public方法，包括类自身声明的public方法，父类中的public方法、实现的接口方法
//
//        Method[] getDeclaredMethods() // 获取该类中的所有方法
public class GetFieldAddMethod {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("Reflect.Person");
        Method[] methods1 = c1.getDeclaredMethods();//获取该类中的所有方法
        Method[] methods2 = c1.getMethods();//获取所有的 public 方法，包括类自身声明的 public 方法，父类中的  、实现的接口方法
        for (Method m : methods1) {
            System.out.println(m);
        }
        System.out.println("-------分割线---------");

        for (Method m : methods2) {
            System.out.println(m);
        }

        System.out.println("-------分割线---------");

//        Method methods3 = c1.getMethod("study", String.class);// 获取 Public 的 study 方法
        Method methods3 = c1.getMethod("study", String.class);// 获取 Public 的 study 方法
        System.out.println(methods3);
        System.out.println("-------分割线---------");

        Method methods4 = c1.getDeclaredMethod("sleep", int.class); // 获取 Private 的 sleep 方法
        System.out.println(methods4);
        System.out.println("-------分割线---------");

        Method methods5 = c1.getDeclaredMethod("reflect2"); // 获取 Private 的 sleep 方法
        System.out.println(methods5);

    }
}
