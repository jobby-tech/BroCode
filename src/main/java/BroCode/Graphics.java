package BroCode;

import javax.swing.*;

public class Graphics {

    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter your Name ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter your Age "));
        JOptionPane.showMessageDialog(null, "Age : " + age);

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your height "));
        JOptionPane.showMessageDialog(null, "Height : " + height);
    }

}
