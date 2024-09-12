package com.Lab02;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestImage {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Image and Text Button Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(null);

    // Replace "path/to/your/image.png" with the actual path to your image file
    ImageIcon icon = new ImageIcon("newIcons/addIcon.jpg");

    JButton button = new JButton("Click Me", icon);
    button.setSize(100, 100);
    button.setBounds(30, 30, 200, 200);

    panel.add(button);
    frame.getContentPane().add(panel);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
