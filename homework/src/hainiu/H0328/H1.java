package hainiu.H0328;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字");
        int c=sc.nextInt();
        int m=a>b?a:b;
        int max=m>c?m:c;
        System.out.println("最大值是"+max);


    }
}
