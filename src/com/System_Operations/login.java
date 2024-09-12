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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame {

  private static final long serialVersionUID = 1L;

  //public JFrame f = new JFrame("login GUI");
  //public String filename = "MyAdmin.csv";

  Font myFont() {
    return new Font("Times New Roman", Font.ROMAN_BASELINE, 18);
  }

  public login() {
    setTitle("Login UI");
    getContentPane().setBackground(Color.CYAN);

    JPanel panel = new JPanel();
    panel.setBounds(40, 30, 500, 330);
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    ImageIcon myIcon = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//login.jpg")
    );
    Image im = myIcon
      .getImage()
      .getScaledInstance(250, 350, Image.SCALE_DEFAULT);
    ImageIcon igi = new ImageIcon(im);
    JLabel image = new JLabel(igi);
    image.setBounds(250, 3, 250, 350);

    panel.add(image);

    JLabel titleLabel = new JLabel("Login form");
    titleLabel.setBounds(70, 10, 100, 40);
    Font font = new Font("Times New Roman", Font.BOLD, 20);
    titleLabel.setFont(font);
    panel.add(titleLabel);

    JLabel userLabel = new JLabel("Username or email");
    // panel.add(userLabel);
    userLabel.setBounds(30, 60, 150, 30);
    Font font2 = new Font("Times New Roman", Font.ROMAN_BASELINE, 18);
    userLabel.setFont(font2);
    panel.add(userLabel);

    JTextField usertf = new JTextField("");
    usertf.setBounds(30, 100, 200, 30);
    usertf.setFont(myFont());
    panel.add(usertf);

    JLabel pwLabel = new JLabel("Password");
    pwLabel.setBounds(30, 130, 170, 30);
    Font font3 = new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18);
    pwLabel.setFont(font3);
    pwLabel.setForeground(Color.BLACK);
    panel.add(pwLabel);

    JPasswordField passField = new JPasswordField();
    passField.setBounds(30, 170, 190, 30);
    passField.setFont(myFont());
    passField.setEchoChar('•');
    panel.add(passField);

    //    ImageIcon myIcon2 = new ImageIcon(
    //      getClass().getResource("myIcons//BtnViewPs1.jpg")
    //    );
    //    ImageIcon myIcon3 = new ImageIcon(
    //      getClass().getResource("myIcons//BtnUnViewPs1.jpg")
    //    );

    //JButton myBtn1 = new JButton(myIcon2);

    JButton myBtn1 = createImageButton("myIcons//BtnViewPs1.jpg");

    JButton myBtn2 = createImageButton("myIcons//BtnUnViewPs1.jpg");

    myBtn1.setBounds(215, 170, 30, 30);
    myBtn2.setBounds(215, 170, 30, 30);

    myBtn1.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          myBtn1.setVisible(false);
          myBtn2.setVisible(true);
          passField.setEchoChar((char) 0); // Show the actual characters
        }
      }
    );
    myBtn2.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          myBtn2.setVisible(false);
          myBtn1.setVisible(true);
          passField.setEchoChar('•'); // Mask the characters
        }
      }
    );
    panel.add(myBtn1);
    panel.add(myBtn2);

    JButton loginBtn = new JButton("Login");
    loginBtn.setBounds(30, 220, 200, 30);
    Font font4 = new Font("Comics San MS", Font.BOLD, 18);
    loginBtn.setFont(font4);
    loginBtn.setForeground(Color.WHITE);
    loginBtn.setBackground(Color.GREEN);

    panel.add(loginBtn);
    fileSerive serive = new fileSerive();

    loginBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String userOremail = usertf.getText();
          String pass = String.valueOf(passField.getPassword());
          Boolean myCheckerLog = serive.AdminChekerLog(
            fileSerive.filename,
            userOremail,
            pass
          );
          System.out.println(myCheckerLog);

          if (myCheckerLog == true) {
            JOptionPane.showMessageDialog(null, "Login successfully!");
            dispose();
            setVisible(false);
            // MainMenu myMainMenu = new MainMenu();

            //  myMainMenu.VisualizeMainMenu();
            main pm = new main();
            pm.setVisible(true);
          } else {
            JOptionPane.showMessageDialog(
              null,
              "Invalid your login!",
              "Notifacation",
              JOptionPane.ERROR_MESSAGE
            );

            passField.setText("");
          }
        }
      }
    );
    JLabel SignUPtf = new JLabel("Not a member?");
    SignUPtf.setBounds(30, 265, 120, 30);
    Font font5 = new Font("Comics San MS", Font.ITALIC, 17);
    SignUPtf.setFont(font5);
    panel.add(SignUPtf);

    JButton SignUpBtn = new JButton("Signup Now");
    SignUpBtn.setBounds(120, 265, 150, 30);
    Font font6 = new Font("Comics San MS", Font.ROMAN_BASELINE, 14);
    SignUpBtn.setFont(font6);
    Color color = new Color(0, 204, 204);
    SignUpBtn.setForeground(color);

    SignUpBtn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          dispose();
          signup sp = new signup();
          sp.ShowSignUp();
        }
      }
    );

    SignUpBtn.setBorderPainted(false);
    SignUpBtn.setContentAreaFilled(false);
    panel.add(SignUpBtn);

    //getContentPane().add(panelLogo);
    getContentPane().add(panel);
    setSize(580, 420);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setResizable(false);
  }

  public void ShowLoginUI() {
    //JFrame frame = new JFrame();
    setVisible(true);
  }

  private JButton createImageButton(String imagePath) {
    ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(imagePath));
    JButton button = new JButton(icon);

    button.setBorderPainted(false);
    button.setContentAreaFilled(false);
    button.setBackground(Color.WHITE);

    button.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // TODO Auto-generated method stub
          //System.out.println("Good night ^_^ ");

        }
      }
    );
    return button;
  }

  public static void main(String[] args) {
    new login();
  }
}
