package hainiu.day090407.tcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        //socket对象
        ServerSocket serverSocket = new ServerSocket(10086);
        //线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                8, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        while (true){
            //接收并请求建立连接
            Socket socket=serverSocket.accept();
            //
            pool.submit(new FileUploadThread(socket));
        }
        //serverSocket.close();
    }

}
