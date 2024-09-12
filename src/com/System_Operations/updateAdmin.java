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

public class updateAdmin extends JPanel {

  private JPanel subpForLb = new JPanel();
  private JPanel subpForTf = new JPanel();

  private JLabel updateLabel = new JLabel();

  private JButton updateAdminInfo = new JButton("Update");
  private JButton refresh = new JButton("Refresh");

  private JButton hideBtn = new JButton("Hide");
  private JButton showBtn = new JButton("Show");

  private JLabel currentEmailOrUserLb = new JLabel("Current Email/Username");
  private JLabel curPasswordLb = new JLabel("Current Password: ");

  private JTextField currentEmialTf = new JTextField();

  private JPasswordField currentPass2 = new JPasswordField();

  private JPasswordField passField = new JPasswordField();
  private JPasswordField comPassField = new JPasswordField();

  private JLabel newuserNameLb = new JLabel("New Username:");
  private JLabel newEmail = new JLabel("New Email:");
  private JLabel passWlb = new JLabel("New Password:");
  private JLabel comFpassWlb = new JLabel("Verify Password:");

  private JTextField usernameTF = new JTextField("");
  private JTextField newEmailTf = new JTextField("");

  private Font myFont() {
    return new Font("Time New Romans", Font.ROMAN_BASELINE, 16);
  }

  private Color myColor1() {
    return new Color(109, 195, 205);
  }

  public updateAdmin() {
    subpForLb.setBounds(80, 100, 190, 300);

    subpForLb.setLayout(null);

    subpForLb.setBackground(myColor1());

    subpForTf.setBounds(270, 100, 200, 300);

    subpForTf.setBackground(myColor1());
    subpForTf.setLayout(null);

    updateLabel.setText("Update Admin ");
    updateLabel.setFont(myFont());
    updateLabel.setBounds(200, 30, 180, 30);

    currentEmailOrUserLb.setBounds(5, 20, 230, 30);
    currentEmailOrUserLb.setFont(myFont());
    subpForLb.add(currentEmailOrUserLb);

    currentEmialTf.setBounds(20, 20, 200, 30);

    currentEmialTf.setFont(myFont());
    subpForTf.add(currentEmialTf);

    curPasswordLb.setBounds(5, 60, 180, 30);
    curPasswordLb.setFont(myFont());
    subpForLb.add(curPasswordLb);

    // currentpassTf.setBounds(20, 60, 200, 30);
    // currentpassTf.setFont(myFont());
    // subpForTf.add(currentpassTf);
    currentPass2.setBounds(20, 60, 180, 30);
    currentPass2.setFont(myFont());
    currentPass2.setEchoChar('•');
    subpForTf.add(currentPass2);

    newuserNameLb.setBounds(5, 100, 180, 30);
    newuserNameLb.setFont(myFont());
    subpForLb.add(newuserNameLb);

    usernameTF.setBounds(20, 100, 180, 30);
    usernameTF.setFont(myFont());
    subpForTf.add(usernameTF);

    newEmail.setBounds(5, 140, 170, 30);
    newEmail.setFont(myFont());

    subpForLb.add(newEmail);

    newEmailTf.setBounds(20, 140, 180, 30);
    newEmailTf.setFont(myFont());
    subpForTf.add(newEmailTf);

    // curPassTf.setBounds(20, 140, 180, 30);
    // curPassTf.setFont(myFont());
    // subpForTf.add(curPassTf);

    passWlb.setBounds(5, 180, 130, 30);
    passWlb.setFont(myFont());
    // subpAddLb.setLayout(null);
    subpForLb.add(passWlb);

    // passWTF.setBounds(20, 180, 180, 30);
    // passWTF.setFont(myFont());
    // subpForTf.add(passWTF);

    passField.setBounds(20, 180, 180, 30);
    passField.setFont(myFont());
    // passField.setEchoChar('•');
    subpForTf.add(passField);

    comFpassWlb.setBounds(5, 220, 180, 30);
    comFpassWlb.setFont(myFont());
    // * subpAddLb.setLayout(null);
    subpForLb.add(comFpassWlb);

    comPassField.setBounds(20, 220, 180, 30);
    comPassField.setFont(myFont());
    // comPassField.setEchoChar('•');
    subpForTf.add(comPassField);

    // comFpassWTF.setBounds(20, 220, 180, 30);
    // comFpassWTF.setFont(myFont());
    //subpForTf.add(comFpassWTF);

    add(subpForLb);
    add(subpForTf);

    updateAdminInfo.setBounds(140, 430, 150, 40);
    updateAdminInfo.setBackground(Color.PINK);
    updateAdminInfo.setFont(myFont());
    updateAdminInfo.addActionListener(new MyClickListener());
    add(updateAdminInfo);

    refresh.setBounds(300, 430, 150, 40);
    refresh.setBackground(Color.GREEN);
    refresh.setFont(myFont());
    /// More implementation
    /// use sample from Sign up
    showBtn.setBounds(300, 430, 150, 40);
    showBtn.setBackground(Color.GREEN);
    showBtn.setFont(myFont());
    // showBtn.addActionListener(
    //   new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //       showBtn.setVisible(false);
    //       add(hideBtn);
    //       hideBtn.setVisible(true);
    //       hideBtn.setVisible(true);
    //       passField.setEchoChar((char) 0);
    //       comPassField.setEchoChar((char) 0);
    //     }
    //   }
    // );
    showBtn.addActionListener(new MyClickListener());
    add(showBtn);

    hideBtn.setBounds(300, 430, 150, 40);
    hideBtn.setBackground(Color.YELLOW);

    hideBtn.addActionListener(new MyClickListener());
    hideBtn.setFont(myFont());

    refresh.addActionListener(new MyClickListener());
    //add(refresh);

    add(updateLabel);
    setSize(530, 545);
    setBounds(505, 5, 530, 545);
    setBackground(myColor1());
    setLayout(null);
  }

  public class MyClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == updateAdminInfo) {
        // To do sth (update)

        String curentusOremail = currentEmialTf.getText();
        //String currentPs = currentpassTf.getText();
        String currentPs = String.valueOf(currentPass2.getPassword());

        String Newus = usernameTF.getText();
        String Newem = newEmailTf.getText();

        String newPasswordField = String.valueOf(passField.getPassword());
        String newCompassField = String.valueOf(comPassField.getPassword());

        if (!Newem.contains("@gmail.com")) {
          JOptionPane.showMessageDialog(
            null,
            "Invalid your email, miss \"@gmail.com\"",
            "Notifacation",
            JOptionPane.ERROR_MESSAGE
          );
          return;
        }

        if (!newPasswordField.equals(newCompassField)) {
          JOptionPane.showMessageDialog(
            null,
            "Password and Confirm Password must be the same!",
            "Notifacation",
            JOptionPane.ERROR_MESSAGE
          );
          return;
        }

        //Person psn = new Person(Newus, Newem, Newpas, Newcomp);
        fileSerive myfileServicer = new fileSerive();
        Boolean resultCheck = myfileServicer.AdminChekerLog(
          fileSerive.filename,
          curentusOremail,
          currentPs
        );

        if (resultCheck == false) {
          JOptionPane.showMessageDialog(
            null,
            "This admin has no in the system!",
            "Notifacation",
            JOptionPane.ERROR_MESSAGE
          );
          return;
          // clear form

        }

        Person curPson = new Person(
          Newus,
          Newem,
          newPasswordField,
          newCompassField
        );

        fileSerive.updateAdmin(
          curentusOremail,
          currentPs,
          curPson,
          fileSerive.filename
        );

        currentEmialTf.setText("");
        currentPass2.setText("");
        comPassField.setText("");
        usernameTF.setText("");
        newEmailTf.setText("");
        passField.setText("");
      } else if (e.getSource() == showBtn) {
        add(hideBtn);
        showBtn.setVisible(false);
        hideBtn.setVisible(true);
        passField.setEchoChar((char) 0);
        comPassField.setEchoChar((char) 0);
        currentPass2.setEchoChar((char) 0);
      } else if (e.getSource() == hideBtn) {
        add(showBtn);
        hideBtn.setVisible(false);
        showBtn.setVisible(true);
        passField.setEchoChar('•');
        comPassField.setEchoChar('•');
        currentPass2.setEchoChar('•');
      }
    }
  }
}
