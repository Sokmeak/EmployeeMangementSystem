package com.System_Operations;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class addEmployee extends JPanel {

  private static final long serialVersionUID = 1L;

  private JPanel myPanel = new JPanel();
  private JPanel myPanel2 = new JPanel();
  private JLabel empID = new JLabel("ID");
  private JLabel empName = new JLabel("Name");
  private JLabel empGender = new JLabel("Gender");
  private JRadioButton rdnMale = new JRadioButton("Male");
  private JRadioButton rdnFemale = new JRadioButton("Female");
  private ButtonGroup btnGroup = new ButtonGroup();
  private JLabel empDob = new JLabel("DOB");
  private JLabel empEmail = new JLabel("Email");
  private JDateChooser dateChooser = new JDateChooser();
  private JLabel empAddress = new JLabel("Address");
  private JLabel empSalary = new JLabel("Salary");
  private JLabel empPosition = new JLabel("Position");

  private JLabel empPhone = new JLabel("Phone");
  private JLabel empWorkhour = new JLabel("Work hour");
  // text fields

  private JTextField idTextField = new JTextField();
  private JTextField nameTextField = new JTextField();
  private JTextField emailTextField = new JTextField();
  private JComboBox<String> cbxPos;
  private JComboBox<String> cbxTime;
  private JTextField addressTextField = new JTextField();
  private JTextField phoneTextField = new JTextField();
  private JComboBox<String> cbxSalary;

  public static ArrayList<Employee> realTimeEmps;
  // btns
  private JButton addButton = new JButton();
  private JButton clearButton = new JButton();

  private Font myFont(int size) {
    return new Font("Time New Romans", Font.ROMAN_BASELINE, size);
  }

  private Font fontInTf() {
    return new Font("Comic Sans MS", Font.ROMAN_BASELINE, 19);
  }

  private Color myColor() {
    return new Color(109, 195, 205);
  }

  public addEmployee() {
    setSize(1040, 555);
    setBounds(224, 88, 1040, 555);
    setVisible(true);
    setLayout(null);
    setBorder(BorderFactory.createMatteBorder(2, 2, 4, 2, myColor()));

    myPanel.setSize(300, 350);
    myPanel.setBounds(4, 140, 300, 350);
    myPanel.setLayout(null);

    myPanel.setBackground(Color.white);

    empID.setBounds(20, 20, 100, 30);
    empID.setFont(myFont(20));
    empID.setFont(fontInTf());
    myPanel.add(empID);

    idTextField.setBounds(120, 20, 160, 30);
    idTextField.setFont(fontInTf());
    myPanel.add(idTextField);

    empName.setBounds(20, 95, 100, 30);
    empName.setFont(fontInTf());
    myPanel.add(empName);

    nameTextField.setBounds(120, 95, 160, 30);
    nameTextField.setFont(fontInTf());
    myPanel.add(nameTextField);

    empGender.setBounds(20, 170, 100, 30);
    empGender.setFont(myFont(20));
    empGender.setFont(fontInTf());
    myPanel.add(empGender);

    rdnMale.setBounds(120, 170, 80, 30);
    rdnMale.setFont(fontInTf());

    rdnFemale.setBounds(200, 170, 100, 30);
    rdnFemale.setFont(fontInTf());

    btnGroup.add(rdnMale);
    btnGroup.add(rdnFemale);

    // myPanel.add(btnGroup);
    myPanel.add(rdnMale);
    myPanel.add(rdnFemale);

    empDob.setBounds(20, 245, 100, 30);
    empDob.setFont(fontInTf());
    myPanel.add(empDob);

    dateChooser.setBounds(120, 245, 160, 30);
    dateChooser.setFont(fontInTf());
    myPanel.add(dateChooser);

    empEmail.setBounds(20, 320, 100, 30);
    empEmail.setFont(fontInTf());
    myPanel.add(empEmail);

    emailTextField.setBounds(120, 320, 160, 30);
    emailTextField.setFont(fontInTf());
    myPanel.add(emailTextField);

    myPanel2.setSize(300, 350);
    myPanel2.setBounds(720, 140, 300, 350);
    myPanel2.setLayout(null);

    myPanel2.setBackground(Color.white);

    empPosition.setBounds(20, 20, 100, 30);
    empPosition.setFont(fontInTf());
    myPanel2.add(empPosition);

    // Position : APP developer, WEB Developer, Java Developer,
    // Data Scientist, Network

    String positions[] = new String[] {
      "",
      "Software Engineer",
      "APP Developer",
      "WEB Developer",
      "Java Developer",
      "Data Scientist",
      "Network",
    };

    cbxPos = new JComboBox<String>(positions);
    cbxPos.setFont(fontInTf());
    cbxPos.setBounds(120, 20, 155, 30);
    cbxPos.setFont(fontInTf());
    myPanel2.add(cbxPos);

    empAddress.setBounds(20, 95, 100, 30);
    empAddress.setFont(fontInTf());
    myPanel2.add(empAddress);

    addressTextField.setBounds(120, 95, 155, 30);
    addressTextField.setFont(fontInTf());
    myPanel2.add(addressTextField);

    empPhone.setBounds(20, 170, 100, 30);
    empPhone.setFont(fontInTf());
    myPanel2.add(empPhone);

    phoneTextField.setBounds(120, 170, 155, 30);
    phoneTextField.setFont(fontInTf());
    myPanel2.add(phoneTextField);

    empSalary.setBounds(20, 245, 100, 30);
    empSalary.setFont(fontInTf());

    myPanel2.add(empSalary);

    String salaries[] = new String[] {
      " ",
      "300",
      "400",
      "500",
      "600",
      "700",
      "800",
      "900",
      "1000",
    };
    cbxSalary = new JComboBox<String>(salaries);
    cbxSalary.setBounds(120, 245, 155, 30);
    cbxSalary.setFont(fontInTf());
    myPanel2.add(cbxSalary);

    empWorkhour.setBounds(20, 320, 100, 30);
    empWorkhour.setFont(fontInTf());
    myPanel2.add(empWorkhour);

    String timeHours[] = new String[] { " ", "Part time", "Full time" };

    cbxTime = new JComboBox<String>(timeHours);
    cbxTime.setFont(fontInTf());
    cbxTime.setBounds(120, 320, 140, 30);

    myPanel2.add(cbxTime);

    // Add your workhour components here

    JPanel myPanel3 = new JPanel();
    myPanel3.setSize(400, 100);
    myPanel3.setBounds(320, 480, 400, 100);
    myPanel3.setLayout(null);

    myPanel3.setBackground(Color.white);
    addButton =
      buttonCreator.createImageButton("newIcons/ProductBtn/addNewBtn.png");
    addButton.setBounds(0, 5, 183, 70);
    addButton.setContentAreaFilled(true);

    myPanel3.add(addButton);

    clearButton =
      buttonCreator.createImageButton("newIcons/ProductBtn/cleanBtn.png");
    clearButton.setContentAreaFilled(true);
    clearButton.setBounds(205, 5, 200, 70);

    addButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // get data from input and store them into file.cvs -> need file service2

          // check if any field is null ?
          String id = idTextField.getText();
          String name = nameTextField.getText();
          String gender = rdnMale.isSelected()
            ? "Male"
            : rdnFemale.isSelected() ? "Female" : " ";
          // change date format
          Calendar selectedDate = dateChooser.getCalendar();
          SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
          String formattedDate = sdf.format(selectedDate.getTime());

          String dob = formattedDate;
          String email = emailTextField.getText();
          String position = cbxPos.getSelectedItem().toString();
          String address = addressTextField.getText();
          String phone = phoneTextField.getText();
          String salary = cbxSalary.getSelectedItem().toString();
          String workHour = cbxTime.getSelectedItem().toString();

          
          fileService2 myService2 = new fileService2();
          Boolean resultCheckId = myService2.IsDuplicate(
            id,
            fileService2.fileEmployee
          );
          // check if any attributes are null
          boolean myBool =
            id.isEmpty() ||
            name.isEmpty() ||
            gender.isEmpty() ||
            selectedDate == null ||
            email.isEmpty() ||
            position.isEmpty() ||
            address.isEmpty() ||
            phone.isEmpty() ||
            salary.isEmpty() ||
            workHour.isEmpty();
          System.out.println(myBool);

          if (!email.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(
              null,
              "Invalid your email, miss \"@gmail.com\"",
              "Notifacation",
              JOptionPane.ERROR_MESSAGE
            );
            return;
          }

          if (resultCheckId == true) {
            JOptionPane.showMessageDialog(
              null,
              "Duplicate id of employee",
              "Notifacation",
              JOptionPane.ERROR_MESSAGE
            );
            idTextField.setText("");
            return;
          }
          // tableService empModel = new tableService()
          Employee empNew = new Employee(
            id,
            name,
            gender,
            dob,
            email,
            position,
            address,
            phone,
            salary,
            workHour
          );

          if (myBool) {
            JOptionPane.showMessageDialog(
              null,
              "All Attributes cannot be null!",
              "Notifacation",
              JOptionPane.ERROR_MESSAGE
            );

            return;
          } else {
            myService2.AppendEmployee(empNew, fileService2.fileEmployee); // append employee to file

            JOptionPane.showMessageDialog(null, "Add Successfully!");
          }
        }
      }
    );

    clearButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          idTextField.setText("");
          nameTextField.setText("");
          btnGroup.clearSelection();
          dateChooser.setDate(null);
          emailTextField.setText("");
          cbxPos.setSelectedIndex(0);
          addressTextField.setText("");
          phoneTextField.setText("");
          cbxSalary.setSelectedIndex(0);
          cbxTime.setSelectedIndex(0);
        }
      }
    );

    // perform the action
    // clearButton.addActionListener(e -> goBack());
    myPanel3.add(clearButton);

    add(myPanel3);

    JLabel myHeader = new JLabel("EMPLOYEE INFORMATION");
    myHeader.setBounds(370, 60, 400, 40);
    myHeader.setHorizontalAlignment(SwingConstants.CENTER);
    myHeader.setFont(new Font("Time New Romans", Font.BOLD, 30));
    myHeader.setForeground(myColor());

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

  public void VisulizeAddEmp() {
    setVisible(true);
  }

  public static void main(String[] args) {
    new addEmployee();
  }
}
