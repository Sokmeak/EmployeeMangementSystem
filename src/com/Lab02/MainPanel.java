//package com.Lab02;
//
//import javax.swing.*;
//
//import com.System_Operations.PieChatDemo;
//
//import java.awt.*;
//
//public class MainPanel extends JPanel {
//
//    public MainPanel() {
//    	setSize(200,200);
//    	
//        // Create a new PieChatDemo instance with desired data
//        double females = 50;
//        double males = 60;
//        PieChatDemo labeledGenderPieChart = new PieChatDemo(females, males);
//
//        // Add the PieChatDemo instance to this panel
//        add(labeledGenderPieChart);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Main Panel with Pie Chart");
//           
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(500, 500);
//
//            // Create an instance of your MainPanel and add it to the frame
//            MainPanel mainPanel = new MainPanel();
//            frame.setContentPane(mainPanel);
//            
//
//            frame.setVisible(true);
//        });
//    }
//}
