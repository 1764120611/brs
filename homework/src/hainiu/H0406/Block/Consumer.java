package hainiu.H0406.Block;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable{
    private ArrayBlockingQueue<Object>queue;
    public Consumer(ArrayBlockingQueue<Object>queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while (true){
            Object data=null;
            try {
                data=queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费一个产品"+data+",目前队列中剩余产品:"+queue.size());
        }
    }
}
