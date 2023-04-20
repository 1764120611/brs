package hainiu.H0401;

import java.util.Random;
import java.util.Scanner;

//生成验证码，四位的字符串。可选字符包括：大小写字母和数字
public class H5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("验证码为：");
            String code=code();
            System.out.println(code);
            System.out.println("请输入验证码");
            String str=sc.nextLine();
            if (code.equalsIgnoreCase(str)){
                System.out.println("验证通过");
                break;
            }else {
                System.out.println("验证失败，验证码刷新。还有"+(4-i)+"次机会");
            }
        }

    }

    private static String code() {
        String str="";
        for (char i = 'a'; i <= 'z'; i++) {
            str+=i;
        }for (char i = 'A'; i <= 'Z'; i++) {
            str+=i;
        }for (char i = '0'; i <='9'; i++) {
            str+=i;
        }
        String code="";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index=random.nextInt(str.length());
            char c=str.charAt(index);
            code+=c;
        }

        return code;
    }

}
