package hainiu.H0330;

public class H2 {
    public static void main(String[] args) {
        int []arr={1,7,6,4,1,2,0,6,1,1};
        reverse(arr);
    }
    public static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
