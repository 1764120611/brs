package hainiu.H0410.Sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr=new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int mark=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[mark]) {
                    mark=j;
                }
            }if (mark!=i){
                BubblingSort.temp(arr,mark,i);
            }
        }
    }
}
