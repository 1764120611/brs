package hainiu.H0401.H9;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        //名称允许汉字、字母、数字，域名只允许英文域名
        String regex="[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱");
        String email = sc.nextLine();
        if (email.matches(regex)){
            System.out.println("通过");
        }else{
            System.out.println("输入有误");
        }

    }
}
