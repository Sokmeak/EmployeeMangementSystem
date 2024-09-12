package com.System_Operations;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class buttonCreator {

  public static JButton createImageButton(String imagePath) {
    ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(imagePath));

    JButton button = new JButton(icon);

    button.setBorderPainted(false);
    button.setContentAreaFilled(false);
    // button.setPreferredSize(new Dimension(200, 20));

    button.setBackground(null);

    return button;
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("Button");
    f.setLayout(null);
    f.setBackground(Color.BLUE);

    JButton btn = buttonCreator.createImageButton(
      "newIcons/ProductBtn/updateBtn.png"
    );

    f.add(btn);

    f.setSize(300, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
