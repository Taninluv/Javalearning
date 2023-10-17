package Reflect;

import java.lang.reflect.Constructor;

public class GetConstructor {
    public static void main(String[] args) throws Exception{
        Class c1 = Class.forName("Reflect.PersonConstructor");
        Constructor[] constructors1=c1.getDeclaredConstructors();
        Constructor[] constructors2=c1.getConstructors();
        for (Constructor c:constructors1){
            System.out.println(c);
        }
        System.out.println("--------------分割线--------------");
        for (Constructor c:constructors2){
            System.out.println(c);
        }
        System.out.println("--------------分割线--------------");
        Constructor constructor3 =c1.getConstructor(String.class,int.class);
        System.out.println(constructor3);
        System.out.println("--------------分割线--------------");
        Constructor constructors4 = c1.getDeclaredConstructor(String.class);
        System.out.println(constructors4);
    }
}
