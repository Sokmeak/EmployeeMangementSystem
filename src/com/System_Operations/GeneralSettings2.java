package com.System_Operations;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class GeneralSettings2 extends JPanel {

  private JPanel subPanel = new JPanel();
  private JPanel subPanelSet = new JPanel();
  private JPanel subPanel2 = new JPanel();
  private JLabel header = new JLabel("Settings");
  
  
  private JLabel labelTesting  = new JLabel();
  private JButton addAdminBtn = new JButton();
  private JButton updateAdminBtn = new JButton();
  private JButton removeAdminBtn = new JButton();
  private JButton displayAdminBtn = new JButton();
  
  insertAdmin myInsertPanel = new insertAdmin();
  updateAdmin myUpdatePanel = new updateAdmin();
  removeAdmin myRemovePanel =new removeAdmin();
  displayAdmin myDisplayPanel = new displayAdmin();
  
  ArrayList<Person> myAdmins;
  
  public Font myFont() {
    return new Font("Time New Romans", Font.ROMAN_BASELINE, 18);
  }
  public Font myFont3() {
	    return new Font("Time New Romans", Font.ROMAN_BASELINE, 17);
	  }

  private Color myColor1() {
    return new Color(109, 195, 205);
  }

  public GeneralSettings2() {
    setSize(1040, 555);
    setBounds(224, 88, 1040, 555);
    setLayout(null);
    setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, myColor1()));

    subPanel.setLayout(null);
    subPanel.setSize(500, 545);
    subPanel.setBounds(7, 5, 500, 545);
    Color myColor = new Color(224, 225, 225);
    subPanel.setBackground(myColor);

    subPanelSet.setSize(200, 400);
    subPanelSet.setBounds(100, 50, 200, 400);
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 2, 12);
    subPanelSet.setLayout(flow);
    subPanelSet.setBackground(myColor);

    /// add any btn to it

    subPanel2.setSize(530, 545);
    subPanel2.setBounds(505, 5, 530, 545);
    subPanel2.setBackground(Color.WHITE);
    subPanel2.setLayout(null);
    add(subPanel2);
     

    ImageIcon myIcon = new ImageIcon(
      ClassLoader.getSystemResource("myIcons//Setting2.jpg")
    );
    Image image = myIcon
      .getImage()
      .getScaledInstance(560, 545, Image.SCALE_SMOOTH);
    ImageIcon igi = new ImageIcon(image);
    JLabel imageLb = new JLabel(igi);
    imageLb.setBounds(0, 0, 560, 545);
    subPanel2.add(imageLb);
     

    // header.setBounds(160, 70, 150, 30);
    header.setFont(new Font("Time New Romans", Font.BOLD, 25));
    header.setForeground(Color.BLACK);
    // btn as images creator

    addAdminBtn =
      buttonCreator.createImageButton("newIcons/ProductBtn/appendAdmin.png");
    updateAdminBtn =
      buttonCreator.createImageButton("newIcons/ProductBtn/updateBtn.png");
    removeAdminBtn =
      buttonCreator.createImageButton("newIcons/ProductBtn/removeAdmin.png");
    displayAdminBtn =
      buttonCreator.createImageButton("newIcons/ProductBtn/displayBtn.png");

    // subPanel.add(addAdminBtn);

    addAdminBtn.addActionListener(new MyclickListener());

    updateAdminBtn.addActionListener(new MyclickListener());

    removeAdminBtn.addActionListener(new MyclickListener());

    displayAdminBtn.addActionListener(new MyclickListener());

    subPanelSet.add(header);
    subPanelSet.add(addAdminBtn);
    subPanelSet.add(updateAdminBtn);
    subPanelSet.add(removeAdminBtn);
    subPanelSet.add(displayAdminBtn);
    subPanel.add(subPanelSet);
  //subPanel.add(header);
    add(subPanel);
    setBackground(Color.WHITE); 

     
  }

  public void setVisible() {
    setVisible(true);
  }
  int t = 0 ;
  private class MyclickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == addAdminBtn) {
        main.naviLabel.setText("Home  >  Settings  >  Add Admin");
        myUpdatePanel.setVisible(false);
        myDisplayPanel.setVisible(false);
        subPanel2.setVisible(false);
        myRemovePanel.setVisible(false);
        add(myInsertPanel);
        myInsertPanel.setVisible(true);
       
      } else if (e.getSource() == updateAdminBtn) {
        main.naviLabel.setText("Home  >  Settings  >  Update Admin");
        myInsertPanel.setVisible(false);
        subPanel2.setVisible(false);
        myRemovePanel.setVisible(false);
        myDisplayPanel.setVisible(false);
        add(myUpdatePanel);
        myUpdatePanel.setVisible(true);
        
      } else if (e.getSource() == removeAdminBtn) {
    	  
        main.naviLabel.setText("Home  >  Settings  >  Remove Admin");
        myUpdatePanel.setVisible(false);
        myInsertPanel.setVisible(false);
        subPanel2.setVisible(false);
        myDisplayPanel.setVisible(false);
        add(myRemovePanel);
        myRemovePanel.setVisible(true);
      } else if (e.getSource() == displayAdminBtn){
    	  
    	  fileSerive.DisplayData(fileSerive.filename);
    	  displayAdmin.displaymyAdminPanel.removeAll();
    	  
    	  
    	 
    	  labelTesting.setBounds(20, 30, 450, 400);
    	  
    	  labelTesting.setFont(myFont3());
    	  
    	  
    	
    	  String myFieldAdmin = " No \t| Admin name \t\t| Admin email" + "\n";

    	// Assuming displayAdmin is a JPanel where you want to display admin information
    	//displayAdmin.displaymyAdminPanel.setLayout(new GridLayout(0, 1)); // Set layout to GridLayout with 1 column

    	labelTesting.setText(myFieldAdmin);
    	updatePanelForDisplayAdmin(labelTesting);

    	myAdmins = fileSerive.readFormfile(fileSerive.filename);
    	t  =1;

    	for (Person ps : myAdmins) {
    	    
    	    myFieldAdmin = " " + t + " \t   | " + ps.getUserName() + " \t\t| " + ps.getEmail() + "\n";

    	    // Create a new JLabel for each admin
    	    JLabel adminLabel = new JLabel(myFieldAdmin);
    	    adminLabel.setFont(myFont3());

    	    // Add the JLabel to the displayAdmin panel
    		displayAdmin.displaymyAdminPanel.add(adminLabel);
    		t++;
    	}

    	// Repaint the panel to reflect the changes
    	displayAdmin.displaymyAdminPanel.revalidate();
    	displayAdmin.displaymyAdminPanel.repaint();

    	
    	  
    	myUpdatePanel.setVisible(false);
        main.naviLabel.setText("Home  >  Settings  >  Display Admin");
        myInsertPanel.setVisible(false);
        subPanel2.setVisible(false);
        myRemovePanel.setVisible(false);
        add( myDisplayPanel);
        myDisplayPanel.setVisible(true);
      }
    }
  }
  
  
  public void  rePaintPanelDisplay(JLabel label) {
	  
	  
	  displayAdmin.displaymyAdminPanel.add(label);
	  
	  
  }
  
  public void updatePanelForDisplayAdmin(JLabel label) {
	    // Find and remove the existing table component (assuming it's the only one)
	    Component[] components = getComponents();
	    for (Component component : components) {
	      if (component instanceof JLabel) {
	        remove(component);
	        break; // Assuming there is only one table component, break after removal
	      }
	    }
	   
	    myDisplayPanel.add(displayAdmin.displaymyAdminPanel);
	 //   displayAdmin.displaymyAdminPanel.setLayout(new GridLayout(0,1));
	    
	    displayAdmin.displaymyAdminPanel.add(label);
	    
	    // Repaint the visual2 panel
	    revalidate();
	    repaint();
	  }
  
  public void updatePanelForDisplayAdmin2(JLabel label) {
	    // Find and remove the existing table component (assuming it's the only one)
	    
	    myDisplayPanel.add(displayAdmin.displaymyAdminPanel);
	    displayAdmin.displaymyAdminPanel.add(label);
	    
	 
	  }

  public static void main(String[] args) {
    new GeneralSettings2();
  }
}
