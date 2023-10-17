package Reflect;
//一般我们获取 class 对象就有以下三种方法:
//        方法一、实例化对象的getClass()方法
//        方法二、 使用类的 .class 方法
//        方法三、Class.forName(String className)
public class GetClassName {
    public static void main(String[] args) throws Exception{
        Class c1 = Person.class;
        System.out.println(c1.getName());
        Person person=new Person();
        Class c2 = person.getClass();
        System.out.println(c2.getName());
        Class c3 = Class.forName("Reflect.Person");
        System.out.println(c3.getName());
    }

}
