package JavaLearning.IO;



import java.io.File;
import java.io.IOException;


public class Newfile1 {
    public static String path="./";
    public static String filename="Newfile1.txt";
    public static void main(String[] args) {
        createfile();
    }
    public static void createfile()
    {
        File file = new File(path,filename);
        try {
            file.createNewFile();
        System.out.println("ok");
    } catch(IOException e){
            e.printStackTrace();
    }
    }

}
