package BaseClassLoader;

public class Person2Loader {
    // 存放代码块

    public static int staticVar;
    public int instanceVar;

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    Person2Loader() {
        System.out.println("无参构造器");
    }

    Person2Loader(int instanceVar) {
        System.out.println("有参构造器");
    }

    public static void staticAction() {
        System.out.println("静态方法");
    }

}

