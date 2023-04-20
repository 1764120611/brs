package hainiu.H0406.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> task1 = new FutureTask<>(myCallable);
        Thread t1 = new Thread(task1);
        t1.start();
        FutureTask<Integer> task2 = new FutureTask<>(myCallable);
        Thread t2 = new Thread(task2);
        t2.start();
        Integer result1 = task1.get();
        System.out.println("结果是:"+result1);
        Integer result2 = task2.get();
        System.out.println("结果是:"+result2);

    }
}
