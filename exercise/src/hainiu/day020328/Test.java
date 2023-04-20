package hainiu.day020328;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random sa = new Random();
        //(0~99)+1
        int ra = sa.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的数字");
            int num = sc.nextInt();

            if (num < ra) {
                System.out.println("猜小了，请继续");
            } else if (num > ra) {
                System.out.println("猜大了，请继续");
            } else {
                System.out.println("猜对了，恭喜");
                break;
            }
        }
    }
}
