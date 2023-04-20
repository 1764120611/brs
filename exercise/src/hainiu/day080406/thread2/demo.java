package hainiu.day080406.thread2;

public class demo {
    public static void main(String[] args) {
        //开启多条线程
        MyTicket myTicket = new MyTicket();
        //保证多条线程操作同一个共享资源
        new Thread(myTicket,"窗口一").start();
        new Thread(myTicket,"窗口二").start();
    }
}
