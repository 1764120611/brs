package hainiu.H0406.Block;

import java.util.concurrent.ArrayBlockingQueue;

public class test {
    public static void main(String[] args) {
        ArrayBlockingQueue<Object>queue=new ArrayBlockingQueue<>(2);
        new Thread(new Consumer(queue)).start();
        new Thread(new Producer(queue)).start();

    }
}
