package hainiu.H0404.H4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\觋时雨\\Desktop\\test\\student.txt"));
        ArrayList<Object> arrayList = new ArrayList<>();
        student s1 = new student("沈蓉", 25);
        student s2 = new student("安诺", 20);
        arrayList.add(s1);
        arrayList.add(s2);
        oos.writeObject(arrayList);
        oos.close();

    }
}
