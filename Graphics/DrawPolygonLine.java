/**
 * @(#)DrawPolygonLine.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * 绘制多边形和折线
 */

import java.awt.*;
import javax.swing.*;

public class DrawPolygonLine extends JFrame {

    public DrawPolygonLine() {
		add(new PolygonLinePanel());
    }
    
    public static void main(String[] args) {
    	DrawPolygonLine frame = new DrawPolygonLine();
    	frame.setTitle("Draw Poligon & Draw Line");
    	frame.setSize(500, 200);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class PolygonLinePanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int[] x = {40, 70, 60, 45, 20};
		int[] y = {20, 40, 80, 45, 60};
		
		Polygon p = new Polygon();
		for (int i = 0; i < x.length; i++) {
			p.addPoint(x[i] + 10, y[i] + 20);
		}
		/*
		 *Polygon的两种绘制方法
		 **/
		g.drawPolygon(p);
		g.setColor(Color.RED);
		g.drawPolygon(x, y, x.length);
		
		g.setColor(Color.BLUE);
		for (int i = 0; i < x.length; i++) {
			x[i] += 200;
			y[i] += 30;
		}
		/*
		 *折线的绘制方法，参数表同polygon
		 **/
		g.drawPolyline(x, y, x.length);
	}
}