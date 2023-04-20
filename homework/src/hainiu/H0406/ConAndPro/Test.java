package hainiu.H0406.ConAndPro;

public class Test {
    public static String table="";
    public static void main(String[] args) {
        Object lock=new Object();
        new Thread(new ConsumerThread(lock),"BRS").start();
        new Thread(new ProducerThread(lock),"Blank").start();
    }
}
