package Test27TCPAndIP;
/*
TCP通信的客户端
 */
import java.io.IOException;
import java.net.Socket;

public class TestSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        socket.getOutputStream().write("服务器你好".getBytes());
        byte[] bytes = new byte[1024];
        int len;
        len = socket.getInputStream().read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
    }
}
