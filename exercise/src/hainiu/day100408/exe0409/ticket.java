package hainiu.day100408.exe0409;

import java.util.concurrent.locks.ReentrantLock;

public class ticket implements Runnable {
    private static int ticket = 300;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket-- + "张票");
            } finally {
                lock.unlock();
            }
        }

    }
}
