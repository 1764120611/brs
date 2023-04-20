package hainiu.day090407.tcp1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        //socket对象
        ServerSocket serverSocket = new ServerSocket(10086);
        //接收请求建立连接
        Socket socket = serverSocket.accept();
        //从网络中读取到本地
        InputStream in = socket.getInputStream();
        FileOutputStream out = new FileOutputStream("C:\\Users\\觋时雨\\Desktop\\test\\1.PNG");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        //文件上传完毕，给出反馈
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("文件上传成功");
        writer.newLine();
        writer.flush();
        //释放资源
        out.close();
        socket.close();
        serverSocket.close();
    }

}
