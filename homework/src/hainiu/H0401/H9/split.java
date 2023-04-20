package hainiu.H0401.H9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String str="仿佛兮若轻云之蔽月,飘摇兮若流风之回雪,";
        String[]arr=str.split(",");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
