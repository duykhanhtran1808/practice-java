package chap14;

import javax.swing.*;
import java.awt.event.*;

public class Chap14 implements ActionListener {
    private JButton button;
    public static void main(String[] args) {
        Chap14 gui = new Chap14();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("Hello");
    }
}
