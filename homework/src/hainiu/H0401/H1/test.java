package hainiu.H0401.H1;

public class test {
    public static void main(String[] args) {
        student s1 = new student("杜松子","女",18);
        student s2 = new student("杜松子","女",18);
        student s3 = new student("阿七","男",21);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1);

    }
}
