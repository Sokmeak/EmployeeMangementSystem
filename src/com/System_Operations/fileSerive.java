package com.System_Operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
class Person {

  private String userName;
  private String email;
  private String passWord;
  private String comPassWord;

  public Person(String user, String e, String pass, String compass) {
    this.userName = user;
    this.email = e;
    this.passWord = pass;
    this.comPassWord = compass;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public String getComPassWord() {
    return comPassWord;
  }

  public void setComPassWord(String comPassWord) {
    this.comPassWord = comPassWord;
  }
}

public class fileSerive {

  public static String filename = "MyAdmin.csv";

  void AppendData(String filename, Person p) {
    try {
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(filename, true)
      );

      writer.write(
        
        p.getUserName() +
        "," +
        p.getEmail() +
        "," +
        p.getPassWord() +
        "," +
        p.getComPassWord()+"\n"
        
      );
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 // add in 
static void DisplayData(String filename) {
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader(filename));
	        String line;

	        System.out.println("Displaying Data:");
//	        while ((line = reader.readLine()) != null) {
//	            String[] data = line.split(",");
//	            System.out.println("Username: " + data[0]);
//	            System.out.println("Email: " + data[1]);
//	            System.out.println("Password: " + data[2]);
//	            System.out.println("Confirm Password: " + data[3]);
//	            System.out.println("----------------------");
//	        }

	        reader.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
public static void deleteAdmin(String adminUs,String adminPas, String file) {
	int  t = 0 ;
    try {
        File inputFile = new File(file);

        // Read the data from the original file
        List<String> lines = new ArrayList<>();
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile))
        ) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                // check to ensure that it does not contain the ID of the employee to delete.
                if (!(currentLine.contains(adminUs) && currentLine.contains(adminPas))) {
                    lines.add(currentLine);
                }
                else {
                	t = 1;
                }
            }
            
            // if any lines has no admin's user name and its password add to currentline
        }

        // Write the modified data back to the original file
        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))
        ) {
            for (String line : lines) {
                writer.write(line + System.getProperty("line.separator"));
            }
        }

        
        if(t == 1) {
//        	System.out.println(
//                    "Admin"
//                    + " with name:  " + adminUs + " deleted successfully."
//                );
        	
        	JOptionPane.showMessageDialog(null, "Remove Successfully!");
        }else {
        	JOptionPane.showMessageDialog(null, "Remove Unsuccessfully!");
        }
        
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error occurred while deleting employee.");
    }
}



  Boolean AdminSearch(String filename, String adminName, String currentPs) {
    Boolean myStatus = false;
    try {
      ArrayList<Person> PersonInfile = readFormfile(filename);

      for (Person myPer : PersonInfile) {
        if (
          myPer.getUserName().equals(adminName) &&
          myPer.getPassWord().equals(currentPs)
        ) {
          myStatus = true;
          return myStatus;
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return myStatus;
  }

  static ArrayList<Person> readFormfile(String filename) {
    ArrayList<Person> ArrPerson = new ArrayList<Person>();
    try {
      Scanner scanner = new Scanner(new File(filename));
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        if (parts.length == 4) {
          String userN = parts[0];
          String emial = parts[1];
          String pass = parts[2];
          String comp = parts[3];

          Person ps = new Person(userN, emial, pass, comp);
          ArrPerson.add(ps);
        }
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    }

    return ArrPerson;
  }
//add in
  
  public static void updateAdmin(String admincurrentEmailOrPass,
		  String currentPs,Person newAdminInfo, String file) {
	  
      String newInfo = newAdminInfo.getUserName() + "," +
              newAdminInfo.getEmail() + "," + newAdminInfo.getPassWord() + ","
              + newAdminInfo.getComPassWord();
      int t=0;
      try {
          File inputFile = new File(file);

          // Read the data from the original file
          List<String> lines = new ArrayList<>();
          try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
              String currentLine;
              while ((currentLine = reader.readLine()) != null) {
                  // check if the current line contains the adminId
                  if (currentLine.contains(admincurrentEmailOrPass) && currentLine.contains(currentPs)) {
                      // update the line with newAdminData
                	 
                      lines.add(newInfo);
                  } else   {
                	  t=1;
                      lines.add(currentLine);
                  }
              }
          }

          // Write the modified data back to the original file
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
              for (String line : lines) {
                  writer.write(line + System.getProperty("line.separator"));
              }
              if(t == 1) {
//              	System.out.println(
//                          "Admin"
//                          + " with name:  " + adminUs + " deleted successfully."
//                      );
              	
              	JOptionPane.showMessageDialog(null, "Update Successfully!");
              }else {
              	JOptionPane.showMessageDialog(null, "Update Unsuccessfully!");
              }
              
          }
          

          System.out.println("Admin with ID " + admincurrentEmailOrPass + " updated successfully.");
      } catch (IOException e) {
          e.printStackTrace();
          System.err.println("Error occurred while updating admin.");
      }
  }

// add in  
  
  Boolean AdminCheker(String filename, Person per) {
    Boolean myStatus = false;
    try {
      ArrayList<Person> PersonInfile = readFormfile(filename);

      for (Person myPer : PersonInfile) {
        if (
          myPer.getUserName().equals(per.getUserName()) &&
          myPer.getPassWord().equals(per.getPassWord()) ||
          myPer.getEmail().equals(per.getEmail()) &&
          myPer.getEmail().equals(per.getPassWord())
        ) {
          myStatus = true;
          return myStatus;
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return myStatus;
  }

  public Boolean AdminChekerLog(String filename, String userOremail, String password) {
    Boolean myStatus = false;
    try {
      ArrayList<Person> PersonInfile = readFormfile(filename);

      for (Person myPer : PersonInfile) {
        if (
          myPer.getUserName().equals(userOremail) &&
          myPer.getPassWord().equals(password) ||
          myPer.getEmail().equals(userOremail) &&
          myPer.getPassWord().equals(password)
        ) {
          myStatus = true;
          return myStatus;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return myStatus;
  }
}
