package Mypackage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyTextField extends JTextField implements KeyListener {
    private Pattern pattern;

    public MyTextField () {
        this.addKeyListener (this);
        this.setDocument(new limit(13));
        this.pattern = Pattern.compile ("\\(\\d{3}\\)\\s{0,1}\\d{7}");

    }

    @Override
    public void keyTyped (KeyEvent e) {
        if ( (!((e.getKeyChar () >= '0' && e.getKeyChar () <= '9') || e.getKeyChar () == '-' || e.getKeyChar() == '(' ||
                e.getKeyChar() == ')' || e.getKeyChar() == ' ')) || (e.getKeyChar () == '-' && this.getText ().contains ("-")) ) {

            e.consume ();

        }
    }

    @Override
    public void keyPressed (KeyEvent e) {
    }

    @Override
    public void keyReleased (KeyEvent e) {
        //if(getText().length() == 13) {
        if (pattern.matcher(this.getText()).find()) {
            this.setForeground(Color.RED);
            this.setBackground(Color.WHITE);
        } else {
            this.setForeground(Color.WHITE);
            this.setBackground(Color.RED);
        }
        //}
    }

    @Override
    public void paint (Graphics g) {
        super.paint(g);

//        g.setColor (Color.red);
//        g.drawRect (getSize ().width - 25, getSize ().height - 30, 20, 20);
//
//        g.setColor(Color.red);
//        g.fillRect (getSize ().width - 25, getSize ().height - 30, 20, 20);
//
//        g.dispose ();
//
//        try {
//            URL url = getClass ().getResource ("/images/ico.png");
//            File file = new File (url.getPath ());
//            BufferedImage img = ImageIO.read (file);
//            g.drawImage (img, getSize ().width - 30, getSize ().height - 30, null);
//        }
//        catch (IOException ex) {
//            System.out.println (ex.getMessage ());
//        }
//    }
    }
}

class limit extends PlainDocument{
    private int max;
    limit(int max) {
        super();
        this.max = max;
    }
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;
        if ((getLength() + str.length()) <= max) {
            super.insertString(offset, str, attr);
        }
    }
}