package hainiu.day100408.exe0409;

public class ProducerThread extends Thread {
    private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (!"".equals(ProducerAndConsumer.product)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ProducerAndConsumer.product = System.currentTimeMillis() + "";
                System.out.println("生产者" + Thread.currentThread().getName() +
                        "生产了一个产品:" + ProducerAndConsumer.product);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll();
            }
        }
    }
}
