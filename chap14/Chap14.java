package chap14;

import javax.swing.*;

public class Chap14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        frame.getContentPane().add(button);

        frame.setSize(500,500);
        frame.setVisible(true);
        System.out.println("Ocean");
    }
}
