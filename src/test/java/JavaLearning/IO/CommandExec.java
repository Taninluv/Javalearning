package JavaLearning.IO;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class CommandExec {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Runtime.getRuntime().exec("whoami").getInputStream();
        byte[] cache =new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int readLen = 0;
        while ((readLen=inputStream.read(cache))!=-1){
//            byteArrayOutputStream.write(cache,0,readLen);
            byteArrayOutputStream.write(cache);
//            System.out.println((char) readLen);


        }
        System.out.println(byteArrayOutputStream);
    }
}
