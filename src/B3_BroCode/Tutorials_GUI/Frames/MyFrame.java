package B3_BroCode.Tutorials_GUI.Frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Cedrus COM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(120,120);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("Cedrus logo.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,150));
    }
}
