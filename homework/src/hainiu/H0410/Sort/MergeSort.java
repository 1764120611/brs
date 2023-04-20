package hainiu.H0410.Sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[40];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] tempArr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, tempArr, start, mid);
            mergeSort(arr, tempArr, mid + 1, end);
            int leftPos = start;
            int leftEnd = mid;
            int rightPos = mid + 1;
            int rightEnd = end;
            int elementNum = rightEnd - leftPos + 1;
            int tempIndex = leftPos;
            while (leftPos <= leftEnd && rightPos <= rightEnd) {
                if (arr[leftPos] <= arr[rightPos]) {
                    tempArr[tempIndex++] = arr[leftPos++];
                } else {
                    tempArr[tempIndex++] = arr[rightPos++];
                }
            }
            while (leftPos <= leftEnd) {
                tempArr[tempIndex++] = arr[leftPos++];
            }
            while (rightPos <= rightEnd) {
                tempArr[tempIndex++] = arr[rightPos++];
            }
            for (int i = 0; i < elementNum; i++, rightEnd--) {
                arr[rightEnd] = tempArr[rightEnd];
            }
        }
    }
}
