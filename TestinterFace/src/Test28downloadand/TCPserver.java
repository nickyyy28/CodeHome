package Test28downloadand;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);

        while (true){
            Socket socket = ss.accept();
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("e:\\upload\\"+System.currentTimeMillis()+new Random().nextInt(9999) +".zip")
            );
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            int len;
            byte[] bytes = new byte[1024];

            while ((len = is.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }

            os.write("上传成功!".getBytes());
            socket.shutdownOutput();

//        os.write("再次通信".getBytes());//Exception in thread "main" java.net.SocketException: Cannot send after socket shutdown: socket write error
//        socket.shutdownOutput();
            bos.close();
            socket.close();
        }

//        ss.close();
    }
}
