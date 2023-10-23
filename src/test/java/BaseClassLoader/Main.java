package BaseClassLoader;

public class Main {
    public static void main(String[] args) throws Exception{
//        Person2Loader person2Loader = new Person2Loader();//实例化对象 静态代码块、构造代码块、无参构造器
//        Person2Loader.staticAction();//调用静态方法 静态代码块、静态方法
//        Person2Loader.staticVar=1;//对类中的静态成员变量赋值 静态代码块
//        Class c = Person2Loader.class; // 获取类 静态代码块
//        Class.forName("BaseClassLoader.Person2Loader");//使用 forName 获取类 静态代码块
//        Class.forName("BaseClassLoader.Person2Loader",false,ClassLoader.getSystemClassLoader());
        ClassLoader c = ClassLoader.getSystemClassLoader();
        c.loadClass("BaseClassLoader.Person2Loader");
    }
}
