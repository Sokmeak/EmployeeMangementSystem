package com.Lab01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2Classses extends JFrame {

  // declare variabes here
  // follow this style ^_^ goodnight
  // we can use static or global variables the same as togeher!
  public ArrayList<Integer> myArrayList = new ArrayList<>();
  public JPanel p1 = new JPanel();
  private JPanel p2 = new JPanel();
  private JPanel p3 = new JPanel();

  private JButton Btnchange = new JButton("Change");
  private JButton Btnback = new JButton("Reverse");
  private JButton BtnCheckResult = new JButton("Check");

  Test2Classses() {
    MyClickListener click = new MyClickListener();
    setTitle("test two panels");
    setSize(600, 600);
    setLayout(null);

    p1.setLayout(null);
    p1.setSize(300, 600);
    p1.setBounds(0, 0, 300, 600);
    p1.setBackground(Color.CYAN);
    add(p1);

    Btnchange.setBounds(50, 50, 150, 30);
    Btnchange.setBackground(Color.GREEN);
    Btnchange.setFont(new Font("Times New Roman", Font.BOLD, 17));

    Btnback.setBounds(50, 80, 150, 30);
    Btnback.setBackground(Color.magenta);
    Btnback.setFont(new Font("Times New Roman", Font.BOLD, 17));

    BtnCheckResult.setBounds(50, 130, 150, 30);
    BtnCheckResult.setBackground(Color.BLUE);
    BtnCheckResult.setFont(new Font("Times New Roman", Font.BOLD, 17));

    BtnCheckResult.addActionListener(click);

    // add(p1);

    p2.setSize(300, 600);
    p2.setBounds(300, 0, 300, 600);
    p2.setBackground(Color.PINK);
    p2.setLayout(null);
    add(p2);

    p3.setSize(300, 600);
    p3.setBounds(300, 0, 300, 600);
    p3.setLayout(null);
    p3.setBackground(Color.GRAY);
    Btnchange.addActionListener(click);
    Btnback.addActionListener(click);
    p1.add(Btnchange);

    p1.add(Btnback);
    p1.add(BtnCheckResult);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
  }

  Cont2Classes c2c = new Cont2Classes();

  private class MyClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == Btnchange) {
        myArrayList.add(10);
        myArrayList.add(10);
        myArrayList.add(10);
        c2c.setVisible(false);
        p2.setVisible(false);
        add(p3);
        p3.setVisible(true);
      } else if (e.getSource() == Btnback) {
        myArrayList.add(5);
        myArrayList.add(10);
        myArrayList.add(10);
        c2c.setVisible(false);

        // for (int i : myArrayList) {
        //   System.out.println(i + " ");
        // }

        p3.setVisible(false);
        add(p2);
        p2.setVisible(true);
      } else if (e.getSource() == BtnCheckResult) {
        p2.setVisible(false);
        p3.setVisible(false);

        add(c2c);
        c2c.setMyText(myArrayList);
        c2c.setVisible(true);
      }
    }
  }

  public static void main(String[] args) {
    new Test2Classses();
  }
}
