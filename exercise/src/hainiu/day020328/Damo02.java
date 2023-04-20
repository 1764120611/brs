package hainiu.day020328;

public class Damo02 {
    public static void main(String[] args) {
        //交换两个变量的值
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
        ;

    }
}
