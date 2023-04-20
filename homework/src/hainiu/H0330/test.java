package hainiu.H0330;

public class test {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 3, 5, 7, 9};
        int[] arr2 = {1, 4, 6, 8, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int y = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[y];
            y++;
        }
        int temp=0;
        for (int i = 0; i < arr3.length-1; i++) {
            for (int j = 0; j < arr3.length-i-1; j++) {
                if (arr3[j]>arr3[j+1]){
                    temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
