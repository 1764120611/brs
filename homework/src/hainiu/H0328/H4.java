package hainiu.H0328;

import java.util.Random;
import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Random random = new Random();
        int num=random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请猜测一个范围1~100的数字");
        while (true){
            int i = sc.nextInt();
            if (i>num){
                System.out.println("您输入的数字大于目标数字");
            }else if(i<num){
                System.out.println("您输入的数字小于目标数字");
            }else {
                System.out.println("恭喜，回答正确");
                break;
            }
        }

    }
}
