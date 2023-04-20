package hainiu.test;
//双色球
import java.util.Arrays;
import java.util.Random;

public class t2 {
    public static void main(String[] args) {
        //定义随机
        Random ra = new Random();
        //蓝球号
        int b = ra.nextInt(16) + 1;
        //创建红球数组
        int[] rad = new int[6];
        //循环随机数放入数组
        for (int i = 0; i < 6; i++) {
            int r = ra.nextInt(33) + 1;
            rad[i] = r;
        }
        System.out.println("红球:" + Arrays.toString(rad));
        System.out.println("蓝球:" + b);
    }
}
