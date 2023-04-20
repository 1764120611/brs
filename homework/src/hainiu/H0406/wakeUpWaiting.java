package hainiu.H0406;

import java.util.concurrent.ArrayBlockingQueue;

public class wakeUpWaiting {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        new Thread(() -> {
            while (true) {
                try {
                    queue.put("金币");
                    System.out.println(Thread.currentThread().getName() + "生产了一枚金币，目前剩余" + queue.size() + "枚");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    String s = queue.take();
                    System.out.println(Thread.currentThread().getName() + "消费了一枚(" + s + "),目前剩余" + queue.size() + "个");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    private static void test() throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        queue.put("翩若惊鸿");
        queue.put("宛若游龙");
        queue.put("芙蓉秋菊");queue.put("华茂春松");
        System.out.println(queue.take());System.out.println(queue.take());System.out.println(queue.take());System.out.println(queue.take());
        queue.put("仿佛兮若轻云之闭月");
    }
}
