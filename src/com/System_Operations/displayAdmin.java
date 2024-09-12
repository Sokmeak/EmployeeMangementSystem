package com.System_Operations;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class displayAdmin extends Panel {
	  //private JPanel subpDisplay = new JPanel();
	  private JLabel dipLabel = new JLabel();
	  private JLabel header = new JLabel();
	  public static JPanel displaymyAdminPanel = new JPanel();

	  public Font myFont() {
		    return new Font("Time New Romans", Font.ROMAN_BASELINE, 18);
		  }
	  
	  private Color myColor1() {
		    return new Color(109, 195, 205);
		  }

public displayAdmin() {
 
	
	header.setBounds(200, 20, 150, 30);
	header.setFont(myFont());
	header.setText("MY ADMINs");
	//displaymyAdminPanel.add(header);
	
	displaymyAdminPanel.setBounds(105, 100, 350, 400);
	displaymyAdminPanel.setBackground(Color.pink);

	displaymyAdminPanel.setLayout(new GridLayout(0,1));
	
	
	add(displaymyAdminPanel);
    setSize(530, 545);
    setBounds(505, 5, 530, 545);
    setBackground(myColor1());
    setLayout(null);

    dipLabel.setText("Display Admin in Our System ");
    dipLabel.setFont(myFont());
    dipLabel.setBounds(180, 30, 270, 30);
   

    add(dipLabel);
    
    
}

public void updatePanelForDisplayAdmin(JLabel label) {
    // Find and remove the existing table component (assuming it's the only one)
    Component[] components = getComponents();
    for (Component component : components) {
      if (component instanceof JPanel) {
        remove(component);
        
      }
    }
   
   add(displayAdmin.displaymyAdminPanel);
    displayAdmin.displaymyAdminPanel.add(label);
    
    // Repaint the visual2 panel
    revalidate();
    repaint();
  }
}


