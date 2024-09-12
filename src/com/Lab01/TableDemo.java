package com.Lab01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class TableDemo {

  public static Font myFont2() {
    return new Font("Comic Sans MS", Font.ROMAN_BASELINE, 19);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Test Table");
    JPanel panel = new JPanel();
    panel.setSize(1050, 600);
    panel.setLayout(null);

    JPanel subPanel = new JPanel();
    subPanel.setSize(1025, 240);
    subPanel.setBounds(5, 100, 1025, 240);
    subPanel.setLayout(null);
    subPanel.setBackground(Color.GRAY);

    JPanel subPanel2 = new JPanel();
    subPanel2.setSize(500, 50);
    subPanel2.setBounds(300, 380, 500, 50);
    subPanel2.setBackground(Color.CYAN);
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 15, 10);
    subPanel2.setLayout(flow);

    panel.add(subPanel2);
    JLabel labSearch = new JLabel("ID_Search");
    labSearch.setBounds(60, 380, 120, 50);
    labSearch.setFont(myFont2());
    labSearch.setForeground(Color.white);
    panel.add(labSearch);
    String allIDs[] = new String[] { "1111", "2222", "3333", "4444" };
    JComboBox<String> Empids = new JComboBox<String>(allIDs);
    Empids.setBounds(180, 395, 120, 30);
    panel.add(Empids);

    panel.setBounds(0, 0, 1050, 600);

    JLabel lbtext = new JLabel();
    lbtext.setText("Table for Employees information");
    lbtext.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    lbtext.setForeground(Color.WHITE);
    lbtext.setBounds(80, 10, 1000, 50);
    lbtext.setHorizontalAlignment(SwingConstants.CENTER);

    DefaultTableModel header = new DefaultTableModel();
    header.addColumn("ID");
    header.addColumn("Name");
    header.addColumn("Gender");
    header.addColumn("DOB");
    header.addColumn("Email");
    header.addColumn("Position");
    header.addColumn("Address");
    header.addColumn("Phone");
    header.addColumn("Salary");
    header.addColumn("Time");

    JTable myTable = new JTable(header);
    DefaultTableModel model = (DefaultTableModel) myTable.getModel();

    model.addRow(
      new Object[] {
        "1111",
        "Sok Nika",
        "23",
        "10/02/2000",
        "nika123@gmail.com",
        "WEB Dev",
        "Phnom Penh",
        "0123456789",
        "700",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "2222",
        "Veng Vichea",
        "24",
        "14/04/1999",
        "vichea11@gmail.com",
        "APP Dev",
        "Kampong Cham",
        "012983465",
        "750",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "3333",
        "Teth Tola",
        "22",
        "17/01/2001",
        "tola17@gmail.com",
        "Network",
        "Krati",
        "017878765",
        "300",
        "Part Time",
      }
    );
    model.addRow(
      new Object[] {
        "4444",
        "Sok Nika",
        "23",
        "10/02/2000",
        "nika123@gmail.com",
        "WEB Dev",
        "Phnom Penh",
        "0123456789",
        "700",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "5555",
        "Veng Vichea",
        "24",
        "14/04/1999",
        "vichea11@gmail.com",
        "APP Dev",
        "Kampong Cham",
        "012983465",
        "750",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "6666",
        "Teth Tola",
        "22",
        "17/01/2001",
        "tola17@gmail.com",
        "Network",
        "Krati",
        "017878765",
        "300",
        "Part Time",
      }
    );

    model.addRow(
      new Object[] {
        "7777",
        "Sok Nika",
        "23",
        "10/02/2000",
        "nika123@gmail.com",
        "WEB Dev",
        "Phnom Penh",
        "0123456789",
        "700",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "9999",
        "Teth Tola",
        "22",
        "17/01/2001",
        "tola17@gmail.com",
        "Network",
        "Krati",
        "017878765",
        "300",
        "Part Time",
      }
    );
    model.addRow(
      new Object[] {
        "1112",
        "Sok Nika",
        "23",
        "10/02/2000",
        "nika123@gmail.com",
        "WEB Dev",
        "Phnom Penh",
        "0123456789",
        "700",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "1113",
        "Veng Vichea",
        "24",
        "14/04/1999",
        "vichea11@gmail.com",
        "APP Dev",
        "Kampong Cham",
        "012983465",
        "750",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "1114",
        "Teth Tola",
        "22",
        "17/01/2001",
        "tola17@gmail.com",
        "Network",
        "Krati",
        "017878765",
        "300",
        "Part Time",
      }
    );
    model.addRow(
      new Object[] {
        "1115",
        "Teth Tola",
        "22",
        "17/01/2001",
        "tola17@gmail.com",
        "Network",
        "Krati",
        "017878765",
        "300",
        "Part Time",
      }
    );
    model.addRow(
      new Object[] {
        "1116",
        "Veng Vichea",
        "24",
        "14/04/1999",
        "vichea11@gmail.com",
        "APP Dev",
        "Kampong Cham",
        "012983465",
        "750",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "1117",
        "Veng Vichea",
        "24",
        "14/04/1999",
        "vichea11@gmail.com",
        "APP Dev",
        "Kampong Cham",
        "012983465",
        "750",
        "Full Time",
      }
    );
    model.addRow(
      new Object[] {
        "1118",
        "Sok Nika",
        "23",
        "10/02/2000",
        "nika123@gmail.com",
        "WEB Dev",
        "Phnom Penh",
        "0123456789",
        "700",
        "Full Time",
      }
    );

    //myTable.setSize(1000,100);
    JScrollPane js = new JScrollPane(myTable);

    js.setBounds(0, 0, 1030, 240);
    subPanel.add(js);
    panel.add(subPanel);

    JButton BtnSearch = new JButton("Search");

    BtnSearch.setForeground(Color.WHITE);
    BtnSearch.setFont(myFont2());
    BtnSearch.setBackground(Color.BLUE);
    subPanel2.add(BtnSearch);

    JButton BtnUpdate = new JButton("Update");
    //BtnUpdate.setBounds(170, 380, 100, 40);
    BtnUpdate.setForeground(Color.WHITE);
    BtnUpdate.setFont(myFont2());
    BtnUpdate.setBackground(Color.GREEN);
    subPanel2.add(BtnUpdate);
    //
    //		panel.add(BtnUpdate);
    //
    JButton BtnDelete = new JButton("Delete");

    BtnDelete.setForeground(Color.WHITE);
    BtnDelete.setFont(myFont2());
    BtnDelete.setBackground(Color.RED);
    subPanel2.add(BtnDelete);

    JButton BtnCopy = new JButton("Copy");

    BtnCopy.setForeground(Color.WHITE);
    BtnCopy.setFont(myFont2());
    BtnCopy.setBackground(Color.GRAY);
    subPanel2.add(BtnCopy);

    JButton BtnSort = new JButton("Sort");

    BtnSort.setForeground(Color.WHITE);
    BtnSort.setFont(myFont2());
    BtnSort.setBackground(Color.GREEN);
    subPanel2.add(BtnSort);

    //
    //		panel.add(BtnUpdate1);

    panel.add(lbtext);
    panel.setBackground(Color.CYAN);

    frame.getContentPane().add(panel);
    frame.setSize(1050, 600);
    frame.setVisible(true);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
  }
}
