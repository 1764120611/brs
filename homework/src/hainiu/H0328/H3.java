package hainiu.H0328;

public class H3 {
    public static void main(String[] args) {
        int ge;
        int shi;
        int bai;
        int count=1;
        for (int i = 100; i < 1000; i++) {
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100 % 10;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==i){
                System.out.println("第"+count+"个水仙花数");
                System.out.println(i);
                count++;
            }
        }
    }
}
