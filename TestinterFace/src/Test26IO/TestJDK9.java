package Test26IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestJDK9 {
    public static void main(String[] args) throws IOException {
        FileWriter a = new FileWriter(new File("d:\\111\\1aa.txt"));
        FileWriter b = new FileWriter(new File("d:\\111\\aaa.txt"));
        try (a;b){

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
