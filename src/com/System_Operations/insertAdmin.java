package com.System_Operations;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class insertAdmin extends JPanel {

  private JPanel subpAddLb = new JPanel();
  private JPanel subpAddTf = new JPanel();
  private JLabel addLabel = new JLabel();

  private JButton insertAdmin = new JButton("Insert");
  private JButton hideBtn = new JButton("Hide");

  private JButton showBtn = new JButton("Show");

  private JLabel userNameLb = new JLabel("Username:");
  private JLabel emailLb = new JLabel("Email:");
  private JLabel passWlb = new JLabel("Password:");
  private JLabel comFpassWlb = new JLabel("Comfirm Password:");

  private JTextField userNameTF = new JTextField("");
  private JTextField emailTf = new JTextField("");
  private JPasswordField passWTField = new JPasswordField();
  private JPasswordField comFpassWTField = new JPasswordField();

  public Font myFont() {
    return new Font("Time New Romans", Font.ROMAN_BASELINE, 18);
  }

  private Color myColor1() {
    return new Color(109, 195, 205);
  }

  public insertAdmin() {
    subpAddLb.setBounds(80, 100, 190, 300);
    subpAddLb.setFont(myFont());
    subpAddLb.setLayout(null);

    subpAddLb.setBackground(myColor1());

    subpAddTf.setBounds(270, 100, 200, 300);
    subpAddTf.setFont(myFont());
    subpAddTf.setBackground(myColor1());
    subpAddTf.setLayout(null);

    userNameLb.setBounds(5, 20, 130, 30);
    userNameLb.setFont(myFont());
    subpAddLb.add(userNameLb);
    userNameTF.setBounds(20, 20, 180, 30);
    userNameTF.setFont(myFont());
    subpAddTf.add(userNameTF);

    emailLb.setBounds(5, 90, 130, 30);
    emailLb.setFont(myFont());

    subpAddLb.add(emailLb);
    emailTf.setBounds(20, 90, 180, 30);
    emailTf.setFont(myFont());
    subpAddTf.add(emailTf);

    passWlb.setBounds(5, 160, 130, 30);
    passWlb.setFont(myFont());

    // subpAddLb.setLayout(null);
    subpAddLb.add(passWlb);

    passWTField.setBounds(20, 160, 180, 30);
    passWTField.setFont(myFont());
    passWTField.setEchoChar('•');
    subpAddTf.add(passWTField);

    comFpassWlb.setBounds(5, 230, 160, 30);
    comFpassWlb.setFont(myFont());
    //* subpAddLb.setLayout(null);
    subpAddLb.add(comFpassWlb);

    comFpassWTField.setBounds(20, 230, 180, 30);
    comFpassWTField.setFont(myFont());
    comFpassWTField.setEchoChar('•');
    subpAddTf.add(comFpassWTField);

    add(subpAddLb);
    add(subpAddTf);

    insertAdmin.setBounds(140, 430, 150, 40);
    insertAdmin.setBackground(Color.PINK);
    insertAdmin.setFont(myFont());
    insertAdmin.addActionListener(new MyClickListener());
    add(insertAdmin);

    hideBtn.setBounds(300, 430, 150, 40);
    hideBtn.setBackground(Color.GREEN);
    hideBtn.setFont(myFont());

    hideBtn.addActionListener(new MyClickListener());
    add(hideBtn);

    showBtn.setBounds(300, 430, 150, 40);
    showBtn.setBackground(Color.yellow);
    showBtn.setFont(myFont());
    showBtn.addActionListener(new MyClickListener());

    add(showBtn);

    addLabel.setText("Insert new Admin ");
    addLabel.setFont(myFont());
    addLabel.setBounds(200, 30, 180, 30);

    add(addLabel);
    setSize(530, 545);
    setBounds(505, 5, 530, 545);
    setBackground(myColor1());
    setLayout(null);
  } // domain of construct

  public class MyClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == insertAdmin) {
        String us = userNameTF.getText();
        String em = emailTf.getText();
        String pas = String.valueOf(passWTField.getPassword());
        String comp = String.valueOf(comFpassWTField.getPassword());

        if (!em.contains("@gmail.com")) {
          JOptionPane.showMessageDialog(
            null,
            "Invalid your email, miss \"@gmail.com\"",
            "Notifacation",
            JOptionPane.ERROR_MESSAGE
          );
          return;
        }

        if (!pas.equals(comp)) {
          JOptionPane.showMessageDialog(
            null,
            "Password and Confirm Password must be the same!",
            "Notifacation",
            JOptionPane.ERROR_MESSAGE
          );
          return;
        }

        Person psn = new Person(us, em, pas, comp);
        fileSerive myfileServicer = new fileSerive();
        Boolean resultCheck = myfileServicer.AdminCheker(
          fileSerive.filename,
          psn
        );

        if (resultCheck == true) {
          JOptionPane.showMessageDialog(
            null,
            "This admin already has in the system!",
            "Notifacation",
            JOptionPane.ERROR_MESSAGE
          );
          // clear form

        } else {
          myfileServicer.AppendData(fileSerive.filename, psn);
          JOptionPane.showMessageDialog(null, "Insert Successfully!");
          //            MainMenu myMainMenu = new MainMenu();
          //            myMainMenu.VisualizeMainMenu();

        }
        passWTField.setText("");
        comFpassWTField.setText("");
        userNameTF.setText("");
        emailTf.setText("");
        passWTField.setText("");
        comFpassWTField.setText("");
      } else if (e.getSource() == hideBtn) {
        add(showBtn);
        showBtn.setVisible(true);
        hideBtn.setVisible(false);

        passWTField.setEchoChar('•');
        comFpassWTField.setEchoChar('•');
      } else if (e.getSource() == showBtn) {
        add(hideBtn);
        hideBtn.setVisible(true);
        showBtn.setVisible(false);
        passWTField.setEchoChar((char) 0);
        comFpassWTField.setEchoChar((char) 0);
      }
    }
  }
}
