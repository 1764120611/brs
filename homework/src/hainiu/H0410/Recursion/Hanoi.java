package hainiu.H0410.Recursion;

public class Hanoi {
    public static void main(String[] args) {
        System.out.println(hano(6));
    }
    public static int hano(int x){
        if (x==1){return 1;}return 2*hano(x-1)+1;
    }
}
