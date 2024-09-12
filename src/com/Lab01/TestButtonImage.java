package com.Lab01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestButtonImage extends JFrame {

  public TestButtonImage() {
    setTitle("test button");

    JPanel pn = new JPanel();
    pn.setBackground(Color.PINK);
    pn.setSize(300, 500);
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
    pn.setLayout(flow);

    JButton btnBackHome = createImageButton("myIcons/MainButtons/HomeBtn1.jpg");

    pn.add(btnBackHome);
    add(pn);
    setSize(300, 500);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  private static JButton createImageButton(String imagePath) {
    ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(imagePath));
    Image image = icon.getImage();
    Image scaledImage = image.getScaledInstance(
      icon.getIconWidth(),
      icon.getIconHeight(),
      Image.SCALE_AREA_AVERAGING
    );
    ImageIcon scaledIcon = new ImageIcon(image);

    JButton button = new JButton(scaledIcon);
    button.setBorderPainted(false);
    button.setContentAreaFilled(false);
    button.setFocusPainted(false);
    button.setOpaque(false);

    // Set the size of the button based on the image dimensions
    button.setPreferredSize(
      new Dimension(icon.getIconWidth(), icon.getIconHeight())
    );

    return button;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new TestButtonImage();
  }
}
