package hainiu.H0406.thread;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <=50; i++) {
            System.out.println(getName()+"hello thread"+i);
        }
    }
}
