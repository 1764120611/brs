package hainiu.day100408;

import java.lang.reflect.Field;

public class Student_test3 {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = (Class<Student>) Class.forName("hainiu.day100408.Student");
        //获取空参构造 创建对象
        Student student = clazz.getDeclaredConstructor().newInstance();
        //获取成员
        Field nameFiled = clazz.getDeclaredField("name");
        //
        nameFiled.setAccessible(true);
        //
        nameFiled.set(student,"BRS");
        //
        Object value=nameFiled.get(student);
        System.out.println(value);
        System.out.println("------------");
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(student,20);
        Object v2=ageField.get(student);
        System.out.println(v2);
        System.out.println("-----");
        System.out.println(student);
    }
}
