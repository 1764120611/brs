package hainiu.day100408.ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\觋时雨\\Desktop\\test\\b.txt"));
        Object obj = ois.readObject();
        ArrayList<Student> arrayList = (ArrayList<Student>) obj;
        ois.close();
        for (Student s : arrayList) {
            System.out.println(s.getName() + "," + s.getAge());
        }
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\觋时雨\\\\Desktop\\\\test\\\\b.txt"));
        ArrayList<Object> arrayList = new ArrayList<>();
        Student s1=new Student("陆依依",20);
        Student s2=new Student("陆玲珑",22);
        arrayList.add(s1);
        arrayList.add(s2);
        oos.writeObject(arrayList);
        oos.close();*/


    }
}
