package hainiu.test.t4y;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class shui implements Runnable {
    private LinkedList<String> list;
    public shui(LinkedList<String> list) {
        this.list = list;
    }
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            if (list.size() <= 0) {
                return;
            }
            lock.lock();
            try {
                //移除第一张英雄卡片
                String s = list.removeFirst();
                //耗时0.1秒
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 获得英雄：" + s);
            } finally {
                lock.unlock();
            }
        }
    }
}
