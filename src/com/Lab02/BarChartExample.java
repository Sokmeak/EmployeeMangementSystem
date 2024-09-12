package com.Lab02;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

class BarChartExample extends JFrame {

  private Map<String, Integer> data;

  public BarChartExample(Map<String, Integer> data) {
    this.data = data;

    setTitle("Bar Chart Example");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    BarChartPanel barChartPanel = new BarChartPanel();
    add(barChartPanel);

    setVisible(true);
  }

  class BarChartPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      drawBarChart(g);
    }

    private void drawBarChart(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      int barWidth = 30;
      int x = 50;
      int y = 50;

      for (Map.Entry<String, Integer> entry : data.entrySet()) {
        String label = entry.getKey();
        int value = entry.getValue();

        // Calculate the bar height based on the data value
        int barHeight = value * 5;

        // Draw the bar
        g2d.setColor(Color.BLUE);
        g2d.fillRect(x, getHeight() - barHeight, barWidth, barHeight);

        // Draw the label below the bar
        g2d.setColor(Color.BLACK);
        g2d.drawString(label, x, getHeight() + 15);

        // Move to the next bar position
        x += barWidth + 20;
      }
    }
  }

  public static void main(String[] args) {
    Map<String, Integer> data = new HashMap<>();
    data.put("Category1", 20);
    data.put("Category2", 50);
    data.put("Category3", 30);

    SwingUtilities.invokeLater(() -> new BarChartExample(data));
  }
}
