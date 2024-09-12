package com.Lab01;

import java.awt.*;
import java.util.concurrent.Flow;
import javax.swing.*;

public class SettingDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Settings");
    frame.setSize(400, 500);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    placeComponents(panel);
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    frame.setVisible(true);
  }

  private static void placeComponents(JPanel panel) {
    panel.setSize(170, 300);
    panel.setBackground(Color.CYAN);
    panel.setBounds(50, 10, 170, 400);
    panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    JLabel settingsLabel = new JLabel("Settings");
    settingsLabel.setBounds(10, 10, 80, 25);
    panel.add(settingsLabel);

    JButton adminButton = new JButton("Add new Admin");
    adminButton.setBounds(10, 40, 150, 25);
    adminButton.setBackground(new Color(255, 153, 102));

    panel.add(adminButton);

    JButton logoutButton = new JButton("Delete Admin");
    logoutButton.setBounds(10, 70, 150, 25);
    logoutButton.setBackground(Color.RED);
    panel.add(logoutButton);

    JButton clearDataButton = new JButton("Update information");
    clearDataButton.setBounds(10, 100, 150, 25);
    clearDataButton.setBackground(Color.BLUE);
    panel.add(clearDataButton);

    JButton DisplayBtn = new JButton("Display Admin List");
    DisplayBtn.setBounds(10, 130, 150, 25);
    DisplayBtn.setBackground(Color.GRAY);
    panel.add(DisplayBtn);

    JButton LogBtn = new JButton("Lock Admin Permission");
    LogBtn.setBounds(10, 160, 150, 25);
    LogBtn.setBackground(Color.YELLOW);
    panel.add(LogBtn);
  }
}
