package hainiu.day100408.exe0409;

public class test {
    public static void main(String[] args) {
        ticket window = new ticket();
        new Thread(window,"窗口一").start();
        new Thread(window,"窗口二").start();
    }
}
