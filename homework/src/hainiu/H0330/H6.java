package hainiu.H0330;

public class H6 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 4, 1, 2, 0, 6, 1, 1};
        int fromIndex = 4;
        int len = 4;
        if (fromIndex > arr.length - 1 || fromIndex < 0 || len < 0 || len > (arr.length - 1 - fromIndex)) {
            System.out.println("选取区间有误");
            }else {
            int[] arr3;
            arr3 = get(arr, fromIndex, len);
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i] + "\t");
        }
        }
    }

    public static int[] get(int[] arr, int fromIndex, int len) {
        int[] arr2 = new int[len];
        int j = 0;
        for (int i = fromIndex; i < (fromIndex + len); i++) {
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }

}

