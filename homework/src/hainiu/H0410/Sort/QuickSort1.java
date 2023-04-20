package hainiu.H0410.Sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr = new int[24];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(24);
        }
        System.out.println(Arrays.toString(arr));
        quickSort1(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort1(int[] arr) {
        quickSort1(arr, 0, arr.length - 1);
    }

    public static void quickSort1(int[] arr, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int pivot = arr[i];
            while (i < j) {
                while (arr[j] >= pivot && i < j) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }while (arr[i]<=pivot&&i<j){
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = pivot;
            quickSort1(arr, start, i - 1);
            quickSort1(arr, i + 1, end);
        }
    }
}
