package hainiu.H0404.H1;

import java.io.File;

//File类的常用API。联系时注意：测试文件夹。
public class Demo1 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\觋时雨\\Desktop\\test\\java.txt");
        System.out.println(f1);
        File f2=new File("C:\\Users\\觋时雨\\Desktop\\test","java.txt");
        System.out.println(f2);
        File f3=new File("C:\\Users\\觋时雨\\Desktop\\test");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);

    }
}
