package hainiu.H0410.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(20));
    }
    public static int fib(int x){
        if (x==1||x==2){
            return 1;
        }return fib(x-2)+fib(x-1);
    }
}
