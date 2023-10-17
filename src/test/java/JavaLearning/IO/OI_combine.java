package JavaLearning.IO;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OI_combine {
    public static void main(String[] args) {
        copyfile();
    }
    public static void  copyfile(){
        String srcFile="./new.txt";
        String desFile="./Newfile1.txt";
        FileOutputStream fileOutputStream=null;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream =new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(desFile);
            byte[] cache = new byte[1024];
            int readlen = 0;
            while ((readlen=fileInputStream.read(cache))!=-1)
            {
                fileOutputStream.write(cache,0,readlen);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            }catch (IOException e)
            {e.printStackTrace();
        }
    }
}}
