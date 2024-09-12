package com.Lab01;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cont2Classes extends JPanel {

  private JLabel myLabel = new JLabel();
  private JLabel myLabel2 = new JLabel();

  Cont2Classes() {
    setLayout(null);
    setSize(300, 600);
    setBounds(300, 0, 300, 600);
    setBackground(Color.lightGray);

    myLabel.setBounds(20, 50, 200, 40);
    add(myLabel);

    myLabel2.setBounds(20, 100, 200, 40);
    add(myLabel2);
  }

  public void setMyText(ArrayList<Integer> arr) {
    String text = "";
    int total = 0;
    for (int i : arr) {
      total = total + i;
      text = text + String.valueOf(i) + ", ";
    }
    myLabel.setText("Value : " + text);
    myLabel2.setText("Total : " + total);
  }

  public static void main(String[] args) {
    new Cont2Classes();
  }
}
