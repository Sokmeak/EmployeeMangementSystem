package com.System_Operations;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VisulizeDataEmployee2 extends JPanel {

  public static JPanel subPanel = new JPanel();
  public static JPanel subPanel2 = new JPanel();
  public JPanel panelSpaceForSearch = new JPanel();
  public JLabel labelForSearchEmp = new JLabel();
  // public JTextField textFieldSearchEmp = new JTextField();
  // public JScrollPane myScrollPane = new JScrollPane(panelSpaceForSearch);

  public JButton BtnSearch = new JButton("Search");
  public JButton BtnUpdate = new JButton("Update");
  public JButton BtnDelete = new JButton("Delete");
  public JButton BtnCopy = new JButton("Copy");
  public JTextField searchTf = new JTextField();
  public static int rowSelected = 1;
  public static int TotalEmp = 0;
  public static int femaleCount = 0;
  public static int maleCount = 0;
  public static int f_time = 0;

  public static ArrayList<Integer> allPosts = fileService2.countPositionEmployee2(
    fileService2.fileEmployee
  );

  private Color myColor() {
    return new Color(109, 195, 205);
  }

  public static Font myFont2() {
    return new Font("Comic Sans MS", Font.ROMAN_BASELINE, 19);
  }

  public static Font myFont3() {
    return new Font("Comic Sans MS", Font.ROMAN_BASELINE, 11);
  }

  public static Color myBack() {
    return new Color(224, 224, 224);
  }

  public static JPanel currentTable(JTable t) {
    //add function here
    AddMouseClickInTable(t);
    //getValueFormTable(t);

    JPanel ps = new JPanel();
    ps.setLayout(null);
    ps.setBounds(10, 100, 980, 240);
    //    JTable myTable = t;

    JScrollPane js = new JScrollPane(t);

    js.setBounds(0, 0, 980, 240);
    ps.add(js);
    return ps;
  }

  public VisulizeDataEmployee2() {
    setSize(1040, 555);
    setBounds(224, 88, 1040, 555);
    setLayout(null);
    setBorder(BorderFactory.createMatteBorder(3, 2, 2, 2, myColor()));

    subPanel2.setSize(500, 50);
    subPanel2.setBounds(300, 380, 500, 50);
    subPanel2.setBackground(myBack());
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 15, 10);
    subPanel2.setLayout(flow);

    add(subPanel2);
    JLabel labSearch = new JLabel("ID_Search");
    labSearch.setBounds(60, 380, 120, 50);
    labSearch.setFont(myFont2());
    labSearch.setForeground(Color.BLACK);
    add(labSearch);

    searchTf.setBounds(180, 395, 120, 30);
    searchTf.setFont(myFont2());
    add(searchTf);

    JLabel lbtext = new JLabel();
    lbtext.setText("Table for Employees Information");
    lbtext.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
    lbtext.setForeground(Color.GRAY);
    lbtext.setBounds(40, 20, 1000, 50);
    lbtext.setHorizontalAlignment(SwingConstants.CENTER);

    JTable myTable = SimpleTable.tableBuilder();
    JScrollPane js = new JScrollPane(myTable);
    js.setBounds(10, 100, 980, 240);
    add(js);
    AddMouseClickInTable(myTable);
    BtnSearch.setForeground(Color.WHITE);
    BtnSearch.setFont(myFont2());
    BtnSearch.setBackground(Color.BLUE);
    BtnSearch.addActionListener(new MyclickListener());
    subPanel2.add(BtnSearch);

    BtnUpdate.setForeground(Color.WHITE);
    BtnUpdate.setFont(myFont2());
    BtnUpdate.setBackground(Color.GREEN);
    BtnUpdate.addActionListener(new MyclickListener());
    subPanel2.add(BtnUpdate);

    BtnDelete.setForeground(Color.WHITE);
    BtnDelete.setFont(myFont2());
    BtnDelete.setBackground(Color.RED);
    BtnDelete.addActionListener(new MyclickListener());
    subPanel2.add(BtnDelete);

    BtnCopy.setForeground(Color.WHITE);
    BtnCopy.setFont(myFont2());
    BtnCopy.setBackground(Color.GRAY);
    BtnCopy.addActionListener(new MyclickListener());
    subPanel2.add(BtnCopy);

    labelForSearchEmp.setBounds(10, 470, 1030, 40);
    labelForSearchEmp.setFont(myFont3());

    panelSpaceForSearch.add(labelForSearchEmp);
    // panelSpaceForSearch.add(textFieldSearchEmp);
    panelSpaceForSearch.setBounds(2, 470, 1030, 40);
    panelSpaceForSearch.setBackground(myBack());
    add(panelSpaceForSearch);

    add(lbtext);
    add(subPanel);

    setBackground(myBack());
  }

  static tableAsis model;

  private static void AddMouseClickInTable(JTable table) {
    table.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          model = (tableAsis) table.getModel();
          rowSelected = table.getSelectedRow();
          System.out.println(rowSelected);
          Object id = model.getValueAt(rowSelected, 0);
          Object name = model.getValueAt(rowSelected, 1);
          Object gender = model.getValueAt(rowSelected, 2);
          Object DOB = model.getValueAt(rowSelected, 3);
          Object email = model.getValueAt(rowSelected, 4);
          Object pos = model.getValueAt(rowSelected, 5);
          Object address = model.getValueAt(rowSelected, 6);
          Object phone = model.getValueAt(rowSelected, 7);
          Object salary = model.getValueAt(rowSelected, 8);
          Object workHour = model.getValueAt(rowSelected, 9);
          main.empGot.setId(id.toString());
          main.empGot.setName(name.toString());
          main.empGot.setGender(gender.toString());
          main.empGot.setDob(DOB.toString());
          main.empGot.setEmail(email.toString());
          main.empGot.setPosition(pos.toString());
          main.empGot.setAddress(address.toString());
          main.empGot.setPhone(phone.toString());
          main.empGot.setSalary(salary.toString());
          main.empGot.setWorkHour(workHour.toString());
        }
      }
    );
  }

  int t = 0;

  newPanelUpdate panelForUpdate = new newPanelUpdate();

  // set value by get data form mouse clcik and update it.
  public void updateVisual2Panel2() {
    // Find and remove the existing table component (assuming it's the only one)
    Component[] components = getComponents();
    for (Component component : components) {
      if (component instanceof JScrollPane) {
        remove(component);

        add(panelForUpdate);
        panelForUpdate.setVisible(true);
        break; // Assuming there is only one table component, break after removal
      }
    }

    revalidate();
    repaint();
  }

  public void updateVisual2Panel() {
    // Find and remove the existing table component (assuming it's the only one)
    Component[] components = getComponents();
    for (Component component : components) {
      if (component instanceof JScrollPane) {
        remove(component);
        break; // Assuming there is only one table component, break after removal
      }
    }
    panelForUpdate.setVisible(false);

    JTable myTable = SimpleTable.tableBuilder();
    JScrollPane js = new JScrollPane(myTable);
    AddMouseClickInTable(myTable);
    js.setBounds(10, 100, 980, 240);

    /// redo for add add mouse click
    add(js);
    // Repaint the visual2 panel
    revalidate();
    repaint();
  }

  //
  public void ForUpdate() {
    String newId = panelForUpdate.idTextField.getText();
    String newName = panelForUpdate.nameTextField.getText();

    String newGender = panelForUpdate.rdnMale.isSelected()
      ? "Male"
      : panelForUpdate.rdnFemale.isSelected() ? "Female" : " ";

    Calendar selectedDate = panelForUpdate.dateChooser.getCalendar();
    SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
    String formattedDate = null;

    try {
      formattedDate = sdf.format(selectedDate.getTime());
    } catch (Exception e) {
      // TODO: handle exception
    }
    String newDate = formattedDate;

    String newEmail = panelForUpdate.emailTextField.getText();
    String newPosition = panelForUpdate.cbxPos.getSelectedItem().toString();
    String newAddress = panelForUpdate.addressTextField.getText();
    String newPhone = panelForUpdate.phoneTextField.getText();
    String newSalary = panelForUpdate.cbxSalary.getSelectedItem().toString();
    String newWorkHour = panelForUpdate.cbxTime.getSelectedItem().toString();
    System.out.println("New id = " + newId);

    // use all data for update new information of employee
    Employee infoUpdateEmp = new Employee(
      newId,
      newName,
      newGender,
      newDate,
      newEmail,
      newPosition,
      newAddress,
      newPhone,
      newSalary,
      newWorkHour
    );
    fileService2.updateEmployee(
      main.empGot.getId(),
      infoUpdateEmp,
      fileService2.fileEmployee
    );

    ArrayList<Employee> NewArr = fileService2.readEmpFromFile(
      fileService2.fileEmployee
    );
    for (Employee emps : NewArr) {
      System.out.println(emps.toString());
    }
  }

  public void clearForm() {
    panelForUpdate.idTextField.setText("");
    panelForUpdate.nameTextField.setText("");
    panelForUpdate.btnGroup1.clearSelection();
    panelForUpdate.dateChooser.setDate(null);
    panelForUpdate.emailTextField.setText("");
    panelForUpdate.cbxPos.setSelectedIndex(0);
    panelForUpdate.addressTextField.setText("");
    panelForUpdate.phoneTextField.setText("");
    panelForUpdate.cbxSalary.setSelectedIndex(0);
    panelForUpdate.cbxTime.setSelectedIndex(0);
  }

  public void setValueInform() {
    panelForUpdate.idTextField.setText(main.empGot.getId());
    panelForUpdate.nameTextField.setText(main.empGot.getName());
    if (main.empGot.getGender().equals("Male")) {
      panelForUpdate.rdnMale.setSelected(true);
    } else {
      panelForUpdate.rdnFemale.setSelected(true);
    }

    String dobString = main.empGot.getDob();

    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
    // More implement about data format!!
    Date dobDate = null;
    try {
      dobDate = dateFormat.parse(dobString);
    } catch (ParseException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    panelForUpdate.dateChooser.setDate(dobDate);

    panelForUpdate.dateChooser.setDateFormatString(main.empGot.getDob());
    System.out.println(dobString);

    panelForUpdate.emailTextField.setText(main.empGot.getEmail());
    panelForUpdate.cbxPos.setSelectedItem(
      (String) (main.empGot.getPosition())
    );
    panelForUpdate.addressTextField.setText(main.empGot.getAddress());
    panelForUpdate.phoneTextField.setText(main.empGot.getPhone());
    panelForUpdate.cbxSalary.setSelectedItem(
      (String) main.empGot.getSalary()
    );
    String workHour = main.empGot.getWorkHour();
    System.out.println(workHour);

    panelForUpdate.cbxTime.setSelectedItem(workHour);
  }

  public static int isClick = 0;
  Boolean IsGet = false;

  private class MyclickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == BtnSearch) {
        t++;
        if (t == 2) {
          panelSpaceForSearch.setVisible(false);
          t = 0;
          return;
        }
        String getID = searchTf.getText();
        Employee emp = fileService2.mySearchEmployee(
          fileService2.fileEmployee,
          getID
        );
        labelForSearchEmp.setText(emp.toString());
        searchTf.setText("");
        panelSpaceForSearch.setBackground(Color.PINK);
        panelSpaceForSearch.setVisible(true);
      } else if (e.getSource() == BtnUpdate) {
        //  double click to get data and update
        isClick++;
        System.out.println("is click = " + isClick);
        if (main.empGot != null && isClick == 1) {
          // clear form is recommended.
          panelForUpdate.setVisible(true);
          setValueInform();
        }
        // try to close table>>>>
        updateVisual2Panel2();

        if (isClick == 2) {
          String newId = panelForUpdate.idTextField.getText();
          String newName = panelForUpdate.nameTextField.getText();
          String newGender = panelForUpdate.rdnMale.isSelected()
            ? "Male"
            : panelForUpdate.rdnFemale.isSelected() ? "Female" : " ";
          Calendar selectedDate = panelForUpdate.dateChooser.getCalendar();
          SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
          String formattedDate = null;

          try {
            formattedDate = sdf.format(selectedDate.getTime());
          } catch (Exception ep) {
            // TODO: handle exception
          }
          String newDate = formattedDate;

          String newEmail = panelForUpdate.emailTextField.getText();
          String newPosition = panelForUpdate.cbxPos
            .getSelectedItem()
            .toString();
          String newAddress = panelForUpdate.addressTextField.getText();
          String newPhone = panelForUpdate.phoneTextField.getText();
          String newSalary = panelForUpdate.cbxSalary
            .getSelectedItem()
            .toString();
          String newWorkHour = panelForUpdate.cbxTime
            .getSelectedItem()
            .toString();
          System.out.println("New id = " + newId);

          // use all data for update new information of employee
          Employee infoUpdateEmp = new Employee(
            newId,
            newName,
            newGender,
            newDate,
            newEmail,
            newPosition,
            newAddress,
            newPhone,
            newSalary,
            newWorkHour
          );

          fileService2.updateEmployee(
            main.empGot.getId(),
            infoUpdateEmp,
            fileService2.fileEmployee
          );
        }
        // double click for update !!!
        if (isClick % 3 == 0) {
          updateVisual2Panel();
          clearForm();
          isClick = 0;
          //
        }
      } else if (e.getSource() == BtnDelete) {
        String idForDelete = main.empGot.getId();
        if (idForDelete == null) {
          System.out.println("Fail to delete!");
        } else {
          fileService2.deleteEmployee(idForDelete, fileService2.fileEmployee);
          System.out.println("Delete successfully!!!");
          updateVisual2Panel();
        }
      } else if (e.getSource() == BtnCopy) {
        String EmpInfo =
          " + Employee Information +" +
          "\n" +
          "ID        : " +
          main.empGot.getId() +
          "\n" +
          "Name      : " +
          main.empGot.getName() +
          "\n" +
          "Gender    : " +
          main.empGot.getGender() +
          "\n" +
          "DOB       : " +
          main.empGot.getDob() +
          "\n" +
          "Email     : " +
          main.empGot.getEmail() +
          "\n" +
          "Position  : " +
          main.empGot.getPosition() +
          "\n" +
          "Address   : " +
          main.empGot.getAddress() +
          "\n" +
          "Phone     : " +
          main.empGot.getPhone() +
          "\n" +
          "Salary    : " +
          main.empGot.getSalary() +
          "\n" +
          "Work Hour : " +
          main.empGot.getWorkHour();
        StringSelection stringSelection = new StringSelection(EmpInfo);
        // Get the system clipboard
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // Set the contents of the clipboard to the StringSelection
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(
          null,
          "Information of this employee has copied!"
        );
      }
    }
  }

  public void SetVisualize() {
    setVisible(true);
  }

  public void SetInVisualize() {
    setVisible(false);
  }
}
