package hainiu.H0406;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(4,
                8,15, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i <=20; i++) {
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"起飞");
            });
        }
    }
}
