package hainiu.H0331.H4;

public class Go {
    public static void main(String[] args) {
        goswimming(new swiming() {
            @Override
            public void swim() {
                System.out.println("给小河一个飞踹");
            }
        });
    }public static void goswimming(swiming swiming){swiming.swim();}
}
