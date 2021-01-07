package Test26IO;

import java.io.*;
import java.util.HashMap;

public class Testsort_ChuShiBiao {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> hashMap = new HashMap<>();

        BufferedReader br = new BufferedReader(
                new FileReader(new File("d:\\出师表.txt"))
        );
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(new File("d:\\排序后出师表.txt"))
        );
        String line="";
        while ((line=br.readLine()) != null){
            String[] array = new String[2];
            array=line.split("\\.");
            hashMap.put(Integer.parseInt(array[0]),array[1]);
        }
        for (int i = 0; i <hashMap.size() ; i++) {
            bw.write((i+1)+"."+hashMap.get(i+1));
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
