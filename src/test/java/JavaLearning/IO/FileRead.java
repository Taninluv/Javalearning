package JavaLearning.IO;

import java.io.FileReader;
import java.io.IOException;

//public class FileReader extends InputStreamReader
//用来读取字符文件的便捷类。此类的构造方法假定默认字符编码和默认字节缓冲区大小都是适当的。要自己指定这些值，可以先在 FileInputStream 上构造一个 InputStreamReader。
//        FileReader 用于读取字符流。要读取原始字节流，请考虑使用 FileInputStream。
public class FileRead {
    public String name="233";
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        String filepath = "./new.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filepath);
            int readlen = 0;
            char[] cache = new char[8];
            while ((readlen = fileReader.read(cache)) != -1) {
                System.out.println(new String(cache, 0, readlen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
