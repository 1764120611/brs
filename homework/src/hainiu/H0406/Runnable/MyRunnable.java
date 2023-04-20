package hainiu.H0406.Runnable;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    public MyRunnable() {
    }

    public MyRunnable(LinkedList<String> list) {
    }
    private LinkedList<String> list;

    public void MyRunnable(LinkedList<String> list) {
        this.list = list;
    }

    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (list == null) {
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//输出并删除第一个并删除
                System.out.println(Thread.currentThread().getName() + "获得英雄:" + list.removeFirst());
            } finally {
                lock.unlock();

            }
        }

    }
}
