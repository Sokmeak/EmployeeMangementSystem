package com.System_Operations;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

//This is flexible one
// when want to create for gender or work hour

class PieChartSample extends JPanel {
  private Color myColor() {
	return new Color(109, 195, 205);
	  }
  public Font myFont() {
    return new Font("Times New Roman", Font.BOLD, 18);
  }

  private double value1;
  private double value2;
  private String label1;
  private String label2;

  public PieChartSample() {
    // default
  }

  public PieChartSample(
    double value1,
    double value2,
    String label1,
    String label2
  ) {
    this.value1 = value1;
    this.value2 = value2;
    this.label1 = label1;
    this.label2 = label2;
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

    double total = value1 + value2;

    double value1Percentage = value1 / total;
    double value2Percentage = value2 / total;

    double value1Angle = 360.0 * value1Percentage;
    double value2Angle = 360.0 * value2Percentage;

    g2d.setColor(myColor());
    g2d.fill(
      new Arc2D.Double(cx, cy, minSize, minSize, 0, value1Angle, Arc2D.PIE)
    );

    g2d.setColor(Color.PINK);
    g2d.fill(
      new Arc2D.Double(
        cx,
        cy,
        minSize,
        minSize,
        value1Angle,
        value2Angle,
        Arc2D.PIE
      )
    );

    // Draw percentage labels
    drawLabel(
      g2d,
      label1 + ": " + formatPercentage(value1Percentage),
      cx,
      cy,
      40
    );
    drawLabel(
      g2d,
      label2 + ": " + formatPercentage(value2Percentage),
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
    //System.out.println(percentage);
    percentage = percentage * 100;
    int per = ConvertToWholeNumber(percentage);

    String formattedNum = String.valueOf(per);
    //System.out.println(formattedNum);
    return formattedNum + " %";
  }

  
}
