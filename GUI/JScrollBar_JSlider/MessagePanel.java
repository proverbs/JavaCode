/**
 * @(#)MessagePanel.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * MessagePanel作为其他测试程序的组件
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessagePanel extends JPanel {
	private String message = "Welcome to Java";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered = false;
	private int interval = 10;
	private boolean fontBold = false;
	private boolean fontItalic = false;
	
	public MessagePanel(String s) {
		message = s;
		setForeground(Color.RED);
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String s) {
		message = s;
		repaint();
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public void setXCoordinate(int x) {
		xCoordinate = x;
		repaint();
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	public void setYCoordinate(int y) {
		yCoordinate = y;
		repaint();
	}
	
	public boolean getCentered() {
		return centered;
	}
	
	public void setCentered(boolean c) {
		centered = c;
		repaint();
	}
	
	public int getInterval() {
		return interval;
	}
	
	public void setInterval(int i) {
		interval = i;
		repaint();
	}
	
	public void setBold(boolean c) {
		fontBold = c;
		repaint();
	}
	
	public void setItalic(boolean c) {
		fontItalic = c;
		repaint();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*
		 *获取组件的字体
		 **/
		Font ft = g.getFont();
		int style = 0;
		if (fontBold == true) style += Font.BOLD;
		if (fontItalic == true) style += Font.ITALIC;
		/*
		 *从某特定字体派生出新字体，新字体具有新的style
		 **/
		setFont(ft.deriveFont(style));
		if (centered) {
			FontMetrics fm = g.getFontMetrics();
			int stringWidth = fm.stringWidth(message);
			int stringAscent = fm.getAscent();
			xCoordinate = getWidth() / 2 - stringWidth / 2;
			yCoordinate = getHeight() / 2 + stringAscent / 2;
		}
		g.drawString(message, xCoordinate, yCoordinate);
	}
	
	public void moveLeft() {
		xCoordinate -= interval;
		repaint();
	}
	
	public void moveRight() {
		xCoordinate += interval;
		repaint();
	}
	
	public void moveUp() {
		yCoordinate -= interval;
		repaint();
	}
	
	public void moveDown() {
		yCoordinate += interval;
		repaint();
	}
}