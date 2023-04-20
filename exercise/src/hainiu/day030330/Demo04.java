package hainiu.day030330;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 7, 8, 9, 11, 5, 55};
        int key = 8;
        System.out.println(find(arr, key));
    }

    public static int find(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
