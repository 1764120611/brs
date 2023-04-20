package hainiu.H0401;

import java.util.Scanner;

//模拟用户登录
public class H3 {
    public static void main(String[] args) {
        String userName = "1764120611";
        String passWord = "123ABC";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String word = sc.nextLine();
            if (userName.equals(name)&&passWord.equals(word)){
                System.out.println("Link Startou!");
                break;
            }else {
                System.out.println("输入错误请重新输入");
            }
        }
    }
}
