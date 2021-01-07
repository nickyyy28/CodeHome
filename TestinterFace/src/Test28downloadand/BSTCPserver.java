package Test28downloadand;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BSTCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        String[] s1 = line.split(" ");
        String dirpath = s1[1].substring(1);

        FileInputStream fis = new FileInputStream(dirpath);

        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        int len;
        byte[] bytes = new byte[1024];

        while ((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        fis.close();
        socket.close();
        ss.close();
    }
}
