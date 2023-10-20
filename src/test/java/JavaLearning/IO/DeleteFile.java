package JavaLearning.IO;

import java.io.File;

public class DeleteFile {
    public static String path="./";
    public static String filename="Newfile1.txt";
    public static void main(String[] args) {
        deleteFile();
    }
    public static void deleteFile(){


        File file = new File(path,filename);
        System.out.println(file.delete()?"ok":"sad");
    }
}
