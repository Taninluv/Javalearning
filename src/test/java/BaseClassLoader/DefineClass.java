package BaseClassLoader;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DefineClass {

    public static void main(String[] args) throws Exception{
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Method method = ClassLoader.class.getDeclaredMethod("defineClass",String.class,byte[].class, int.class, int.class);
        method.setAccessible(true);
        byte[] code = Files.readAllBytes(Paths.get("D:\\Calc.class"));
        Class c = (Class) method.invoke(classLoader,"BaseClassLoader.Calc",code,0,code.length);
        c.newInstance();
    }
}
