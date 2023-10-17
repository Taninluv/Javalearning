package JavaLearning.IO;

import java.io.FileInputStream;

public class Fileinput {
    public static String path="./";
    public static String filename="Newfile1.txt";
    public static void main(String[] args) {
        readfile2();
    }
    public static void readfile2(){
        FileInputStream fileInputStream=null;
        int readData = 0;
        try{
            fileInputStream =new FileInputStream(path+filename);
            while  ((readData= fileInputStream.read())!=-1)
//                System.out.print((char) readData);
                System.out.println((char) readData);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
