package hainiu.day110410;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 4, 1, 20, 6, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                   /* int temp=0;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;*/
                }
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = 0;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
