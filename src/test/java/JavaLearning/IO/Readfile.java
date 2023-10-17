package JavaLearning.IO;

import java.io.File;

public class Readfile {

    public static void main(String[] args) {
        readfile();
    }
    public static void  readfile(){
        File file = new File("./Newfile1.txt");
        System.out.println("文件名称为：" + file.getName());
        System.out.println("文件的绝对路径为：" + file.getAbsolutePath());
        System.out.println("文件的父级目录为：" + file.getParent());
        System.out.println("文件的大小(字节)为：" + file.length());
        System.out.println("这是不是一个文件：" + file.isFile());
        System.out.println("这是不是一个目录：" + file.isDirectory());
    }
}
