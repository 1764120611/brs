package hainiu.H0404.H1;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        //File f1 = new File("C:\\Users\\觋时雨\\Desktop\\test\\Java.txt");
        //f1.createNewFile();
        //删除当前目录下的java.txt文件
        //f1.delete();
        //File f2 = new File("C:\\Users\\觋时雨\\Desktop\\test\\test");
        //f2.mkdir();
        //删除test目录
        //f2.delete();
        //在当前目录下创建一个test目录再创建一个java文件
        File f1 = new File("C:\\Users\\觋时雨\\Desktop\\test\\test");
        File f2 = new File("C:\\Users\\觋时雨\\Desktop\\test\\test\\Java.txt");
        //f1.mkdir();
        //f2.createNewFile();
        System.out.println(f2.delete());
        System.out.println(f1.delete());



    }
}
