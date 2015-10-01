/**
 * @(#)ButtonDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/1
 * 设置Button控制移动的Message
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame {

	protected MessagePanel messagePanel = new MessagePanel("Welcome to Java");
	private JButton jbtLeft = new JButton("Left");
	private JButton jbtMid = new JButton("Mid");
	private JButton jbtRight = new JButton("Right");
	
    public ButtonDemo() {
    	messagePanel.setBackground(Color.WHITE);
    	JPanel p = new JPanel();
    	p.add(jbtLeft);
    	p.add(jbtMid);
    	p.add(jbtRight);
    	/*
    	 *设置alt+VK键控制Button点击
    	 **/
    	jbtLeft.setMnemonic(KeyEvent.VK_L);
    	jbtMid.setMnemonic(KeyEvent.VK_M);
    	jbtRight.setMnemonic(KeyEvent.VK_R);
    	/*
    	 *设置鼠标悬停提示
    	 **/
    	jbtLeft.setToolTipText("Move Message To Left");
    	jbtMid.setToolTipText("Center Message");
    	jbtRight.setToolTipText("Move Message To Right");
    	
    	setLayout(new BorderLayout());
    	add(messagePanel, BorderLayout.CENTER);
    	add(p, BorderLayout.SOUTH);
    	
    	jbtLeft.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.moveLeft();
    		}
    	}
    	);
    	
    	jbtMid.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.setCentered(true);
    		}
    	}
    	);
    	
    	jbtRight.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.moveRight();
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new ButtonDemo();
    	frame.setTitle("A Button Demo");
    	frame.setSize(250, 100);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class MessagePanel extends JPanel {
	private String message = "Welcome to Java";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered = false;
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
		centered = false;
		xCoordinate -= interval;
		repaint();
	}
	
	public void moveRight() {
		centered = false;
		xCoordinate += interval;
		repaint();
	}
	
	public void moveUp() {
		centered = false;
		yCoordinate -= interval;
		repaint();
	}
	
	public void moveDown() {
		centered = false;
		yCoordinate += interval;
		repaint();
	}
}