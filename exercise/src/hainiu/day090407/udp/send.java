package hainiu.day090407.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class send {
    public static void main(String[] args) throws Exception {
        //创建发送端Socket对象：堆积绑定一个端口号发出数据。
        DatagramSocket socket = new DatagramSocket();
        /*

         */
        String data="待到秋来九月八，我花开后百花杀。冲天香阵透长安，满城尽带黄金甲。";
        byte[]bytes=data.getBytes();
        InetAddress address=InetAddress.getByName("192.168.62.205");
        int port =10086;
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length,address,port);
        //发送
        socket.send(packet);
        //释放资源
        socket.close();
    }
}
