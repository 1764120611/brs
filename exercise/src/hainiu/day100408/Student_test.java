package hainiu.day100408;

public class Student_test {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类的静态方法public static Class<?>forName (String className)
        Class<Student> clazz = (Class<Student>) Class.forName("hainiu.day100408.Student");//全类限定名
        System.out.println(clazz);
        //任意类型的class属性
        Class<Student>clazz2=Student.class;
        System.out.println(clazz2);
        //Obj类中定义的方法：public final Class<?>getClass()
        Student s = new Student();
        Class<Student> clazz3 = (Class<Student>) s.getClass();
        System.out.println(clazz3);
        System.out.println(clazz==clazz2&&clazz==clazz3);
    }
}
