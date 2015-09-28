/**
 * @(#)ControlCircle.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * һ��ͨ����ť���ƻ���Բ��С�ĳ���
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlCircle extends JFrame {
	
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	
    public ControlCircle() {
    	JPanel p = new JPanel();
    	p.add(jbtEnlarge);
    	p.add(jbtShrink);
    	
    	this.add(canvas, BorderLayout.CENTER);
    	this.add(p, BorderLayout.SOUTH);
    	/*
    	 *Button�ļ�����
    	 *��Ӽ�����
    	 **/
    	jbtEnlarge.addActionListener(new EnlargeListener());
    	jbtShrink.addActionListener(new ShrinkListener());
    }
    
    public static void main(String[] args) {
    	JFrame frame = new ControlCircle();
    	frame.setTitle("A Circle Control Panel");
    	frame.setSize(200, 200);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
    /*
     *ʹ���ڲ�����Է��ʵ��ⲿ���˽�г�Ա
     *������һ��ʹ���ڲ���������ڲ���
     **/
    private class EnlargeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			canvas.enlarge();
		}
	}
	    
	private class ShrinkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			canvas.shrink();
		}
	}
}

class CirclePanel extends JPanel {
	
	private int radius = 20;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}
	
	public void enlarge() {
    	radius += 2;
    	repaint();
    }
    
    public void shrink() {
    	radius -= 2;
    	repaint();
    }
}