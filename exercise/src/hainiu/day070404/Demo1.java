package hainiu.day070404;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        //将创建流对象的动作放入try的小括号中
        try(FileInputStream fis=new FileInputStream("C:\\Users\\觋时雨\\Desktop\\图\\Alice.jpg");
            FileOutputStream fos=new FileOutputStream("exercise\\Alice.jpg");
        ) {//读写操作仍然在try的大括号中
            //一次读取一个字节数组（缓冲区）1960
            byte[] buffer=new byte[8192];
            int len;
            while ((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            //异常处理
            e.printStackTrace();
        }//上述流资源会自动关闭
    }
}
