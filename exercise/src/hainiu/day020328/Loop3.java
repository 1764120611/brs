package hainiu.day020328;

public class Loop3 {
    public static void main(String[] args) {
        double i = 0.1;
        int count=0;
        while (i < 8844430) {
            i*=2;
            count++;
        }
        System.out.println("共折叠"+count+"次");
        System.out.println(i);
    }
}
