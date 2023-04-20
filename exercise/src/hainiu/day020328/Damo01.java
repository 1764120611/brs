package hainiu.day020328;

import java.util.Scanner;

public class Damo01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int age1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int age2 = sc.nextInt();
        System.out.println("请输入第三个数字");
        int age3 = sc.nextInt();
        int c = age1 > age2 ? age1 : age2;
        System.out.println(c);
        int c2 = age3 > c ? age3 - c : c - age3;
        System.out.println(c2);
        int k = age1 > age2 ? (age1 > age3 ? age3 : age2) : (age2 > age3 ? age2 : age3);
        System.out.println(k);
    }
}
