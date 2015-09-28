/**
 * @(#)TestMessagePanel.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * 测试字体，学习事件后可以改进为自定义调整字体
 */

import java.awt.*;
import javax.swing.*;

public class TestMessagePanel extends JFrame {

    public TestMessagePanel() {
    	MessagePanel mp1 = new MessagePanel("Welcome to java");
    	MessagePanel mp2 = new MessagePanel("Java is fun");
    	MessagePanel mp3 = new MessagePanel("java is cool");
    	MessagePanel mp4 = new MessagePanel("I love java");
    	
    	GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	String[] fontnames = e.getAvailableFontFamilyNames();
    	
    	mp1.setFont(new Font(fontnames[5], Font.ITALIC, 20));
    	mp2.setFont(new Font(fontnames[2], Font.BOLD, 20));
    	mp3.setFont(new Font(fontnames[3], Font.PLAIN, 20));
    	mp3.setFont(new Font(fontnames[4], Font.ITALIC + Font.BOLD, 20));
    	
    	mp1.setBackground(Color.RED);
    	mp2.setBackground(Color.CYAN);
    	mp3.setBackground(Color.GREEN);
    	mp4.setBackground(Color.WHITE);
    	
    	setLayout(new GridLayout(2, 2, 5, 5));
    	
    	add(mp1);
    	add(mp2);
    	add(mp3);
    	add(mp4);
    }
    
    public static void main(String[] args) {
    	TestMessagePanel frame = new TestMessagePanel();
    	frame.setTitle("Test Message Panel");
    	frame.setSize(300, 200);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class MessagePanel extends JPanel {
	private String message = "Welcome to Java";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered = true;
	private int interval = 10;
	
	public MessagePanel(String s) {
		message = s;
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
	
	public boolean setCentered() {
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
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
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