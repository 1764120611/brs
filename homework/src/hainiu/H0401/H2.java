package hainiu.H0401;

import java.util.Scanner;

//键盘录入一个字符串，统计其中的英文字母数量
public class H2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String s = sc.nextLine();
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
