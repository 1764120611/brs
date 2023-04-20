package hainiu.H0328;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小小约成绩：");
        int sum = sc.nextInt();
        if (sum < 0 || sum > 100) {
            System.out.println("错误成绩");
        } else if (sum >= 0 && sum < 60) {
            System.out.println("成绩不及格");
        } else if (sum >= 60 && sum < 80) {
            System.out.println("成绩及格");
        } else if (sum >= 80 && sum < 90) {
            System.out.println("成绩良好");
        } else {
            System.out.println("成绩优秀");
        }
    }
}
