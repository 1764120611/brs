package hainiu.H0330;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩");
            int x = sc.nextInt();
            if (x < 0 || x > 10) {
                System.out.println("分值错误请重新输入");
                i--;
            } else {
                arr[i] = x;
            }
        }
        System.out.println(pinFen(arr));
    }

    public static double pinFen(int[] arr) {
        double score = 0;
        score = (sum(arr) - max(arr) - min(arr)) * 1.0 / (arr.length - 2);
        return score;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
