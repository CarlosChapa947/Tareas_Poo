package Mypackage;
import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.BorderLayout;
import java.awt.Color;

public class Entry {
    public static void main(String args[]){
        JTextField test = new MyTextField();
        JFrame frame = new JFrame("Hola Mundo");
        frame.setSize(720, 1080);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout() );
        test.setSize(200, 200);
        frame.add(test);
        frame.setVisible(true);
    }
}
