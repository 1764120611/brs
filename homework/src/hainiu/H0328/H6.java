package hainiu.H0328;

public class H6 {
    public static void main(String[] args) {
        int money = 0;
        int week = 10;
        for (int i = 1; i <= 52; i++) {
            money = week + money;
            week += 10;
        }
        System.out.println("小牛一年能存" + money + "元");
    }
}
