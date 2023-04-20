package hainiu.H0330;

public class H7 {
    public static void main(String[] args) {
        int[]num=new int[12];
        num[0]=2;
        num[1]=2;
        for (int i = 2; i < num.length; i++) {
            num[i]=num[i-1]+num[i-2];
        }
        System.out.println("一年后一共有"+num[11]+"个兔子");
    }
}
