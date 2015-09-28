/**
 * @(#)DrawArcs.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/25
 * ��Բ��������
 */

import java.awt.*;
import javax.swing.*;

public class DrawArcs extends JFrame {

    public DrawArcs() {
    	setTitle("Draw Arcs");
    	add(new ArcsPanel());
    }
    
    public static void main(String[] args) {
    	DrawArcs frame = new DrawArcs();
    	frame.setSize(250, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class ArcsPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setForeground(Color.GREEN);
		//g.setColor(Color.GREEN);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		int x = xCenter - radius;
		int y = yCenter - radius;
		/*
		 *��������ֱ�Ϊ��
		 *���Ͻ�x���꣬���Ͻ�y���꣬���᳤�����᳤����ʼ�Ƕȣ��Ƕȿ��
		 **/
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
		g.drawArc(x, y, 2 * radius, 2 * radius, 180, 30);
		g.drawArc(x, y, 2 * radius, 2 * radius, 270, 30);
	}
}