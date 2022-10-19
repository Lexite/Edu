package B3_BroCode.Tutorials_GUI;

import javax.swing.*;

public class JavaGui_Intro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null,"You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall");
    }
}
