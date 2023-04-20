package hainiu.H0406.Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 60; i++) {
            System.out.println("累加+" + i);
            sum += i;
        }
        return sum;
    }
}
