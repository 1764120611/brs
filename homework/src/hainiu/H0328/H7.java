package hainiu.H0328;

import java.util.Scanner;

public class H7 {
    public static void main(String[] args) {
        int hetao=1543;
        int count=0;
        while (hetao>0){
            if (hetao%2==1){
                count++;
                hetao=(hetao-1)/2;
            }else {
                hetao/=2;
            }
        }
        System.out.println("熊大一共丢了"+count+"个核桃");
    }
}
