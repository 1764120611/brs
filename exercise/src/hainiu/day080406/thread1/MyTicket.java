package hainiu.day080406.thread1;

public class MyTicket implements Runnable {
    //用成员变量表示票
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            //如果票卖完了

            synchronized (MyTicket.class) {
                if (ticket <= 0) {
                    break;
                }
                //卖出一张
                //模拟出票时间
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket-- + "张票");
            }
        }
    }
}
