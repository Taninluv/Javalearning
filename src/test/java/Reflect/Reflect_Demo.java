package Reflect;

import java.lang.reflect.Method;

public class Reflect_Demo {
    public static void main(String[] args) throws Exception {
        Class c1=Class.forName("java.lang.Runtime");
        Method method = c1.getMethod("exec", String.class);
        Method RuntimeMethod = c1.getMethod("getRuntime");
        Object o1 = RuntimeMethod.invoke(c1);
        method.invoke(o1,"C:\\WINDOWS\\System32\\calc.exe");
//        Class c1 = Class.forName("java.lang.Runtime");
//        c1.getMethod("exec", String.class).invoke(c1.getMethod("getRuntime").invoke(c1), "C:\\WINDOWS\\System32\\calc.exe");
    }
}
