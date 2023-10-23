package BaseClassLoader;

import sun.misc.Unsafe;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.ProtectionDomain;

public class UnsafeClassLoader {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        Class<Unsafe> unsafeClass = Unsafe.class;
        Class unsafeClass = Unsafe.class;
        Field unsafeField = unsafeClass.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe classUnsafe = (Unsafe) unsafeField.get(null);
        Method defineClassmethod = unsafeClass.getMethod("defineClass", String.class, byte[].class, int.class, int.class, ClassLoader.class, ProtectionDomain.class);
        byte[]code= Files.readAllBytes(Paths.get("D:\\Calc.class"));
        Class calc = (Class) defineClassmethod.invoke(classUnsafe,"BaseClassLoader.Calc",code,0,code.length,classLoader,null);
        calc.newInstance();
    }
}
