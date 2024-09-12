package com.System_Operations;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class newPanelUpdate extends JPanel {

	private JPanel subPanel1 = new JPanel();
	private JPanel subPanel2 = new JPanel();
	// access these data outside class
	public static String Newid;
	public String Newname;
	public String Newgender;
	public String NewDob;
	public String NewEmail;
	public String NewPos;
	public String NewAddress;
	public String NewPhone;
	public String NewSalary;
	public String Newhour;

	private JLabel empID = new JLabel("New ID");
	private JLabel empName = new JLabel("New Name");
	private JLabel empGender = new JLabel("New Gender");
	public JRadioButton rdnMale = new JRadioButton("Male");
	public JRadioButton rdnFemale = new JRadioButton("Female");
	public ButtonGroup btnGroup1 = new ButtonGroup();
	private JLabel empDob = new JLabel("New DOB");
	private JLabel empEmail = new JLabel("New Email");
	public JDateChooser dateChooser = new JDateChooser();
	private JLabel empAddress = new JLabel("New Address");
	private JLabel empSalary = new JLabel("New Salary");
	private JLabel empPosition = new JLabel("New Position");

	private JLabel empPhone = new JLabel("New Phone");
	private JLabel empWorkhour = new JLabel("New Work hour");
	// text fields

	public JTextField idTextField = new JTextField();
	public JTextField nameTextField = new JTextField();
	public JTextField emailTextField = new JTextField();
	public JComboBox<String> cbxPos;
	public JComboBox<String> cbxTime;
	public JTextField addressTextField = new JTextField();
	public JTextField phoneTextField = new JTextField();
	public JComboBox<String> cbxSalary;

	// 10 attributes >>>
	private Font fontInTf() {
		return new Font("Comic Sans MS", Font.ROMAN_BASELINE, 15);
	}
	

	public newPanelUpdate() {
		/// add more compent such as label and textfile
		subPanel1.setLayout(null);
		subPanel2.setLayout(null);

		empID.setBounds(50, 10, 100, 25);
		empID.setFont(fontInTf());

		idTextField.setBounds(160, 10, 200, 25);
		idTextField.setFont(fontInTf());

		empName.setBounds(50, 55, 100, 25);
		empName.setFont(fontInTf());

		nameTextField.setBounds(160, 55, 200, 25);
		nameTextField.setFont(fontInTf());

		empGender.setBounds(50, 100, 100, 25);
		empGender.setFont(fontInTf());

		rdnFemale.setBounds(160, 100, 100, 25);
		rdnFemale.setFont(fontInTf());
		rdnMale.setBounds(270, 100, 100, 25);
		rdnMale.setFont(fontInTf());

		btnGroup1.add(rdnFemale);
		btnGroup1.add(rdnMale);

		empDob.setBounds(50, 145, 100, 25);
		empDob.setFont(fontInTf());

		dateChooser.setBounds(160, 145, 200, 25);
		dateChooser.setFont(fontInTf());

		empEmail.setBounds(50, 190, 100, 25);
		empEmail.setFont(fontInTf());

		emailTextField.setBounds(160, 190, 200, 25);
		emailTextField.setFont(fontInTf());
		subPanel1.add(dateChooser);
		subPanel1.add(idTextField);
		subPanel1.add(nameTextField);
		subPanel1.add(emailTextField);
		subPanel1.add(empEmail);
		subPanel1.add(empDob);
		subPanel1.add(rdnFemale);
		subPanel1.add(rdnMale);
		subPanel1.add(empGender);
		subPanel1.add(empName);
		subPanel1.add(empID);
		subPanel1.setSize(490, 280);
		subPanel1.setBounds(0, 0, 490, 280);

		/// let's go to the second panel

		empPosition.setBounds(50, 10, 150, 25);
		empPosition.setFont(fontInTf());

		String positions[] = new String[] { "", "Software Engineer", "APP Developer", "WEB Developer", "Java Developer",
				"Data Scientist", "Network", };

		cbxPos = new JComboBox<String>(positions);
		cbxPos.setFont(fontInTf());
		cbxPos.setBounds(210, 10, 155, 25);
		cbxPos.setFont(fontInTf());
		subPanel2.add(cbxPos);

		empAddress.setBounds(50, 55, 150, 25);
		empAddress.setFont(fontInTf());

		addressTextField.setBounds(210, 55, 155, 25);
		addressTextField.setFont(fontInTf());

		empPhone.setBounds(50, 100, 150, 25);
		empPhone.setFont(fontInTf());

		phoneTextField.setBounds(210, 100, 155, 25);
		phoneTextField.setFont(fontInTf());

		empSalary.setBounds(50, 145, 150, 25);
		empSalary.setFont(fontInTf());

		String salaries[] = new String[] { " ", "300", "400", "500", "600", "700", "800", "900", "1000", };
		cbxSalary = new JComboBox<String>(salaries);
		cbxSalary.setBounds(210, 145, 155, 25);
		cbxSalary.setFont(fontInTf());
		subPanel2.add(cbxSalary);

		empWorkhour.setBounds(50, 190, 150, 25);
		empWorkhour.setFont(fontInTf());

		String timeHours[] = new String[] { " ", "Part time", "Full time" };

		cbxTime = new JComboBox<String>(timeHours);
		cbxTime.setFont(fontInTf());
		cbxTime.setBounds(210, 190, 150, 25);

		subPanel2.add(cbxTime);

		// we need to set value into form first

		/// get data here
		// check if any field is null ?

//
		// we more condition
//		
//					if(VisulizeDataEmployee2.isClick %2 == 0) {
//						
//					
//						Newid = idTextField.getText();
//						Newname = nameTextField.getText();
//						Newgender = rdnMale.isSelected() ? "Male" : rdnFemale.isSelected() ? "Female" : " ";
//						// change date format
//						Calendar selectedDate = dateChooser.getCalendar();
//						SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
//						String formattedDate = null;
//
//						try {
//							formattedDate = sdf.format(selectedDate.getTime());
//
//						} catch (Exception e) {
//							// TODO: handle exception
//						}

//						NewDob = formattedDate;
//
//						NewEmail = emailTextField.getText();
//						NewPos = cbxPos.getSelectedItem().toString();
//						NewAddress = addressTextField.getText();
//						NewPhone = phoneTextField.getText();
//						NewSalary = cbxSalary.getSelectedItem().toString();
//						Newhour = cbxTime.getSelectedItem().toString();
//			
//		
//		System.out.println(Newid);
//			
		
		

		subPanel2.setSize(490, 280);
		subPanel2.setBounds(490, 0, 490, 280);

		subPanel2.add(empPosition);
		subPanel2.add(empPhone);
		subPanel2.add(empAddress);
		subPanel2.add(empWorkhour);
		subPanel2.add(empSalary);
		subPanel2.add(addressTextField);
		subPanel2.add(phoneTextField);

		subPanel1.setBackground(Color.yellow);
		subPanel2.setBackground(Color.green);

		add(subPanel1);
		add(subPanel2);

		setBounds(10, 100, 980, 280);
		// setBounds(0, 0, 980, 350);
		setLayout(null);
		// setBackground(Color.PINK);
	}

	public static void main(String[] args) {
		new newPanelUpdate();
		// JFrame f = new JFrame();
		// f.setLayout(null);
		// newPanelUpdate newPanel = new newPanelUpdate();
		// f.add(newPanel);
		// f.setSize(990, 350);

		// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// f.setVisible(true);
	}
}
