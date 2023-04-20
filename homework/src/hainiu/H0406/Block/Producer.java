package hainiu.H0406.Block;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable{
    private ArrayBlockingQueue<Object>queue;
    public Producer(ArrayBlockingQueue<Object>queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                queue.put("产品:"+i);
                System.out.println("生产一个产品，目前队列中剩余产品:"+queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
