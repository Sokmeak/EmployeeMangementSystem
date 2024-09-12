package com.System_Operations;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class signup extends JFrame {

  private static final long serialVersionUID = 1L;

  JPanel myPanel = new JPanel();

  Font myFont() {
    return new Font("Times New Roman", Font.ROMAN_BASELINE, 16);
  }

  Font myFontBold() {
    return new Font("Times New Roman", Font.BOLD, 17);
  }

  MatteBorder myTfBorder() {
    return new MatteBorder(0, 0, 1, 0, Color.GREEN);
  }

  public signup() {
    setTitle("Sign Up UI");

    myPanel.setLayout(null);
    myPanel.setBounds(35, 35, 600, 400);

    myPanel.setBackground(Color.WHITE);

    add(myPanel);

    ImageIcon myIcon = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//Sign01.jpg")
    );
    Image im = myIcon
      .getImage()
      .getScaledInstance(250, 300, Image.SCALE_SMOOTH);
    ImageIcon igi = new ImageIcon(im);
    JLabel image = new JLabel(igi);
    image.setBounds(35, 40, 250, 300);
    myPanel.add(image);

    JLabel signUpLb = new JLabel("Sign Up Form");
    signUpLb.setBounds(390, 40, 150, 30);
    Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    signUpLb.setFont(f1);
    myPanel.add(signUpLb);

    JLabel userNameLb = new JLabel("Username");
    userNameLb.setBounds(230, 90, 180, 30);
    userNameLb.setHorizontalAlignment(SwingConstants.RIGHT);
    userNameLb.setFont(myFont());
    myPanel.add(userNameLb);

    JTextField userNameTf = new JTextField("");
    userNameTf.setBounds(415, 90, 160, 30);
    userNameTf.setFont(myFont());
    userNameTf.setBorder(myTfBorder());

    myPanel.add(userNameTf);

    JLabel emailLb = new JLabel("Email");
    emailLb.setBounds(230, 140, 180, 30);
    emailLb.setHorizontalAlignment(SwingConstants.RIGHT);
    emailLb.setFont(myFont());
    myPanel.add(emailLb);

    JTextField emailTf = new JTextField("");
    emailTf.setBounds(415, 140, 160, 30);
    emailTf.setFont(myFont());
    emailTf.setBorder(myTfBorder());

    myPanel.add(emailTf);

    JLabel pwLb = new JLabel("Password");
    pwLb.setBounds(230, 190, 180, 30);
    pwLb.setHorizontalAlignment(SwingConstants.RIGHT);
    pwLb.setFont(myFont());

    myPanel.add(pwLb);

    JPasswordField passField = new JPasswordField();
    passField.setBounds(415, 190, 160, 30);
    passField.setFont(myFont());
    passField.setEchoChar('•');
    passField.setBorder(myTfBorder());
    myPanel.add(passField);

    JLabel conPwLb = new JLabel("Confirm Password");
    conPwLb.setBounds(230, 240, 180, 30);
    conPwLb.setHorizontalAlignment(SwingConstants.RIGHT);
    conPwLb.setFont(myFont());
    myPanel.add(conPwLb);

    JPasswordField conpField = new JPasswordField();
    conpField.setBounds(415, 240, 160, 30);
    conpField.setFont(myFont());

    // Set a custom DocumentFilter to replace entered characters with asterisks
    conpField.setEchoChar('•'); // Set initial echo character

    conpField.setBorder(myTfBorder());
    myPanel.add(conpField);
    JButton showBtn = new JButton("Show Password");
    showBtn.setBounds(460, 300, 120, 40);
    showBtn.setBackground(Color.BLUE);
    showBtn.setForeground(Color.WHITE);
    showBtn.setFont(myFontBold());
    showBtn.setBorder(
      new LineBorder(Color.BLACK, 1, true) {
        @Override
        public void paintBorder(
          Component c,
          Graphics g,
          int x,
          int y,
          int width,
          int height
        ) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setColor(getLineColor());
          g2d.draw(
            new RoundRectangle2D.Double(x, y, width - 1, height - 1, 10, 10)
          );
          g2d.dispose();
        }
      }
    );
    showBtn.setPreferredSize(new Dimension(120, 40));
    showBtn.setHorizontalAlignment(SwingConstants.CENTER);
    myPanel.add(showBtn);
    JButton hideBtn = new JButton("Hide Password");
    hideBtn.setBounds(460, 300, 120, 40);
    hideBtn.setBackground(Color.PINK);
    hideBtn.setForeground(Color.WHITE);
    hideBtn.setFont(myFontBold());
    hideBtn.setBorder(
      new LineBorder(Color.BLACK, 1, true) {
        @Override
        public void paintBorder(
          Component c,
          Graphics g,
          int x,
          int y,
          int width,
          int height
        ) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setColor(getLineColor());
          g2d.draw(
            new RoundRectangle2D.Double(x, y, width - 1, height - 1, 10, 10)
          );
          g2d.dispose();
        }
      }
    );

    hideBtn.setPreferredSize(new Dimension(120, 40));
    hideBtn.setHorizontalAlignment(SwingConstants.CENTER);
    hideBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          hideBtn.setVisible(false);
          showBtn.setVisible(true);
          passField.setEchoChar('•'); // Mask the characters
          conpField.setEchoChar('•');
        }
      }
    );
    showBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          showBtn.setVisible(false);
          hideBtn.setVisible(true);
          passField.setEchoChar((char) 0); // Show the actual characters
          conpField.setEchoChar((char) 0);
        }
      }
    );
    myPanel.add(showBtn);
    myPanel.add(hideBtn);

    JButton SignUP = new JButton("Signup");
    SignUP.setBounds(330, 300, 100, 40);
    Color csColor2 = new Color(0, 204, 204);
    SignUP.setBackground(csColor2);
    SignUP.setForeground(Color.WHITE);
    SignUP.setFont(myFontBold());
    SignUP.setBorder(
      new LineBorder(Color.BLACK, 1, true) {
        @Override
        public void paintBorder(
          Component c,
          Graphics g,
          int x,
          int y,
          int width,
          int height
        ) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setColor(getLineColor());
          g2d.draw(
            new RoundRectangle2D.Double(x, y, width - 1, height - 1, 10, 10)
          );
          g2d.dispose();
        }
      }
    );

    SignUP.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // TODO Auto-generated method stub

          String us = userNameTf.getText();
          String em = emailTf.getText();
          String pas = String.valueOf(passField.getPassword());
          String comp = String.valueOf(conpField.getPassword());

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

          if (resultCheck) {
            JOptionPane.showMessageDialog(
              null,
              "This admin already has in the system!",
              "Notifacation",
              JOptionPane.ERROR_MESSAGE
            );
            // clear form
            userNameTf.setText("");
            emailTf.setText("");
            passField.setText("");
            conpField.setText("");
          } else {
            myfileServicer.AppendData(fileSerive.filename, psn);
            JOptionPane.showMessageDialog(null, "Signup Successfully!");
            setVisible(false);
            //            MainMenu myMainMenu = new MainMenu();
            //            myMainMenu.VisualizeMainMenu();
            dispose();
            main pm = new main();
            pm.setVisibleMenu();
          }
        }
      }
    );

    // Set the preferred size to maintain the rounded shape
    SignUP.setPreferredSize(new Dimension(100, 40));
    SignUP.setHorizontalAlignment(SwingConstants.CENTER);

    myPanel.add(SignUP);

    // if success -> Main Menu

    Color cl = new Color(255, 153, 153);
    getContentPane().setBackground(cl);
    setSize(670, 500);
    setLayout(null);
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void ShowSignUp() {
    setVisible(true);
  }

  public static void main(String[] args) {
    // let signup now!!!

    new signup();
  }
}
