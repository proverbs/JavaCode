/**
 * @(#)CheckBoxDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/1
 * 一个CheckBox的Demo
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class CheckBoxDemo extends JFrame {

	private MessagePanel messagePanel = new MessagePanel("Welcone to Java");
	private JButton jbtLeft = new JButton("Left");
	private JButton jbtRight = new JButton("Right");
	private JCheckBox jcbCenter = new JCheckBox("Centered");
	private JCheckBox jcbBold = new JCheckBox("Bold");
	private JCheckBox jcbItalic = new JCheckBox("Italic");
	
    public CheckBoxDemo() {
    	setLayout(new BorderLayout(5, 5));
    	JPanel pSouth = new JPanel();
    	JPanel pEast = new JPanel(new GridLayout(3, 1));
    	/*
    	 *设置边框（带标题边框javax.swing.border.*;）
    	 **/
    	pEast.setBorder(new TitledBorder("Adjust"));
    	jcbCenter.setForeground(Color.RED);
    	
    	pSouth.add(jbtLeft);
    	pSouth.add(jbtRight);
    	
    	pEast.add(jcbCenter);
    	pEast.add(jcbBold);
    	pEast.add(jcbItalic);
    	
    	add(pSouth, BorderLayout.SOUTH);
    	add(pEast, BorderLayout.EAST);
    	add(messagePanel, BorderLayout.CENTER);
    	
    	jbtLeft.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.moveLeft();
    		}
    	}
    	);
    	jbtRight.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			messagePanel.moveRight();
    		}
    	}
    	);
    	
    	jcbCenter.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			JCheckBox t = (JCheckBox)e.getSource();
    			/*
    			 *isSelected判断是否chekcbox被勾选
    			 **/
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
    	JFrame frame = new CheckBoxDemo();
    	frame.setTitle("A CheckBox Demo");
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