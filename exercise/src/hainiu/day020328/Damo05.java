package hainiu.day020328;

public class Damo05 {
    public static void main(String[] args) {
        int bottle=0;
        int money=20;
        int count=0;
        while (money>3){
            count=count+money/3;
            bottle=money/3;
            money=bottle+money%3;
        }
        System.out.println("一共可以喝到"+count+"瓶可乐。");
    }
}
