package hainiu.H0404.H1;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建一个文件Java.txt
        File f1 = new File("C:\\Users\\觋时雨\\Desktop\\test\\Java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----");
        //创建目录JavaSE
        File f2 = new File("C:\\Users\\觋时雨\\Desktop\\test\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("----");
        //创建一个多级目录JavaWEB\\HTML
        File f3 = new File("C:\\Users\\觋时雨\\Desktop\\test\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());


    }
}
