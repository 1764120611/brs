package hainiu.H0328;

public class H10 {
    public static void main(String[] args) {
        int money=20;
        int bottle=0;
        int bm;
        while (money>3){
            bottle=bottle+money/3;
            bm=money/3;
            money=money%3+bm;

        }
        System.out.println("可以买"+bottle+"瓶");
    }
}
