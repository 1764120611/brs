package hainiu.H0406.MyTicket2;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 200;
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
                System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");ticket--;
            } finally {
                lock.unlock();

            }
        }

    }
}
