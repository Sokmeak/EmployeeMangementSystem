//package com.Lab02;
//
//import javax.swing.*;
//
//import com.System_Operations.PieChatDemo;
//
//import java.awt.*;
//
//public class TestPieChart2 extends JFrame {
//
//    public TestPieChart2() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(900, 900);
//
//        double females = 50;
//        double males = 60;
//
//        JPanel pieChartPanel = createPieChartPanel(females, males);
//        add(pieChartPanel);
//
//        setVisible(true);
//    }
//
//    private JPanel createPieChartPanel(double females, double males) {
//        PieChatDemo labeledGenderPieChart = new PieChatDemo(females, males);
//        return labeledGenderPieChart;
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new TestPieChart2());
//    }
//}
