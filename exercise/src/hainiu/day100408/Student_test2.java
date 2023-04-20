package hainiu.day100408;

import java.lang.reflect.Constructor;

public class Student_test2 {
    public static void main(String[] args) throws Exception {
        //获取类的字节码对象
        Class<Student> clazz = (Class<Student>) Class.forName("hainiu.day100408.Student");
        //获取某一个公共构造
        Constructor<Student> constructor1 = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor1);
        //使用公共构造创建对象
        Student brs = constructor1.newInstance("BRS", 18);
        System.out.println(brs);
        //获取所有构造中的一个
        Constructor<Student> constructor2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor2);
        //
        constructor2.setAccessible(true);
        Student student2=constructor2.newInstance("02");
        System.out.println(student2);
    }
}
