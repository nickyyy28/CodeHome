package Test28downloadand;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
public class serversocket {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        byte[] bytes = new byte[1024];
        int len;
        len = ss.accept().getInputStream().read(bytes);
        System.out.println(new String(bytes,0,len));
        ss.accept().getOutputStream().write("收到,请发送文件名称:".getBytes());
        String s;
        len = ss.accept().getInputStream().read(bytes);
        System.out.println(new String(bytes,0,len));
        s="d:\\111\\"+new String(bytes,0,len);
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(s)
        );

        while ((len=ss.accept().getInputStream().read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bos.close();
        ss.close();
    }
}
