/**
 * @(#)MouseMessageDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/30
 * 实现一个鼠标跟随的字符串
 * 此程序只是测试了MouseMotionListener接口
 * 并没有测试MouseListner接口
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseMessageDemo extends JFrame {

    public MouseMessageDemo() {
    	JPanel p = new MovableMessagePanel("Proverbs Java Code");
    	setLayout(new BorderLayout());
    	add(p, BorderLayout.CENTER);
    }
    
    public static void main(String[] argss ) {
    	JFrame frame = new MouseMessageDemo();
    	frame.setTitle("A Demo About Mouse Action");
    	frame.setSize(200, 100);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
    
    static class MovableMessagePanel extends JPanel {
    	private String message;
    	private int x = 20;
    	private int y = 20;
    	
    	public MovableMessagePanel(String _message) {
    		message = _message;
    		addMouseMotionListener(new MouseMotionAdapter() {
    			public void mouseMoved(MouseEvent e) {
    				x = e.getX();
    				y = e.getY();
    				System.out.println("Move");
    				repaint();
    			}
    		}
    		);
    		
    		addMouseMotionListener(new MouseMotionAdapter() {
    			public void mouseDragged(MouseEvent e) {
    				x = e.getX();
    				y = e.getY();
    				System.out.println("Drag");
    				repaint();
    			}
    		}
    		);
    	}
    	
    	protected void paintComponent(Graphics g) {
    		super.paintComponent(g);
    		g.drawString(message, x, y);
    	}
    }
}

