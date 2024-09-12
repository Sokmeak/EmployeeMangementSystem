package com.System_Operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Employee {

  private String id;
  private String name;
  private String gender;
  private String dob;
  private String email;
  private String position;
  private String address;
  private String phone;
  private String salary;
  private String workHour;

  // set value to all attributes by constructor
  public Employee(
    String id,
    String name,
    String gender,
    String dob,
    String email,
    String position,
    String address,
    String phone,
    String salary,
    String workHour
  ) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.dob = dob;
    this.email = email;
    this.position = position;
    this.address = address;
    this.phone = phone;
    this.salary = salary;
    this.workHour = workHour;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public void setWorkHour(String workHour) {
    this.workHour = workHour;
  }

  public Employee() {
    // TODO Auto-generated constructor stub
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public String getDob() {
    return dob;
  }

  public String getEmail() {
    return email;
  }

  public String getPosition() {
    return position;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getSalary() {
    return salary;
  }

  public String getWorkHour() {
    return workHour;
  }

  @Override
  public String toString() {
    return (
      "[id=" +
      id +
      ", name=" +
      name +
      ", gender=" +
      gender +
      ", dob=" +
      dob +
      ", email=" +
      email +
      ", position=" +
      position +
      ", address=" +
      address +
      ", phone=" +
      phone +
      ", salary=" +
      salary +
      ", workHour=" +
      workHour +
      "]"
    );
  }
}

public class fileService2 {

  public static String fileEmployee = "myEmployee1.csv";

  // default writer
  public void WriteDefualtData(Employee emp, String filename) {
    try {
      PrintWriter myWriter = new PrintWriter(filename);
      myWriter.print(
        emp.getId() +
        "," +
        emp.getName() +
        "," +
        emp.getGender() +
        "," +
        emp.getDob() +
        "," +
        emp.getEmail() +
        "," +
        emp.getPosition() +
        "," +
        emp.getAddress() +
        "," +
        emp.getPhone() +
        "," +
        emp.getSalary() +
        "," +
        emp.getWorkHour() +
        "\n"
      );
      myWriter.close();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  public void AppendEmployee(Employee emp, String file) {
    try {
      BufferedWriter writer2 = new BufferedWriter(new FileWriter(file, true));
      writer2.write(
        emp.getId() +
        "," +
        emp.getName() +
        "," +
        emp.getGender() +
        "," +
        emp.getDob() +
        "," +
        emp.getEmail() +
        "," +
        emp.getPosition() +
        "," +
        emp.getAddress() +
        "," +
        emp.getPhone() +
        "," +
        emp.getSalary() +
        "," +
        emp.getWorkHour() +
        "\n"
      );
      writer2.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static ArrayList<Employee> readEmpFromFile(String file) {
    ArrayList<Employee> ArrEmployee = new ArrayList<Employee>();
    try {
      Scanner scanner = new Scanner(new File(file));
      //String lineHead = scanner.nextLine();
      //System.out.println(lineHead);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        if (parts.length == 10) {
          String idEmp = parts[0];
          String nameEmp = parts[1];
          String genderEmp = parts[2];
          String dobEmp = parts[3];
          String emailEmp = parts[4];
          String positionEmp = parts[5];
          String addressEmp = parts[6];
          String phoneEmp = parts[7];
          String salaryEmp = parts[8];
          String workHourEmp = parts[9];

          Employee myEmployee = new Employee(
            idEmp,
            nameEmp,
            genderEmp,
            dobEmp,
            emailEmp,
            positionEmp,
            addressEmp,
            phoneEmp,
            salaryEmp,
            workHourEmp
          );

          ArrEmployee.add(myEmployee);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return ArrEmployee;
  }

  public static void deleteEmployee(String employeeId, String file) {
    int t = 0;
    try {
      File inputFile = new File(file);

      // Read the data from the original file
      List<String> lines = new ArrayList<>();
      try (
        BufferedReader reader = new BufferedReader(new FileReader(inputFile))
      ) {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
          // check to ensure that has no id of employee that we want to delete.
          if (!currentLine.contains(employeeId)) {
            lines.add(currentLine);
          } else {
            t = 1;
          }
        }
      }

      // Write the modified data back to the original file
      try (
        BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))
      ) {
        for (String line : lines) {
          writer.write(line + System.getProperty("line.separator"));
        }
      }

      if (t == 1) {
        JOptionPane.showMessageDialog(null, "Delete Successfully!");
      } else {
        JOptionPane.showMessageDialog(null, "Delete Unsuccessfully!");
      }

      System.out.println(
        "Employee with ID " + employeeId + " deleted successfully."
      );
    } catch (IOException e) {
      e.printStackTrace();
      System.err.println("Error occurred while deleting employee.");
    }
  }

  public static void updateEmployee(
    String employeeId,
    Employee newEmpinfo,
    String file
  ) {
    int t = 0;
    String newInfo =
      newEmpinfo.getId() +
      "," +
      newEmpinfo.getName() +
      "," +
      newEmpinfo.getGender() +
      "," +
      newEmpinfo.getDob() +
      "," +
      newEmpinfo.getEmail() +
      "," +
      newEmpinfo.getPosition() +
      "," +
      newEmpinfo.getAddress() +
      "," +
      newEmpinfo.getPhone() +
      "," +
      newEmpinfo.getSalary() +
      "," +
      newEmpinfo.getWorkHour();
    try {
      File inputFile = new File(file);

      // Read the data from the original file
      List<String> lines = new ArrayList<>();
      try (
        BufferedReader reader = new BufferedReader(new FileReader(inputFile))
      ) {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
          // check if the current line contains the employeeId
          if (currentLine.contains(employeeId)) {
            // update the line with newEmployeeData
            lines.add(newInfo);
            t = 1;
          } else {
            lines.add(currentLine);
          }
        }
      }

      // Write the modified data back to the original file
      try (
        BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))
      ) {
        for (String line : lines) {
          writer.write(line + System.getProperty("line.separator"));
          // writer.write(line+"\n");

        }
      }

      if (t == 1) {
        JOptionPane.showMessageDialog(null, "Update Successfully!");
      } else {
        JOptionPane.showMessageDialog(null, "Update Unsuccessfully!");
      }

      System.out.println(
        "Employee with ID " + employeeId + " updated successfully."
      );
    } catch (IOException e) {
      e.printStackTrace();
      System.err.println("Error occurred while updating employee.");
    }
  }

  public static Employee mySearchEmployee(String file, String idSearch) {
    int t = 0;
    Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getId().equals(idSearch)) {
          t = 1;
          empSearch = myEmp;
          JOptionPane.showMessageDialog(null, " Employee search found!");
          return empSearch;
        }
      }
      if (t == 0) {
        JOptionPane.showMessageDialog(
          null,
          "Employee search not found",
          "Notifacation",
          JOptionPane.ERROR_MESSAGE
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public static int countEmployee(String file) {
    int t = 0;
    // Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        t = t + 1;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return t;
  }

  public static int countFulltimeEmployee(String file) {
    int t = 0;
    // Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getWorkHour().equals("Full time")) {
          t = t + 1;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return t;
  }

  public static int countParttimeEmployee(String file) {
    int t = 0;
    // Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getWorkHour().equals("Part time")) {
          t = t + 1;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return t;
  }

  //  public static int countPositionEmployee(String file) {
  //    int t = 0;
  //    // Employee empSearch = new Employee();
  //    try {
  //      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
  //      for (Employee myEmp : EmployeesInPresent) {
  //        if (myEmp.getPosition().equals("WEB Developer")) {
  //          t = t + 1;
  //        }
  //      }
  //    } catch (Exception e) {
  //      e.printStackTrace();
  //    }
  //
  //    return t;
  //  }

  public static ArrayList<Integer> countPositionEmployee2(String file) {
    ArrayList<Integer> positionsCount = new ArrayList<>();
    int webDev = 0;
    int mobileDev = 0;
    int netWork = 0;
    int javaDev = 0;
    int dataSci = 0;
    int softWare = 0;
    // Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getPosition().equals("WEB Developer")) {
          webDev += 1;
        }
        if (myEmp.getPosition().equals("APP Developer")) {
          mobileDev += 1;
        }
        if (myEmp.getPosition().equals("Network")) {
          netWork += 1;
        }
        if (myEmp.getPosition().equals("Java Developer")) {
          javaDev += 1;
        }
        if (myEmp.getPosition().equals("Data Scientist")) {
          dataSci += 1;
        }
        if (myEmp.getPosition().equals("Software Engineer")) {
          softWare += 1;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    // convienient
    positionsCount.add(webDev);
    positionsCount.add(mobileDev);
    positionsCount.add(netWork);
    positionsCount.add(javaDev);
    positionsCount.add(dataSci);
    positionsCount.add(softWare);

    return positionsCount;
  }

  public static int countMale(String file) {
    int t = 0;
    // Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getGender().equals("Male")) {
          t = t + 1;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return t;
  }

  public static int countFemale(String file) {
    int t = 0;
    // Employee empSearch = new Employee();
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getGender().equals("Female")) {
          t = t + 1;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return t;
  }

  public boolean IsDuplicate(String idCheck, String file) {
    Boolean myStatus2 = false;
    try {
      ArrayList<Employee> EmployeesInPresent = readEmpFromFile(file);
      for (Employee myEmp : EmployeesInPresent) {
        if (myEmp.getId().equals(idCheck) || myStatus2) {
          myStatus2 = true;
          return myStatus2;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return myStatus2;
  }
}
// THANK ^_^
