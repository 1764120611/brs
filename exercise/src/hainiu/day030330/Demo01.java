package hainiu.day030330;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //int[]arr={59,54,88,94,41,100};
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 10) {
                arr[i] = score;
            } else {
                System.out.println("输入错误，请重新输入。");
                i--;
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg;
        avg = (sum - min - max) * 1.0 / (arr.length - 2);
        System.out.println("该选手得分" + avg);
    }
}
