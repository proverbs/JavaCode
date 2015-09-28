/**
 * @(#)TestFontMetrics.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * 在JPanel上绘制字符串，并控制居中
 */

import java.awt.*;
import javax.swing.*;

public class TestFontMetrics extends JFrame {

    public TestFontMetrics() {
    	add(new FontMetricsPanel());	
    }
    
    public static void main(String[] args) {
    	TestFontMetrics frame = new TestFontMetrics();
    	frame.setTitle("Test Font Metrics");
    	frame.setSize(500, 150); 
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class FontMetricsPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*
		 *FontMetrics类中包含Ascent,Descent,leading等参数
		 **/
		FontMetrics fm = g.getFontMetrics();
		/*
		 *可以利用当前字体计算字符串的长度
		 **/
		int stringWidth = fm.stringWidth("Proverbs Java Code");
		int stringAscent = fm.getAscent();
		
		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;
		/*
		 *参数：
		 *字符串，最左侧字符的x坐标，最左侧字符基线的y坐标*/
		g.drawString("Proverbs Java Code", xCoordinate, yCoordinate);
	}
}