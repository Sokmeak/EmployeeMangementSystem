//package com.Lab;
//import javax.swing.*;
//import javax.swing.table.AbstractTableModel;
//import java.util.ArrayList;
//import java.util.List;
//
//class Employee2 {
//    private String id;
//    private String name;
//    private String age;
//    private String dob;
//    private String email;
//    private String position;
//    private String city;
//    private String phoneNumber;
//    private String salary;
//    private String employmentType;
//
//    // Constructor, getters, setters...
//
//    // Example constructor
//    public Employee2(String id, String name, String age, String dob, String email,
//                    String position, String city, String phoneNumber,
//                    String salary, String employmentType) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.dob = dob;
//        this.email = email;
//        this.position = position;
//        this.city = city;
//        this.phoneNumber = phoneNumber;
//        this.salary = salary;
//        this.employmentType = employmentType;
//    }
//
//	public String getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public String getDob() {
//		return dob;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public String getPosition() {
//		return position;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public String getSalary() {
//		return salary;
//	}
//
//	public String getEmploymentType() {
//		return employmentType;
//	}
//    
//}
//
//class EmployeeTableModel extends AbstractTableModel {
//    private List<Employee2> employees;
//    private String[] columnNames = {"ID", "Name", "Age", "DOB", "Email",
//                                    "Position", "City", "Phone", "Salary", "Employment Type"};
//
//    public EmployeeTableModel() {
//        this.employees = new ArrayList<>();
//    }
//
//    public void addEmployee(Employee2 employee) {
//        employees.add(employee);
//        fireTableRowsInserted(employees.size() - 1, employees.size() - 1);
//    }
//
//    @Override
//    public int getRowCount() {
//        return employees.size();
//    }
//
//    @Override
//    public int getColumnCount() {
//        return columnNames.length;
//    }
//
//    @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        Employee2 employee = employees.get(rowIndex);
//
//        switch (columnIndex) {
//            case 0: return employee.getId();
//            case 1: return employee.getName();
//            case 2: return employee.getAge();
//            case 3: return employee.getDob();
//            case 4: return employee.getEmail();
//            case 5: return employee.getPosition();
//            case 6: return employee.getCity();
//            case 7: return employee.getPhoneNumber();
//            case 8: return employee.getSalary();
//            case 9: return employee.getEmploymentType();
//            default: return null;
//        }
//    }
//
//    @Override
//    public String getColumnName(int column) {
//        return columnNames[column];
//    }
//}
//
//public class EmployeeTableExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Employee Table Example");
//        EmployeeTableModel model = new EmployeeTableModel();
//        JTable table = new JTable(model);
//
//        model.addEmployee(new Employee2("1111", "Sok Nika", "23", "10/02/2000", "nika123@gmail.com",
//                                       "WEB Dev", "Phnom Penh", "0123456789", "700", "Full Time"));
//
//        // Add more employees as needed...
//
//        JScrollPane scrollPane = new JScrollPane(table);
//        frame.add(scrollPane);
//
//        frame.setSize(800, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//}
