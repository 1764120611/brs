package hainiu.day100408.exe0409;

public class ConsumerThread extends Thread {
    private Object lock;

    public ConsumerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if ("".equals(ProducerAndConsumer.product)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者" + Thread.currentThread().getName() +
                        "消费了一个产品:" + ProducerAndConsumer.product);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ProducerAndConsumer.product = "";
                lock.notifyAll();
            }
        }
    }
}
