package hainiu.test;
//查询字母
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        //输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串的英文字符");
        String s = sc.nextLine();
        //循环判断a-z
        for (int z = 'a'; z <= 'z'; z++) {
            //计数器
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                //取每个字符
                char c = s.charAt(i);
                if (c == z) {
                    count++;
                    //强转asc码为字母
                }
            }
            //判断非0再输出
            if (count != 0) {
                System.out.println((char) z + "=" + count);
            }
        }
    }
}
