package com.Lab01;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFullScreen extends JFrame {

  public TestFullScreen() {
    // TODO Auto-generated constructor stub

    setTitle("test1");

    JPanel panel = new JPanel();

    panel.setSize(1400, 680);
    panel.setBounds(0, 0, 1400, 680);
    panel.setBackground(Color.CYAN);
    add(panel);
    setSize(1400, 680);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new TestFullScreen();
  }
}
