package Test4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Frame frame = new Frame("文本生成");
        frame.setVisible(true);
        frame.setBackground(Color.black);
        frame.setBounds(0,0,500,500);
        frame.setResizable(false);
        Button button = new Button("nothing");
        TextField textField = new TextField();
        frame.add(button,BorderLayout.NORTH);
        frame.add(textField,BorderLayout.CENTER);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PrintWriter out = new PrintWriter(
                            new BufferedWriter(
                                    new OutputStreamWriter(
                                            new FileOutputStream("aaa.txt"))));
                    out.println(textField.getText());
                    out.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
