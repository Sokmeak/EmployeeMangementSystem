package com.Lab01;

import java.awt.*;
import javax.swing.*;

public class DemoDialog extends JDialog {

  public DemoDialog(
    JFrame parent,
    String message,
    String title,
    int messageType
  ) {
    super(parent, title, true);
    JLabel label = new JLabel(message);
    label.setFont(new Font("Times New Roman", Font.PLAIN, 14));

    JPanel panel = new JPanel(new FlowLayout());
    panel.add(label);

    getContentPane().add(panel, BorderLayout.CENTER);

    JButton closeButton = new JButton("OK");
    closeButton.setBackground(Color.CYAN);
    closeButton.addActionListener(e -> dispose());

    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.YELLOW);
    buttonPanel.add(closeButton);

    getContentPane().add(buttonPanel, BorderLayout.SOUTH);

    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setSize(300, 150);
    setLocationRelativeTo(parent);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Custom Message Dialog Example");
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JButton showDialogButton = new JButton("Show Custom Dialog");
      showDialogButton.addActionListener(e -> {
        DemoDialog dialog = new DemoDialog(
          frame,
          "Duplicate id of employee",
          "Notification",
          JOptionPane.ERROR_MESSAGE
        );
        dialog.setVisible(true);
      });

      frame.getContentPane().add(showDialogButton, BorderLayout.CENTER);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    });
  }
}
