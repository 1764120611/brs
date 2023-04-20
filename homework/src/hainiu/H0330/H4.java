package hainiu.H0330;

public class H4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 11, 13, 17, 28, 64, 72, 88, 91};
        int key = 28;
        int index = binarySearch(arr, key);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //key小于中位数则在前半区，降低后值
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
