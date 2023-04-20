package hainiu.H0406.ConAndPro;

//消费者线程
public class ConsumerThread implements Runnable {
    private Object lock;

    public ConsumerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if ("".equals(Test.table)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "消费一枚" + Test.table);
                    Test.table = "";
                    lock.notifyAll();
                }
            }
        }
    }
}
