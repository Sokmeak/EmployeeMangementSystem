package com.Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class testSettings2 extends JPanel {

  public MatteBorder myTfBorder() {
    return new MatteBorder(1, 1, 1, 1, Color.GREEN);
  }

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public Font myFont() {
    return new Font("Time New Romans", Font.ROMAN_BASELINE, 18);
  }

  public testSettings2() {
    setSize(1050, 600);
    setBounds(210, 0, 1050, 600);
    setLayout(null);

    JPanel subPanel = new JPanel();
    subPanel.setLayout(null);
    subPanel.setSize(450, 600);
    subPanel.setBounds(0, 0, 450, 600);
    Color myColor = new Color(224, 225, 225);
    subPanel.setBackground(myColor);

    JLabel header = new JLabel("Settings");
    header.setBounds(160, 70, 150, 30);
    header.setFont(new Font("Time New Romans", Font.BOLD, 25));
    header.setForeground(Color.BLACK);

    JButton BtnAdd = new JButton("Add Admin");
    BtnAdd.setBounds(100, 120, 200, 30);
    BtnAdd.setFont(myFont());
    BtnAdd.setForeground(Color.BLACK);
    BtnAdd.setBackground(Color.blue);
    subPanel.add(BtnAdd);

    JButton BtnUpdate = new JButton("Update Admin");
    BtnUpdate.setBounds(100, 160, 200, 30);
    BtnUpdate.setFont(myFont());
    BtnUpdate.setForeground(Color.BLACK);
    BtnUpdate.setBackground(Color.GREEN);
    subPanel.add(BtnUpdate);

    JButton Title3Btn = new JButton("Remove Admin");
    Title3Btn.setBounds(100, 200, 200, 30);
    Title3Btn.setFont(myFont());
    Title3Btn.setForeground(Color.BLACK);
    Title3Btn.setBackground(Color.RED);
    subPanel.add(Title3Btn);

    JButton BtnDis = new JButton("Display Admin");
    BtnDis.setBounds(100, 240, 200, 30);
    BtnDis.setFont(myFont());
    BtnDis.setForeground(Color.BLACK);
    BtnDis.setBackground(Color.YELLOW);
    subPanel.add(BtnDis);

    subPanel.add(header);
    add(subPanel);

    JPanel subPanel2 = new JPanel();
    subPanel2.setSize(600, 600);
    subPanel2.setBounds(450, 0, 600, 600);
    subPanel2.setBackground(Color.WHITE);
    subPanel2.setLayout(null);

    JPanel subPanelAdd = new JPanel();
    subPanelAdd.setSize(600, 600);
    subPanelAdd.setBounds(450, 0, 600, 600);
    subPanelAdd.setBackground(Color.pink);
    //		Color Mycolour=new Color(50, 119, 168);
    //		subPanel.setBackground(Mycolour);
    subPanelAdd.setLayout(null);

    JPanel subPanelUpdate = new JPanel();
    subPanelUpdate.setSize(600, 600);
    subPanelUpdate.setBounds(450, 0, 600, 600);
    //		Color myCoolor = new Color(50, 119, 168);
    //		subPanel.setBackground(myCoolor);
    subPanelUpdate.setBackground(Color.pink);
    subPanelUpdate.setLayout(null);
    //  JPanel subPanelUdate2= new JPanel();

    JPanel subPaneRemove = new JPanel();
    subPaneRemove.setSize(600, 600);
    subPaneRemove.setBounds(450, 0, 600, 600);
    subPaneRemove.setBackground(Color.pink);
    subPaneRemove.setLayout(null);

    JPanel subPanelDisplay = new JPanel();
    subPanelDisplay.setSize(600, 600);
    subPanelDisplay.setBounds(450, 0, 600, 600);
    subPanelDisplay.setBackground(Color.pink);
    subPanelDisplay.setLayout(null);

    JLabel lblID1 = new JLabel("ID:");
    lblID1.setBounds(100, 160, 100, 30);
    subPanelUpdate.add(lblID1);

    JTextField txtID1 = new JTextField();
    txtID1.setBounds(260, 160, 150, 30);
    txtID1.setBorder(myTfBorder());
    subPanelUpdate.add(txtID1);

    JLabel lblphone1 = new JLabel("Email/Phone:");
    lblphone1.setBounds(100, 200, 100, 30);
    subPanelUpdate.add(lblphone1);

    JTextField txtphone1 = new JTextField();
    txtphone1.setBounds(260, 200, 150, 30);
    txtphone1.setBorder(myTfBorder());
    subPanelUpdate.add(txtphone1);

    JLabel pwLb1 = new JLabel("Password:");
    pwLb1.setBounds(100, 240, 150, 30);
    // pwLb.setHorizontalAlignment(SwingConstants.RIGHT);
    // pwLb.setFont(myFont());
    subPanelUpdate.add(pwLb1);

    JPasswordField passField1 = new JPasswordField();
    passField1.setBounds(260, 240, 150, 30);
    passField1.setFont(myFont());
    passField1.setEchoChar('•');
    passField1.setBorder(myTfBorder());
    subPanelUpdate.add(passField1);

    JLabel conPwLb1 = new JLabel("Confirm Password:");
    conPwLb1.setBounds(100, 280, 180, 30);
    //conPwLb.setHorizontalAlignment(SwingConstants.RIGHT);
    //conPwLb.setFont(myFont());
    subPanelUpdate.add(conPwLb1);

    JPasswordField conpField1 = new JPasswordField();
    conpField1.setBounds(260, 280, 150, 30);
    conpField1.setBorder(myTfBorder());
    conpField1.setFont(myFont());
    subPanelUpdate.add(conpField1);

    JLabel lblUserName = new JLabel("Username:");
    lblUserName.setBounds(100, 120, 100, 30);
    subPanelAdd.add(lblUserName);

    JTextField txtUserName = new JTextField();
    txtUserName.setBounds(260, 120, 150, 30);
    txtUserName.setBorder(myTfBorder());
    subPanelAdd.add(txtUserName);

    JLabel lblID = new JLabel("ID:");
    lblID.setBounds(100, 160, 100, 30);
    subPanelAdd.add(lblID);

    JTextField txtID = new JTextField();
    txtID.setBounds(260, 160, 150, 30);
    txtID.setBorder(myTfBorder());
    subPanelAdd.add(txtID);

    JLabel lblphone = new JLabel("Email/Phone:");
    lblphone.setBounds(100, 200, 100, 30);
    subPanelAdd.add(lblphone);

    JTextField txtphone = new JTextField();
    txtphone.setBounds(260, 200, 150, 30);
    txtphone.setBorder(myTfBorder());
    subPanelAdd.add(txtphone);

    JLabel pwLb = new JLabel("Password:");
    pwLb.setBounds(100, 240, 150, 30);
    // pwLb.setHorizontalAlignment(SwingConstants.RIGHT);
    // pwLb.setFont(myFont());
    subPanelAdd.add(pwLb);

    JPasswordField passField = new JPasswordField();
    passField.setBounds(260, 240, 150, 30);
    passField.setFont(myFont());
    passField.setEchoChar('•');
    passField.setBorder(myTfBorder());
    subPanelAdd.add(passField);

    JLabel conPwLb = new JLabel("Confirm Password:");
    conPwLb.setBounds(100, 280, 180, 30);
    //conPwLb.setHorizontalAlignment(SwingConstants.RIGHT);
    //conPwLb.setFont(myFont());
    subPanelAdd.add(conPwLb);

    JPasswordField conpField = new JPasswordField();
    conpField.setBounds(260, 280, 150, 30);
    conpField.setBorder(myTfBorder());
    conpField.setFont(myFont());
    subPanelAdd.add(conpField);

    ImageIcon myIcon = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//Setting2.jpg")
    );
    Image image = myIcon
      .getImage()
      .getScaledInstance(600, 600, Image.SCALE_SMOOTH);
    ImageIcon igi = new ImageIcon(image);
    JLabel imageLb = new JLabel(igi);
    imageLb.setBounds(0, 0, 600, 600);

    subPanel2.add(imageLb);
    //subPanel2.setBackground(Color.PINK);

    add(subPanel2);

    BtnAdd.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          subPanel2.setVisible(false);
          subPaneRemove.setVisible(false);
          subPanelUpdate.setVisible(false);
          add(subPanelAdd);
          subPanelAdd.setVisible(true);
          //subPanelAdd.setVisible(false);
          //add(subPanelUpdate);

        }
      }
    );
    BtnUpdate.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          subPaneRemove.setVisible(false);
          subPanel2.setVisible(false);
          //	add(subPanelAdd);
          //subPanelAdd.setVisible(true);
          subPanelAdd.setVisible(false);
          add(subPanelUpdate);
          subPanelUpdate.setVisible(true);
        }
      }
    );

    Title3Btn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          subPaneRemove.setVisible(false);
          subPanel2.setVisible(false);
          //	add(subPanelAdd);
          //subPanelAdd.setVisible(true);
          subPanelAdd.setVisible(false);
          subPanelUpdate.setVisible(false);
          add(subPaneRemove);
          subPaneRemove.setVisible(true);
        }
      }
    );

    BtnDis.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          subPaneRemove.setVisible(false);
          subPanel2.setVisible(false);
          //	add(subPanelAdd);
          //subPanelAdd.setVisible(true);
          subPanelAdd.setVisible(false);
          subPanelUpdate.setVisible(false);
          subPaneRemove.setVisible(false);
          add(subPanelDisplay);
          subPanelDisplay.setVisible(true);
        }
      }
    );

    setBackground(Color.WHITE);
  }

  public void setVisible() {
    setVisible(true);
  }

  public static void main(String[] args) {
    new testSettings2();
  }
}
