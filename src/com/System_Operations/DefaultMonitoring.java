package com.System_Operations;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DefaultMonitoring extends JPanel {

  private JPanel panelForPieChartgender = new JPanel();
  private JPanel panelForPieChartWork = new JPanel();
  private JPanel panelForPositionEmp = new JPanel();

  private JLabel DescribeLabel1 = new JLabel();
  private JLabel LbmoreInfoGender = new JLabel();
  private JLabel LbmoreInfoWorkhour = new JLabel();
  private JLabel DescribeLabel2 = new JLabel();

  private JPanel panelPosiDes = new JPanel();
  private ArrayList<Integer> allPosts;

  private JLabel DescribePos = new JLabel();
  private JButton BtnRefresh = new JButton();

  private JLabel headerDes = new JLabel();
  private JLabel webDescribe = new JLabel();
  private JLabel mobileDescribe = new JLabel();
  private JLabel netWorkDescribe = new JLabel();
  private JLabel javadevDescribe = new JLabel();
  private JLabel dataSciDescribe = new JLabel();
  private JLabel softDescribe = new JLabel();

  static int web;
  static int mobile;
  static int netWork;
  static int javaDev;
  static int dataSci;
  static int softWare;
  static int total1;
  static int females;
  static int males;

  static int fulltime;
  static int parttime;

  private Color myColor() {
    return new Color(109, 195, 205);
  }

  public Color myBack() {
    return new Color(224, 224, 224);
  }

  private Font myFont1() {
    return new Font("Times New Roman", Font.BOLD, 32);
  }

  private Font myFont2() {
    return new Font("Times New Roman", Font.BOLD, 17);
  }

  private Font myFont3() {
    return new Font("Times New Roman", Font.ROMAN_BASELINE, 17);
  }

  // we always refresh it when do any operations

  public DefaultMonitoring() {
    allPosts = fileService2.countPositionEmployee2(fileService2.fileEmployee);

    total1 = fileService2.countEmployee(fileService2.fileEmployee);
    // static int total1 ;
    females = fileService2.countFemale(fileService2.fileEmployee);
    males = fileService2.countMale(fileService2.fileEmployee);
    // demo for each parameter
    fulltime = fileService2.countFulltimeEmployee(fileService2.fileEmployee);

    parttime = fileService2.countParttimeEmployee(fileService2.fileEmployee);

    // access any function in this button

    web = allPosts.get(0);
    mobile = allPosts.get(1);
    netWork = allPosts.get(2);
    javaDev = allPosts.get(3);
    dataSci = allPosts.get(4);
    softWare = allPosts.get(5);

    // add any label for position here !!!

    headerDes.setBounds(110, 10, 200, 30);
    headerDes.setFont(myFont3());
    headerDes.setText("<< POSITION >>");

    webDescribe.setBounds(70, 50, 300, 30);
    webDescribe.setFont(myFont3());
    webDescribe.setText("Web Developer       : " + web);

    mobileDescribe.setBounds(70, 90, 300, 30);
    mobileDescribe.setFont(myFont3());
    mobileDescribe.setText("Mobile Developer    : " + mobile);

    netWorkDescribe.setBounds(70, 130, 300, 30);
    netWorkDescribe.setFont(myFont3());
    netWorkDescribe.setText("NetWorking            : " + netWork);

    javadevDescribe.setBounds(70, 170, 300, 30);
    javadevDescribe.setFont(myFont3());
    javadevDescribe.setText("Java Developer        : " + javaDev);

    dataSciDescribe.setBounds(70, 210, 300, 30);
    dataSciDescribe.setFont(myFont3());
    dataSciDescribe.setText("Data Scientist          : " + dataSci);

    softDescribe.setBounds(70, 250, 300, 30);
    softDescribe.setFont(myFont3());
    softDescribe.setText("Software Engineer : " + softWare);

    panelPosiDes.add(dataSciDescribe);
    panelPosiDes.add(softDescribe);
    panelPosiDes.add(javadevDescribe);
    panelPosiDes.add(netWorkDescribe);
    panelPosiDes.add(mobileDescribe);
    panelPosiDes.add(headerDes);
    panelPosiDes.add(webDescribe);

    panelPosiDes.setBounds(30, 130, 370, 300);
    panelPosiDes.setLayout(null);
    panelPosiDes.setBackground(Color.PINK);

    DescribePos.setText("Desciptive Position");
    DescribePos.setBounds(60, 5, 400, 40);
    DescribePos.setFont(myFont1());

    BtnRefresh.setText("Refresh");
    BtnRefresh.setFont(myFont2());
    Color myColor = new Color(44, 213, 106);
    BtnRefresh.setBackground(myColor);
    BtnRefresh.setBounds(150, 500, 130, 40);

    setLayout(new BorderLayout()); // Use FlowLayout for the main panel
    panelForPositionEmp.setLayout(null);
    panelForPositionEmp.setBackground(myBack());

    panelForPositionEmp.add(panelPosiDes);

    panelForPieChartgender.setLayout(new BorderLayout()); // Use GridLayout for sub-panels
    PieChartSample myPieChartGender = new PieChartSample(
      females,
      males,
      "Female",
      "Male"
    );
    DescribeLabel1.setText("Gender Pie Chart");
    DescribeLabel1.setFont(myFont1());
    LbmoreInfoGender.setText(
      "Total : " + total1 + " ( Female: " + females + " Male: " + males + " )"
    );
    LbmoreInfoGender.setFont(myFont2());
    DescribeLabel2.setText("Work Hour Pie Chart");
    DescribeLabel2.setFont(myFont1());
    LbmoreInfoWorkhour.setText(
      "Work hour | full time: " + fulltime + " | part time: " + parttime
    );
    LbmoreInfoWorkhour.setFont(myFont2());
    addPieChartToPanel(
      myPieChartGender,
      panelForPieChartgender,
      DescribeLabel1,
      LbmoreInfoGender
    );
    add(panelForPieChartgender, BorderLayout.WEST);
    // test number of each position

    panelForPieChartWork.setLayout(new BorderLayout());
    PieChartSample myPieChartWorkHour = new PieChartSample(
      fulltime,
      parttime,
      "Full time",
      "Part time"
    );
    addPieChartToPanel(
      myPieChartWorkHour,
      panelForPieChartWork,
      DescribeLabel2,
      LbmoreInfoWorkhour
    );
    add(panelForPieChartWork, BorderLayout.EAST);
    panelForPositionEmp.add(DescribePos);
    panelForPositionEmp.add(BtnRefresh);
    add(panelForPositionEmp, BorderLayout.CENTER);

    BtnRefresh.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // read at the same time>>>

          //();

          //	add(BtnRefresh);

          remove(panelForPieChartgender);
          remove(panelForPieChartWork);
          remove(panelForPositionEmp);

          allPosts =
            fileService2.countPositionEmployee2(fileService2.fileEmployee);

          total1 = fileService2.countEmployee(fileService2.fileEmployee);
          // static int total1 ;
          females = fileService2.countFemale(fileService2.fileEmployee);
          males = fileService2.countMale(fileService2.fileEmployee);
          // demo for each parameter
          fulltime =
            fileService2.countFulltimeEmployee(fileService2.fileEmployee);

          parttime =
            fileService2.countParttimeEmployee(fileService2.fileEmployee);
          System.out.println(" Male : " + males);
          web = allPosts.get(0);
          mobile = allPosts.get(1);
          netWork = allPosts.get(2);
          javaDev = allPosts.get(3);
          dataSci = allPosts.get(4);
          softWare = allPosts.get(5);
          System.out.println("== my data ==");
          System.out.println(web);
          System.out.println(mobile);
          System.out.println(netWork);
          System.out.println(javaDev);
          System.out.println(dataSci);
          System.out.println(softWare);
          int t = web + mobile + netWork + javaDev + dataSci + softWare;

          System.out.println("Total " + t);
          createPieChartandLabelPanels(
            females,
            males,
            fulltime,
            parttime,
            total1,
            web,
            mobile,
            netWork,
            javaDev,
            dataSci,
            softWare
          );

          revalidate();
          repaint();
        }
      }
    );

    setSize(1040, 555);
    setBounds(224, 88, 1040, 555);
    setBackground(myBack());
    setBorder(BorderFactory.createMatteBorder(2, 2, 4, 2, myColor()));
  }

  // more work hours
  private void createPieChartandLabelPanels(
    int females,
    int males,
    int fulltime,
    int parttime,
    int total,
    int web,
    int mobile,
    int netWork,
    int javaDev,
    int dataSci,
    int softWare
  ) {
    LbmoreInfoGender.setText(
      "Total : " + total1 + " ( Female: " + females + " Male: " + males + " )"
    );
    LbmoreInfoGender.setFont(myFont2());

    LbmoreInfoWorkhour.setText(
      "Work hour | full time: " + fulltime + " | part time: " + parttime
    );
    LbmoreInfoWorkhour.setFont(myFont2());
    panelForPieChartgender = new JPanel();
    panelForPieChartgender.setLayout(new BorderLayout());
    PieChartSample myPieChartGender = new PieChartSample(
      females,
      males,
      "Female",
      "Male"
    );
    addPieChartToPanel(
      myPieChartGender,
      panelForPieChartgender,
      DescribeLabel1,
      LbmoreInfoGender
    );
    add(panelForPieChartgender, BorderLayout.WEST);

    panelForPieChartWork = new JPanel();
    panelForPieChartWork.setLayout(new BorderLayout());
    PieChartSample myPieChartWorkHour = new PieChartSample(
      fulltime,
      parttime,
      "Full time",
      "Part time"
    );
    addPieChartToPanel(
      myPieChartWorkHour,
      panelForPieChartWork,
      DescribeLabel2,
      LbmoreInfoWorkhour
    );
    add(panelForPieChartWork, BorderLayout.EAST);

    // panelForPositionEmp = new JPanel();
    panelForPositionEmp.setLayout(null);
    //   BtnRefresh.setBounds(150, 500, 130, 40);

    headerDes.setBounds(110, 10, 200, 30);
    headerDes.setFont(myFont3());
    headerDes.setText("<< POSITION >>");

    webDescribe.setBounds(70, 50, 300, 30);
    webDescribe.setFont(myFont3());
    webDescribe.setText("Web Developer       : " + web);

    mobileDescribe.setBounds(70, 90, 300, 30);
    mobileDescribe.setFont(myFont3());
    mobileDescribe.setText("Mobile Developer    : " + mobile);

    netWorkDescribe.setBounds(70, 130, 300, 30);
    netWorkDescribe.setFont(myFont3());
    netWorkDescribe.setText("NetWorking            : " + netWork);

    javadevDescribe.setBounds(70, 170, 300, 30);
    javadevDescribe.setFont(myFont3());
    javadevDescribe.setText("Java Developer        : " + javaDev);

    dataSciDescribe.setBounds(70, 210, 300, 30);
    dataSciDescribe.setFont(myFont3());
    dataSciDescribe.setText("Data Scientist          : " + dataSci);

    softDescribe.setBounds(70, 250, 300, 30);
    softDescribe.setFont(myFont3());
    softDescribe.setText("Software Engineer : " + softWare);

    panelForPositionEmp.add(DescribePos);
    panelForPositionEmp.add(BtnRefresh);
    add(panelForPositionEmp, BorderLayout.CENTER);
  }

  // Method to add PieChatDemo to a panel
  public void addPieChartToPanel(
    PieChartSample pieChart,
    JPanel panel,
    JLabel lbtext,
    JLabel lbtext2
  ) {
    pieChart.setPreferredSize(new Dimension(300, 300)); // Set the preferred size
    pieChart.add(lbtext);
    pieChart.add(lbtext2);
    panel.add(pieChart);
    panel.setBorder(BorderFactory.createMatteBorder(2, 2, 4, 2, myColor()));
  }

  public void update2Panel() {
    // Find and remove the existing table component (assuming it's the only one)
    Component[] components = getComponents();
    for (Component component : components) {
      if (!(component instanceof JButton)) {
        remove(component);
      }
    }
    //  	    	add(BtnRefresh);
    revalidate();
    repaint();
  }

  public static void main(String[] args) {
    //  DefaultMonitoring dfm = new DefaultMonitoring();
    new DefaultMonitoring();
    // System.out.println(web);
    // System.out.println(mobile);
    // System.out.println(netWork);
    // System.out.println(javaDev);
    // System.out.println(dataSci);
    // System.out.println(softWare);
    //        JFrame f = new JFrame();
    //        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        f.add(dfm);
    //        f.setSize(900, 900);
    //        f.setVisible(true);
  }
}
