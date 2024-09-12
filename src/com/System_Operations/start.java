package com.System_Operations;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class start extends JFrame {

  private static final long serialVersionUID = 1L;

  start() {
    setTitle("Welcome UI");
    ImageIcon myIcon = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//welcome.png")
    );
    Image im = myIcon
      .getImage()
      .getScaledInstance(1111, 537, Image.SCALE_DEFAULT);
    ImageIcon igi = new ImageIcon(im);
    JLabel image = new JLabel(igi);
    image.setBounds(0, 0, 1111, 537);

    JButton myBtn = new JButton("Tap to continue >>>");
    Font font = new Font("Times New Roman", Font.BOLD, 29);
    myBtn.setFont(font);
    myBtn.setBounds(125, 360, 310, 70);
    myBtn.setBackground(Color.BLACK);
    myBtn.setForeground(Color.CYAN);
    image.add(myBtn);
    JButton myBtn2 = new JButton("Tap to continue >>>");
    Font font2 = new Font("Times New Roman", Font.BOLD, 29);
    myBtn2.setFont(font2);
    myBtn2.setBounds(125, 360, 310, 70);
    myBtn2.setBackground(Color.WHITE);
    myBtn2.setForeground(Color.BLACK);
    myBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          dispose();
          login newLogin = new login();
          newLogin.ShowLoginUI();
        }
      }
    );
    myBtn2.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          setVisible(false);
          login newLogin = new login();
          newLogin.ShowLoginUI();
        }
      }
    );
    image.add(myBtn2);
    JLabel welcomeLabel = new JLabel("Welcome to our System");
    welcomeLabel.setBounds(450, 20, 450, 40);
    Font font3 = new Font("Times New Roman", Font.BOLD, 38);
    welcomeLabel.setFont(font3);

    image.add(welcomeLabel);
    add(image);

    setSize(1111, 537);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);

    while (true) {
      myBtn.setVisible(true);
      welcomeLabel.setForeground(Color.YELLOW);
      try {
        Thread.sleep(700);
      } catch (Exception e) {
        e.printStackTrace();
      }
      welcomeLabel.setForeground(Color.GREEN);
      myBtn.setVisible(false);
      myBtn2.setVisible(true);
      try {
        Thread.sleep(700);
      } catch (Exception e) {
        e.printStackTrace();
      }
      welcomeLabel.setForeground(Color.CYAN);
      myBtn2.setVisible(false);

      myBtn.setVisible(true);
      try {
        Thread.sleep(700);
      } catch (Exception e) {
        e.printStackTrace();
      }
      welcomeLabel.setForeground(Color.BLUE);
      myBtn.setVisible(false);
      myBtn2.setVisible(true);
      try {
        Thread.sleep(700);
      } catch (Exception e) {
        e.printStackTrace();
      }
      welcomeLabel.setForeground(Color.RED);

      myBtn.setVisible(true);
      myBtn2.setVisible(false);
    }
  }

  public static void main(String[] args) {
    new start();
  }
}
