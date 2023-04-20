package hainiu.H0406.ConAndPro;

//生产者线程
public class ProducerThread implements Runnable {
    private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (!"".equals(Test.table)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Test.table = "金币";
                System.out.println(Thread.currentThread().getName() + "生产了一枚" + Test.table);
                lock.notifyAll();
            }
        }
    }
}
