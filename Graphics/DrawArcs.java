/**
 * @(#)DrawArcs.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/25
 * 画圆弧、扇形
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
		 *参数含义分别为：
		 *左上角x坐标，左上角y坐标，长轴长，短轴长，起始角度，角度跨度
		 **/
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
		g.drawArc(x, y, 2 * radius, 2 * radius, 180, 30);
		g.drawArc(x, y, 2 * radius, 2 * radius, 270, 30);
	}
}