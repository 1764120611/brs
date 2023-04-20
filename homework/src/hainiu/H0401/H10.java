package hainiu.H0401;

import java.math.BigDecimal;
import java.math.RoundingMode;

//利用BigDecimal完成小数的精确运算
public class H10 {
    public static void main(String[] args) {
        BigDecimal a1 = new BigDecimal(1.2);
        BigDecimal a2 = new BigDecimal(1.8);
        BigDecimal a=a1.add(a2);
        double a3=a.doubleValue();
        System.out.println(a3);
        BigDecimal s1 = new BigDecimal(3.141);
        BigDecimal s2 = new BigDecimal(1.8);
        System.out.println(s1.subtract(s2));
        BigDecimal m1 = new BigDecimal(1.25);
        BigDecimal m2 = new BigDecimal(6.4);
        System.out.println(m1.multiply(m2));
        BigDecimal d1 = new BigDecimal(1.2);
        BigDecimal d2 = new BigDecimal(1.8);
        BigDecimal d=d1.divide(d2,7,RoundingMode.HALF_UP);
        System.out.println(d);
    }
}
