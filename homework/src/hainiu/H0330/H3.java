package hainiu.H0330;

public class H3 {
    public static void main(String[] args) {
        int[]arr={1,2,5,7,9,11,13,17,28,64,72,88,91};
        int key=88;
        int index=select(arr,key);
        System.out.println(index);
    }
    public static int select(int[]arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]){
                return i;
            }
        }return -1;
    }
}
