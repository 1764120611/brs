package hainiu.H0406.MyTicket2;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"窗口一").start();
        new Thread(ticket,"窗口二").start();
        new Thread(ticket,"窗口三").start();
        new Thread(ticket,"窗口四").start();
    }
}
