/**
 * @(#)TestFontMetrics.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * ��JPanel�ϻ����ַ����������ƾ���
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
		 *FontMetrics���а���Ascent,Descent,leading�Ȳ���
		 **/
		FontMetrics fm = g.getFontMetrics();
		/*
		 *�������õ�ǰ��������ַ����ĳ���
		 **/
		int stringWidth = fm.stringWidth("Proverbs Java Code");
		int stringAscent = fm.getAscent();
		
		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;
		/*
		 *������
		 *�ַ�����������ַ���x���꣬������ַ����ߵ�y����*/
		g.drawString("Proverbs Java Code", xCoordinate, yCoordinate);
	}
}