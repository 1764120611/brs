package hainiu.H0404.H4;

import java.io.*;
import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\觋时雨\\Desktop\\test\\student.txt"));
        Object obj = ois.readObject();
        ArrayList<student>arrayList=(ArrayList<student>)obj;
        ois.close();
        for (student student : arrayList) {
            System.out.println(student.getName()+","+ student.getAge());
        }
    }
}
