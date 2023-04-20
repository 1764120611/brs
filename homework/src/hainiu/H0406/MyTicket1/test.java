package hainiu.H0406.MyTicket1;

public class test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"窗口一").start();
        new Thread(ticket,"窗口二").start();
        new Thread(ticket,"窗口三").start();
    }
}
