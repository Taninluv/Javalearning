package JavaLearning.IO;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutput {
    public static void main(String[] args) {
        writefile();
    }
    public static void writefile(){
        String path="./new.txt";
        FileOutputStream fileOutputStream=null ;
        try {
            fileOutputStream=new FileOutputStream(path);
            String content = "666water3!1!";
            try {
                //write(byte[] b) 将 b.length 个字节从指定 byte 数组写入此文件输出流中
                //String类型的字符串可以使用getBytes()方法将字符串转换为byte数组
                fileOutputStream.write(content.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
