package hainiu.H0330;

import java.util.Scanner;

public class H8b {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr1.length - 1] = x;
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length - 1-j; i++) {
                int temp = arr1[0];
                if (arr1[i] > arr1[i + 1]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

    }
}

