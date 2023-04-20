package hainiu.H0410.Sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[24];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(24);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int pivot = arr[i];
            while (i < j) {
                while (arr[j] >= pivot && i < j) {
                    j--;
                }
                while (arr[i] <= pivot && i < j) {
                    i++;
                }
                if (i < j) {
                    BubblingSort.temp(arr, i, j);
                }
            }
            arr[start] = arr[i];
            arr[i] = pivot;
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
    }
}
