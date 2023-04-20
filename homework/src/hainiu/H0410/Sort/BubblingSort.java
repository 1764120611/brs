package hainiu.H0410.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubblingSort {
    public static void main(String[] args) {
        int[] arr = {1, 76, 4, 1, 20, 61, 118, 5, 22, 3, 5};
        bs(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp(arr, j, j + 1);
                }
            }
        }
    }

    public static void temp(int[] arr, int x, int y) {
        int temp = 0;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
