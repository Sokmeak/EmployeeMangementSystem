package com.System_Operations;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class main extends JFrame {

  private static final long serialVersionUID = 1L;
  protected static final JFrame JFrame = null;

  private JPanel naviGatePanel = new JPanel();
  private JPanel defaultPanel = new JPanel();
  private JPanel nagatorPanel = new JPanel();
  private JLabel myLabelDefault = new JLabel();
  public static JLabel naviLabel = new JLabel();

  private JButton btnBackHome = new JButton();
  private JButton btnAdd = new JButton();
  private JButton btnView = new JButton();
  private JButton btnSetting = new JButton();
  private JButton btnLogout = new JButton();
  private JButton btnExit = new JButton();
  public static int rowSelected = 1;

  public static Employee empGot = new Employee();
  DefaultMonitoring moniTor = new DefaultMonitoring();

  private Color myColor() {
    return new Color(109, 195, 205);
  }

  private Font fontInTf(int s) {
    return new Font("Comic Sans MS", Font.ROMAN_BASELINE, s);
  }

  private Font myFont(int size) {
    return new Font("Times New Roman", Font.ROMAN_BASELINE, size);
  }

  public main() {
    setTitle("System Oparations");
    setSize(1300, 680);
    setLayout(null);

    naviGatePanel.setBounds(0, 0, 220, 640);
    naviGatePanel.setBackground(Color.WHITE);
    FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 1, 12);
    naviGatePanel.setLayout(flow);

    nagatorPanel.setBorder(
      BorderFactory.createMatteBorder(3, 2, 2, 3, myColor())
    );

    add(naviGatePanel);
    naviLabel.setBounds(30, 25, 500, 30);
    naviLabel.setText("Home");
    naviLabel.setFont(myFont(24));

    nagatorPanel.add(naviLabel);
    nagatorPanel.setBounds(225, 3, 1040, 80);

    nagatorPanel.setLayout(null);
    nagatorPanel.setBackground(myColor());

    add(nagatorPanel); // add to interface
    defaultPanel.setLayout(null);
    defaultPanel.setBounds(224, 88, 1040, 555);
    defaultPanel.setBackground(Color.WHITE);

    defaultPanel.setBorder(
      BorderFactory.createMatteBorder(3, 2, 3, 3, myColor())
    );
    // 225, 87, 1040, 555 // set bounds
    // nagatorPanel.setVisible(true);

    // total hight 680
    // space 80

    ImageIcon myIcon2 = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//home1.jpg")
    );

    Image im2 = myIcon2
      .getImage()
      .getScaledInstance(1034, 555, Image.SCALE_AREA_AVERAGING);
    ImageIcon igi2 = new ImageIcon(im2);
    JLabel image2 = new JLabel(igi2);
    image2.setBounds(4, 3, 1034, 555);

    myLabelDefault.setBounds(310, 50, 700, 40);
    myLabelDefault.setText("IMPLEMENTATION HERE!!!");
    myLabelDefault.setFont(fontInTf(25));
    myLabelDefault.setForeground(Color.WHITE);
    image2.add(myLabelDefault);
    defaultPanel.add(image2);


    ImageIcon myIconNew = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//Settings1.jpg")
    );
    Image imNew = myIconNew
      .getImage()
      .getScaledInstance(1050, 600, Image.SCALE_AREA_AVERAGING);
    ImageIcon igiNew = new ImageIcon(imNew);
    JLabel imageNew = new JLabel(igiNew);
    imageNew.setBounds(0, 0, 1050, 600);

    //		panelSettings.add(imageNew);
    //		add(panelSettings);

    JPanel panelAdd = new JPanel();
    panelAdd.setBounds(205, 0, 1050, 600);
    // panelAdd.setBackground(Color.PINK);

    ImageIcon myIcon3 = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//Demo_Add1.jpg")
    );

    Image im3 = myIcon3
      .getImage()
      .getScaledInstance(1050, 600, Image.SCALE_AREA_AVERAGING);
    ImageIcon igi3 = new ImageIcon(im3);
    JLabel image3 = new JLabel(igi3);
    image3.setBounds(0, 0, 1050, 600);

    JPanel panelviewEmp = new JPanel();
    panelviewEmp.setBounds(205, 0, 1050, 600);

    ImageIcon myIcon4 = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//Demo_View1.jpg")
    );
    Image im4 = myIcon4
      .getImage()
      .getScaledInstance(1050, 600, Image.SCALE_AREA_AVERAGING);
    ImageIcon igi4 = new ImageIcon(im4);
    JLabel image4 = new JLabel(igi4);
    image4.setBounds(0, 0, 1050, 600);

    //Creating Buttons

    btnBackHome =
      buttonCreator.createImageButton("newIcons/ProductBtn/homeBtn.png");
    naviGatePanel.add(btnBackHome);

    btnBackHome.addActionListener(new MyclickListener());

    btnAdd = buttonCreator.createImageButton("newIcons/ProductBtn/addBtn.png");
    naviGatePanel.add(btnAdd);
    btnAdd.addActionListener(new MyclickListener());

    btnView = buttonCreator.createImageButton("newIcons/ProductBtn/empBtn.png");
    naviGatePanel.add(btnView);
    btnView.addActionListener(new MyclickListener());

    btnSetting =
      buttonCreator.createImageButton("newIcons/ProductBtn/settingsBtn.png");
    naviGatePanel.add(btnSetting);
    btnSetting.addActionListener(new MyclickListener());

    btnLogout =
      buttonCreator.createImageButton("newIcons/ProductBtn/logoutBtn.png");
    naviGatePanel.add(btnLogout);
    btnLogout.addActionListener(new MyclickListener());

    btnExit =
      buttonCreator.createImageButton("newIcons/ProductBtn/exitBtn.png");
    naviGatePanel.add(btnExit);
    btnExit.addActionListener(new MyclickListener());

    add(moniTor);
    moniTor.setVisible(true);

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    setResizable(false);
    //   setMinimumSize(new java.awt.Dimension(300, 200));
    setResizable(true);
  }

  public void setVisibleMenu() {
    setVisible(true);
  }

  public void setInVisibleMenu() {
    setVisible(false);
  }

  public void Dispose() {
    dispose();
  }

  addEmployee addEmp = new addEmployee();
  VisulizeDataEmployee2 visual2 = new VisulizeDataEmployee2();
  GeneralSettings2 genSettings = new GeneralSettings2();

  public void updateVisual2Panel() {
    // Find and remove the existing table component (assuming it's the only one)
    Component[] components = visual2.getComponents();
    for (Component component : components) {
      if (component instanceof JScrollPane) {
        visual2.remove(component);
        break; // Assuming there is only one table component, break after removal
      }
    }

    JTable myTable = SimpleTable.tableBuilder();
    JScrollPane js = new JScrollPane(myTable);
    AddMouseClickInTable(myTable);
    js.setBounds(10, 100, 980, 240);

    visual2.add(js);
    visual2.revalidate();
    visual2.repaint();
  }

  // add action to button

  private class MyclickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btnBackHome) {
        naviLabel.setText("Home");
        genSettings.setVisible(false);
        visual2.setVisible(false);
        addEmp.setVisible(false);
        add(moniTor);
        moniTor.setVisible(true);
      } else if (e.getSource() == btnAdd) {
        naviLabel.setText("Home  >  Add ");
        //defaultPanel.setVisible(false);
        moniTor.setVisible(false);
        genSettings.setVisible(false);
        visual2.setVisible(false);
        add(addEmp);
        addEmp.setVisible(true);
        //updateVisual2Panel();
      } else if (e.getSource() == btnView) {
        updateVisual2Panel();
        add(visual2);
        visual2.setVisible(true);
        moniTor.setVisible(false);
        naviLabel.setText("Home  >  Employee");
        defaultPanel.setVisible(false);
        genSettings.setVisible(false);
        addEmp.setVisible(false);
      } else if (e.getSource() == btnSetting) {
        moniTor.setVisible(false);
        naviLabel.setText("Home  >  Settings");

        defaultPanel.setVisible(false);
        addEmp.setVisible(false);
        visual2.setVisible(false);

        add(genSettings);
        genSettings.setVisible(true);
        // why JPanel newTablePanel = VisulizeDataEmployee2.currentTable( SimpleTable.tableBuilder())visual2.add(newTablePanel); take override only time?
        updateVisual2Panel();
        // add(ts2);
        // ts2.setVisible(true);
        // ...
      } else if (e.getSource() == btnLogout) {
        // can modify some conditions
        dispose();
        login log = new login();
        log.ShowLoginUI();
        // ....
      } else {
        System.exit(0);
      }
    }
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
          empGot.setId(id.toString());
          empGot.setName(name.toString());
          empGot.setGender(gender.toString());
          empGot.setDob(DOB.toString());
          empGot.setEmail(email.toString());
          empGot.setPosition(pos.toString());
          empGot.setAddress(address.toString());
          empGot.setPhone(phone.toString());
          empGot.setSalary(salary.toString());
          empGot.setWorkHour(workHour.toString());
        }
      }
    );
  }

  public static void main(String[] args) {
    new main();
  }
}
