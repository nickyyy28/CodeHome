package Test28downloadand;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\QQ\\QQdownload\\3092989305\\FileRecv\\FileRecv.zip")
        );
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        int len;
        byte[] bytes  =new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        bis.close();
        socket.close();
    }
}
