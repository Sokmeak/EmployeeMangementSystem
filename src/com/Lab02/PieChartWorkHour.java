package com.Lab02;



import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

class PieChartWorkHour extends JPanel {

  public Font myFont() {
    return new Font("Times New Roman", Font.BOLD, 20);
  }

  private double fullTime;
  private double partTime;

  public  PieChartWorkHour(double fullTime, double partTime) {
	// TODO Auto-generated constructor stub}(double fullTime, double partTime) {
    this.fullTime = fullTime;
    this.partTime = partTime;
    setPreferredSize(new Dimension(200, 200)); // Set a preferred size for the panel
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawPieChart(g);
  }

  private void drawPieChart(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    int width = getWidth();
    int height = getHeight();

    int minSize = Math.min(width, height);
    int cx = (width - minSize) / 2;
    int cy = (height - minSize) / 2;
    int cx2 = width;
    int cy2 = height;

    double total = fullTime + partTime;

    double fullTimePercentage = fullTime / total;
    double partTimePercentage = partTime / total;

    double fullTimeAngle = 360.0 * fullTimePercentage;
    double partTimeAngle = 360.0 * partTimePercentage;

    g2d.setColor(Color.CYAN); // Full Time color
    g2d.fill(
      new Arc2D.Double(cx, cy, minSize, minSize, 0, fullTimeAngle, Arc2D.PIE)
    );

    g2d.setColor(Color.PINK); // Part Time color
    g2d.fill(
      new Arc2D.Double(
        cx,
        cy,
        minSize,
        minSize,
        fullTimeAngle,
        partTimeAngle,
        Arc2D.PIE
      )
    );

    // Draw percentage labels
    drawLabel(
      g2d,
      "Full Time: " + formatPercentage(fullTimePercentage),
      cx,
      cy,
      40
    );
    drawLabel(
      g2d,
      "Part Time: " + formatPercentage(partTimePercentage),
      cx2 / 2,
      cy2 / 2,
      120
    );
  }

  private void drawLabel(
    Graphics2D g2d,
    String label,
    int cx,
    int cy,
    double angle
  ) {
    g2d.setColor(Color.BLACK);
    g2d.setFont(myFont());

    // Calculate label position
    int labelX = (int) (cx + Math.cos(Math.toRadians(angle)) * getWidth() / 4);
    int labelY = (int) (cy + Math.sin(Math.toRadians(angle)) * getHeight() / 4);

    // Draw label
    g2d.drawString(label, labelX, labelY);
  }

  private int ConvertToWholeNumber(double num) {
    if (num % 1 == 0) {
      return (int) num;
    } else {
      int wholePart = (int) (num / 1);
      double fractionPart = num % 1;

      if (fractionPart >= 0.5) {
        return (int) (wholePart + 1);
      } else {
        return (int) wholePart;
      }
    }
  }

  private String formatPercentage(double percentage) {
    System.out.println(percentage);
    percentage = percentage * 100;
    int per = ConvertToWholeNumber(percentage);

    String formattedNum = String.valueOf(per);
    System.out.println(formattedNum);
    return formattedNum + " %";
  }

  public static void main(String[] args) {
	  new PieChartWorkHour(ALLBITS, ABORT);
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Test Pie Chart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(250, 250);

      double fullTime = 50;
      double partTime = 60;

      PieChartWorkHour labeledWorkTypePieChart = new PieChartWorkHour(
        fullTime,
        partTime
      );
      frame.add(labeledWorkTypePieChart);

      frame.setVisible(true);
    });
  }
}

