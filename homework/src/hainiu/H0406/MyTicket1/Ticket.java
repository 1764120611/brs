package hainiu.H0406.MyTicket1;

public class Ticket implements Runnable {
    private int ticket = 300;

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(14);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket + "张票");
                ticket--;
            }

        }

    }
}
