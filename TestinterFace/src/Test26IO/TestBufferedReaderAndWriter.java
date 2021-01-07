package Test26IO;

import java.io.*;

public class TestBufferedReaderAndWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =new BufferedWriter(
                new FileWriter(new File("abc.txt"))
        );
        BufferedReader br = new BufferedReader(
                new FileReader(new File("123.txt"))
        );
        String s="";
        while ((s=br.readLine()) != null){
            System.out.println(s);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
