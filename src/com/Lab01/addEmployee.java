package com.Lab01;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addEmployee extends JPanel {

  private static final long serialVersionUID = 1L;

  /*
   * All attributes
   * - Employee id
   * - Employee name
   * - Gender(button group)
   * - DoB (date of birth) (JCalender)
   * - Email(the same for sign up style)
   * - Position (with JCombobox box)
   * - Address
   * - Phone
   * - Salary
   * - Work Hour(with JCombobox box)
   */

  public Font myFont() {
    return new Font("Time New Romans", Font.ROMAN_BASELINE, 18);
  }

  public addEmployee() {
    setSize(1050, 600);
    setBounds(210, 0, 1050, 600);
    setVisible(true);
    setLayout(null);

    JPanel myPanel = new JPanel();
    myPanel.setSize(300, 420);
    myPanel.setBounds(0, 140, 300, 420);
    myPanel.setLayout(null);

    myPanel.setBackground(Color.white);

    JLabel empID = new JLabel("ID");
    empID.setBounds(20, 20, 100, 30);
    empID.setFont(myFont());
    myPanel.add(empID);

    JTextField idTextField = new JTextField();
    idTextField.setBounds(120, 20, 160, 30);
    myPanel.add(idTextField);

    JLabel empName = new JLabel("Name");
    empName.setBounds(20, 95, 100, 30);
    empName.setFont(myFont());
    myPanel.add(empName);

    JTextField nameTextField = new JTextField();
    nameTextField.setBounds(120, 95, 160, 30);
    myPanel.add(nameTextField);

    JLabel empGender = new JLabel("Gender");
    empGender.setBounds(20, 170, 100, 30);
    empGender.setFont(myFont());
    myPanel.add(empGender);

    String[] genderOptions = { "Male", "Female", "Other" };
    JComboBox<String> genderComboBox = new JComboBox<>(genderOptions);
    genderComboBox.setBounds(120, 170, 160, 30);
    myPanel.add(genderComboBox); // Add your gender components here

    JLabel empDob = new JLabel("DOB");
    empDob.setBounds(20, 245, 100, 30);
    empDob.setFont(myFont());
    myPanel.add(empDob);

    JTextField dobTextField = new JTextField();
    dobTextField.setBounds(120, 245, 160, 30);
    myPanel.add(dobTextField);
    // Add your date of birth components here

    JLabel empEmail = new JLabel("Email");
    empEmail.setBounds(20, 320, 100, 30);
    empEmail.setFont(myFont());
    myPanel.add(empEmail);

    JTextField emailTextField = new JTextField();
    emailTextField.setBounds(120, 320, 160, 30);
    myPanel.add(emailTextField);

    JPanel myPanel2 = new JPanel();
    myPanel2.setSize(300, 420);
    myPanel2.setBounds(700, 140, 300, 420);
    myPanel2.setLayout(null);

    myPanel2.setBackground(Color.white);

    JLabel empPosition = new JLabel("Position");
    empPosition.setBounds(20, 20, 100, 30);
    empPosition.setFont(myFont());
    myPanel2.add(empPosition);
    JTextField positionTextField = new JTextField();
    positionTextField.setBounds(120, 20, 155, 30);
    myPanel2.add(positionTextField);
    // Add your position components here

    JLabel empAddress = new JLabel("Address");
    empAddress.setBounds(20, 95, 100, 30);
    empAddress.setFont(myFont());
    myPanel2.add(empAddress);

    JTextField addressTextField = new JTextField();
    addressTextField.setBounds(120, 95, 155, 30);
    myPanel2.add(addressTextField);

    JLabel empPhone = new JLabel("Phone");
    empPhone.setBounds(20, 170, 100, 30);
    empPhone.setFont(myFont());
    myPanel2.add(empPhone);

    JTextField phoneTextField = new JTextField();
    phoneTextField.setBounds(120, 170, 155, 30);
    myPanel2.add(phoneTextField);

    JLabel empSalary = new JLabel("Salary");
    empSalary.setBounds(20, 245, 100, 30);
    empSalary.setFont(myFont());
    myPanel2.add(empSalary);

    JTextField salaryTextField = new JTextField();
    salaryTextField.setBounds(120, 245, 155, 30);
    myPanel2.add(salaryTextField);

    JLabel empWorkhour = new JLabel("Work hour");
    empWorkhour.setBounds(20, 320, 100, 30);
    empWorkhour.setFont(myFont());
    myPanel2.add(empWorkhour);
    JTextField workHourTextField = new JTextField();
    workHourTextField.setBounds(120, 320, 155, 30);
    myPanel2.add(workHourTextField);

    // Add your workhour components here

    JPanel myPanel3 = new JPanel();
    myPanel3.setSize(300, 100);
    myPanel3.setBounds(330, 480, 340, 100);
    myPanel3.setLayout(null);

    myPanel3.setBackground(Color.white);

    JButton addButton = new JButton("Add New");
    addButton.setBounds(80, 10, 100, 30);
    addButton.addActionListener(e -> addEmployee());
    myPanel3.add(addButton);
    addButton.setBackground(Color.green);

    JButton backButton = new JButton("Back");
    backButton.setBounds(200, 10, 100, 30);
    backButton.addActionListener(e -> goBack());
    myPanel3.add(backButton);
    backButton.setBackground(Color.orange);
    add(myPanel3);

    JLabel myHeader = new JLabel("EMPLOYEE INFORMATION");
    myHeader.setBounds(340, 40, 400, 40);
    myHeader.setFont(new Font("Time New Romans", Font.BOLD, 25));
    myHeader.setForeground(Color.cyan);

    ImageIcon myIconAdd4 = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//add_Capture1.jpg")
    );
    Image image4 = myIconAdd4
      .getImage()
      .getScaledInstance(430, 380, Image.SCALE_SMOOTH);
    ImageIcon igi4 = new ImageIcon(image4);
    JLabel imageLb4 = new JLabel(igi4);
    imageLb4.setBounds(270, 100, 430, 380);

    add(myPanel2);
    add(myPanel);
    add(myPanel3);
    add(myHeader);
    add(imageLb4);

    setBackground(Color.WHITE);
  }

  private Object goBack() {
    // TODO Auto-generated method stub
    return null;
  }

  private Object addEmployee() {
    // TODO Auto-generated method stub
    return null;
  }

  public void VisulizeAddEmp() {
    setVisible(true);
  }

  public static void main(String[] args) {
    new addEmployee();
  }
}
