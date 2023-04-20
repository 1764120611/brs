package hainiu.day100408.exe0409;

public class ProducerAndConsumer {
    public static String product="";
    public static void main(String[] args) {
        Object obj=new Object();
        new ProducerThread(obj).start();
        new ConsumerThread(obj).start();
    }
}
