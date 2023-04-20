package hainiu.H0410.Sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        int[]arr=new int[24];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(24);
        }
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }public static void insertSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j >=0; j--) {
                if (arr[j+1]<arr[j]){
                    BubblingSort.temp(arr,j+1,j);
                }else {
                    break;
                }
            }
        }
    }
}
