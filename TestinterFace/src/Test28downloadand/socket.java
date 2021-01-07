package Test28downloadand;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

//D:\QQ\QQdownload\3092989305\FileRecv\FileRecv.zip
public class socket {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("d:\\1.jpg");
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(file)
        );
        Socket socket = new Socket("127.0.0.1",8888);
        socket.getOutputStream().write("服务器你好,我正在尝试连接".getBytes());
        byte[] bytes = new byte[1024];
        int len;
        len=socket.getInputStream().read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.getOutputStream().write(file.getName().getBytes());

        while ((len=bis.read(bytes)) != -1){
            socket.getOutputStream().write(bytes,0,len);
            Thread.sleep(10);
        }
        bis.close();
        socket.close();
    }
}
