package Test26IO;

import java.io.*;

public class TestTransformCharsetName {
    public static void main(String[] args) throws IOException {
        transform();
    }

    private static void transform() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("d:\\111\\GBK.txt"),"GBK"
                )
        );

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("d:\\111\\UTF-8.txt"),"UTF-8"
                )
        );
        String s;
        while ((s=br.readLine()) != null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
