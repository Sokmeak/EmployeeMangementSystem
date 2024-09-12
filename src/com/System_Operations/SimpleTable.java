package com.System_Operations;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class tableAsis extends AbstractTableModel {

  ArrayList<Employee> employees;
  public String[] columnNames = {
    "ID",
    "Name",
    "Gender",
    "DOB",
    "Email",
    "Position",
    "Address",
    "Phone",
    "Salary",
    "Work Hour",
  };

  tableAsis() {
    this.employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
    fireTableRowsInserted(employees.size() - 1, employees.size() - 1);
  }

  @Override
  public int getRowCount() {
    return employees.size();
  }

  @Override
  public int getColumnCount() {
    return columnNames.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    Employee employee = employees.get(rowIndex);

    switch (columnIndex) {
      case 0:
        return employee.getId();
      case 1:
        return employee.getName();
      case 2:
        return employee.getGender();
      case 3:
        return employee.getDob();
      case 4:
        return employee.getEmail();
      case 5:
        return employee.getPosition();
      case 6:
        return employee.getAddress();
      case 7:
        return employee.getPhone();
      case 8:
        return employee.getSalary();
      case 9:
        return employee.getWorkHour();
      default:
        return null;
    }
  }

  @Override
  public String getColumnName(int column) {
    return columnNames[column];
  }
}

public class SimpleTable {

  SimpleTable() {
    // defaul constructor
  }

  public static Font myFont() {
    return new Font("Comic Sans MS", Font.ROMAN_BASELINE, 16);
  }

  public static JTable tableBuilder() {
    tableAsis ta = new tableAsis();
    JTable table = new JTable(ta);
    ArrayList<Employee> myCurrentEmp = fileService2.readEmpFromFile(
      fileService2.fileEmployee
    );
    for (Employee em : myCurrentEmp) {
      ta.addEmployee(em);
    }
    JScrollPane js = new JScrollPane(table);
    js.setBounds(0, 0, 990, 240);
    return table;
  }
}
