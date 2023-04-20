package hainiu.H0401;

import java.util.Scanner;

//判断字符串是否为回文
public class H6 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字");
        String sa=sc.nextLine();
        String s1 = s.append(sa).toString();
        System.out.println(s);
        System.out.println(isRev(s1));
    }
    public static boolean isRev(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
