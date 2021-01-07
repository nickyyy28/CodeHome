package Test27TCPAndIP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
TCP通信的服务器
 */
public class TestServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        byte[] bytes = new byte[1024];
        Socket accept = ss.accept();
        int len = accept.getInputStream().read(bytes);
        System.out.println(new String(bytes,0,len));
        accept.getOutputStream().write("收到谢谢".getBytes());
        accept.close();
        ss.close();
    }
}
