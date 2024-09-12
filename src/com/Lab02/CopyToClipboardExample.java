package com.Lab02;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CopyToClipboardExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Copy to Clipboard Example");
    JTextField textField = new JTextField("hello");
    JButton copyButton = new JButton("Copy to Clipboard");

    copyButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String originalValue = textField.getText();

          // Create a StringSelection object
          StringSelection stringSelection = new StringSelection(originalValue);

          // Get the system clipboard
          Clipboard clipboard = Toolkit
            .getDefaultToolkit()
            .getSystemClipboard();

          // Set the contents of the clipboard to the StringSelection
          clipboard.setContents(stringSelection, null);

          System.out.println("Copied to Clipboard: " + originalValue);
        }
      }
    );

    frame.setLayout(null);

    textField.setBounds(20, 20, 150, 30);
    copyButton.setBounds(180, 20, 150, 30);

    frame.add(textField);
    frame.add(copyButton);

    frame.setSize(350, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
