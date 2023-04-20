package hainiu.H0403.H3n;

import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        student1 s1=new student1("陆依依",22);
        student1 s2=new student1("沈蓉",23);
        student1 s3=new student1("小北",20);
        student1 s4=new student1("陆依依",22);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        for (Object stu : set) {
            System.out.println(stu);
        }
    }
}
