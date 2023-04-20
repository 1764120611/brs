package hainiu.day030330;

public class Demo02 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
