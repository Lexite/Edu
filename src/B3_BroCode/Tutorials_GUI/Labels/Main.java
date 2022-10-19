package B3_BroCode.Tutorials_GUI.Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Cat1.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel();
        label.setText("Bro do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// set text left,centre,right
        label.setVerticalTextPosition(JLabel.TOP);// set text top centre bottom
        label.setForeground(new Color(121,50,150));// set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,50)); // set font of text
        label.setIconTextGap(20); //set gap of text to image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);// display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of icon + text within label
        //label.setBounds(100,100,350,350);// set x and y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
