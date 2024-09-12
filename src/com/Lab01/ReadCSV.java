package com.Lab01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Person {

  private String userName;
  private String email;
  private String passWord;
  private String comPassWord;

  Person(String user, String e, String pass, String compass) {
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

  @Override
  public String toString() {
    return (
      "Person [userName=" +
      userName +
      ", email=" +
      email +
      ", passWord=" +
      passWord +
      ", comPassWord=" +
      comPassWord +
      "]"
    );
  }
}

public class ReadCSV {

  public static String filename = "MyAdmin1.csv";

  //signup sp = new signup();

  static void AppendData(String filename, Person p) {
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
        p.getComPassWord() +
        "\n"
      );
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static ArrayList<Person> readFormfile(String filename) {
    ArrayList<Person> ArrPerson = new ArrayList<Person>();
    try {
      Scanner scanner = new Scanner(new File(filename));
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        //        String userN = line.split(",")[0];
        //        String emial = line.split(",")[1];
        //        String pass = line.split(",")[2];
        //        String comp = line.split(",")[3];

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

  Boolean AdminChekerLog(String filename, String userOremail, String password) {
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
      // TODO: handle exception
    }
    return myStatus;
  }

  public static void main(String[] args) {
    Person p = new Person("Sok", "sok@gmail.com", "134", "134");
    Person p2 = new Person("Sok", "sok@gmail.com", "134", "134");

    AppendData(filename, p);
    AppendData(filename, p2);

    ArrayList<Person> Emps = readFormfile(filename);

    for (Person ps : Emps) {
      System.out.println(ps.toString());
    }
  }
}
