package hainiu.H0330;

public class H5 {
    public static void main(String[] args) {
        int[][] money = {{11, 23, 34}, {25, 36, 67}, {78, 76, 80}, {81, 80, 1}};
        statistics(money);
    }

    public static void statistics(int[][] arr) {
        int year = 0;
        for (int i = 0; i < arr.length; i++) {
            //因为每轮月份要清零，所以要写在大循环里面
            int month = 0;
            for (int j = 0; j < arr[i].length; j++) {
                month += arr[i][j];
            }System.out.println("第" + (i+ 1) + "季度流水为" + month+"万");
            year += month;
        }
        System.out.println("今年营业额为" + year+"万");
    }
}
