package hainiu.H0406.thread;

public class Demo {
    public static void main(String[] args) {
        MyThread t1=new MyThread("BRS");
        MyThread t2 = new MyThread();
        t1.start();t2.setName("Blank");
        t2.start();


    }
}
