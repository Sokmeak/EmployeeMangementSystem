package com.Lab02;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

class PieChatDemo extends JPanel {

  public Font myFont() {
    return new Font("Times New Roman", Font.BOLD, 20);
  }

  private double females;
  private double males;

  public PieChatDemo(double females, double males) {
    this.females = females;
    this.males = males;
    setPreferredSize(new Dimension(200, 200)); // Set a preferred size for the panel
  }

  public PieChatDemo() {
    // default
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
//    int width = 100;
//    int height = 200;
    
    int minSize = Math.min(width, height);
    int cx = (width - minSize) / 2;
    int cy = (height - minSize) / 2;
    int cx2 = width;
    int cy2 = height;

    // System.out.println(cx2);

    // int cx2 = 300;
    // int cy2 = 300;

    double total = females + males;
    // find percentage for each

    //make sure that the percentage is the whole number
    //double test = females / total;

    double femalePercentage = (females / total);
    //  double femalePercentage = ConvertToWholeNumber(femalePercentage_pre);
    //System.out.println(femalePercentage);

    //System.out.println(femalePercentage);

    double malePercentage = males / total;
    // System.out.println(malePercentage);

    double femaleAngle = 360.0 * femalePercentage;
    double maleAngle = 360.0 * malePercentage;

    g2d.setColor(Color.PINK);
    g2d.fill(
      new Arc2D.Double(cx, cy, minSize, minSize, 0, femaleAngle, Arc2D.PIE)
    );

    g2d.setColor(Color.CYAN);
    g2d.fill(
      new Arc2D.Double(
        cx,
        cy,
        minSize,
        minSize,
        femaleAngle,
        maleAngle,
        Arc2D.PIE
      )
    );

    // Draw percentage labels
    drawLabel(g2d, "Female: " + formatPercentage(femalePercentage), cx, cy, 40);
    drawLabel(
      g2d,
      "Male: " + formatPercentage(malePercentage),
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

    // Adjust label position to avoid overlap
    // int labelWidth = g2d.getFontMetrics().stringWidth(label);
    // if (angle > 90 && angle < 270) {
    //   labelX -= labelWidth;
    // }

    // Draw label
    g2d.drawString(label, labelX, labelY);
  }

  private int ConvertToWholeNumber(double num) {
    if (num % 1 == 0) {
      return (int) num;
    } else {
      //  double
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
    //DecimalFormat df = new DecimalFormat("0.00%");
    System.out.println(percentage);
    percentage = percentage * 100;
    int per = ConvertToWholeNumber(percentage);

    String formattedNum = String.valueOf(per);
    System.out.println(formattedNum);
    return formattedNum + " %";
    //return df.format(percentage);
    // // double formatNum = df.format(percentage);
    // double WholePercentage = ConvertToWholeNumber(percentage);
    // String per = (df.format(WholePercentage));
    // return per;
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("test Pie Chart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(250, 250);

      //String myString = "Hello";

      double females = 50;
      double males = 60;

      PieChatDemo labeledGenderPieChart = new PieChatDemo(females, males);
      frame.add(labeledGenderPieChart);

      frame.setVisible(true);
    });
  }
}
