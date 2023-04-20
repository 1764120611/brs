package hainiu.H0404.H1;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*File f = new File("C:\\Users\\觋时雨\\Desktop\\test\\BigData.txt");
        f.createNewFile();
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());*/
        File f2 = new File("C:\\Users\\觋时雨\\Desktop\\图");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            if (file.isFile()){
                System.out.println(file.getName());
            }

        }

    }
}
