package hainiu.day030330;

public class Demo03 {
    public static void main(String[] args) {
        int[][] data = {{10, 14, 15}, {11, 15, 18}, {54, 56, 78}, {44, 27, 32}};
        int year = 0;
        for (int i = 0; i < data.length; i++) {
            int season = 0;
            for (int j = 0; j < data[i].length; j++) {
                season += data[i][j];
            }
            System.out.println(season);
            year += season;
        }
        System.out.println(year);
    }
}
