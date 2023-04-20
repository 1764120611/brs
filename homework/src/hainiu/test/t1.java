package hainiu.test;
//乞丐收入
public class t1 {
    public static void main(String[] args) {
        int sum=0;
        //循环十天
        for (int i = 1; i <=10; i++) {
            //i从1开始即代表天数也代表每天收入
            sum+=i;
        }
        System.out.println("洪大爷收了"+sum+"元");
    }
}
