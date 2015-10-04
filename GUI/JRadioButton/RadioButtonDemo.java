/**
 * @(#)RadioButtonDemo.java
 *
 *
 * @author 
 * @version 1.00 2015/10/4
 * 测试JRadioButton，单选按钮
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame {
	/*
	 *初始化的true或false是不触发ActionListener的
	 **/
	private JRadioButton jrbRed = new JRadioButton("Red", true);
	private JRadioButton jrbGreen = new JRadioButton("Green", false);
	private JRadioButton jrbBlue = new JRadioButton("Blue", false);
	
	private JCheckBox jcbCentered = new JCheckBox("Centered", false);
	private JCheckBox jcbBold = new JCheckBox("Bold", false);
	private JCheckBox jcbItalic = new JCheckBox("Italic", false);
	
	private JButton jbLeft = new JButton("Left");
	private JButton jbRight = new JButton("Right");
	
	private MessagePanel messagePanel = new MessagePanel("Welcome to Java");

    public RadioButtonDemo() {
    	setLayout(new BorderLayout());
    	JPanel pWest = new JPanel(new GridLayout(3, 1));
    	JPanel pEast = new JPanel(new GridLayout(3, 1));
    	JPanel pSouth = new JPanel(new FlowLayout());
    	
    	pWest.add(jrbRed);
    	pWest.add(jrbGreen);
    	pWest.add(jrbBlue);
    	
    	jrbRed.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.setForeground(Color.RED);
    		}
    	}
    	);
    	jrbGreen.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.setForeground(Color.GREEN);
    		}
    	}
    	);
    	jrbBlue.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.setForeground(Color.BLUE);
    		}
    	}
    	);
    	
    	/*
    	 *将三个JRadioButton放在一个ButtonGroup中才能使三个按钮相互关联
    	 *即只能三选一
    	 **/
    	ButtonGroup group = new ButtonGroup();
    	group.add(jrbRed);
    	group.add(jrbGreen);
    	group.add(jrbBlue);
    	
    	pEast.add(jcbCentered);
    	pEast.add(jcbBold);
    	pEast.add(jcbItalic);
    	
    	pSouth.add(jbLeft);
    	pSouth.add(jbRight);
    	
    	add(pEast, BorderLayout.EAST);
    	add(pWest, BorderLayout.WEST);
    	add(pSouth, BorderLayout.SOUTH);
    	add(messagePanel, BorderLayout.CENTER);
    	
    	jbLeft.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.moveLeft();
    		}
    	}
    	);
    	jbRight.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.moveRight();
    		}
    	}
    	);
    	
    	jcbCentered.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			JCheckBox t = (JCheckBox)e.getSource();
    			messagePanel.setCentered(t.isSelected());
    		}
    	}
    	);
    	jcbBold.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			JCheckBox t = (JCheckBox)e.getSource();
    			messagePanel.setBold(t.isSelected());
    		}
    	}
    	);
    	jcbItalic.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			JCheckBox t = (JCheckBox)e.getSource();
    			messagePanel.setItalic(t.isSelected());
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new RadioButtonDemo();
    	frame.setTitle("RadioButton Demo");
    	frame.setSize(500, 200);
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