/**
 * @(#)TestMouseListener.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/30
 * 测试MouseListener和MouseEvent
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestMouseListener extends JFrame {

    public TestMouseListener() {
    	JPanel p = new MouseListnerPanel();
    	p.add(new JButton("Test Enter"));
    	add(p);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestMouseListener();
    	frame.setTitle("Test Mouse Listener");
    	frame.setSize(300, 200);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
    
    class MouseListnerPanel extends JPanel {
    	public MouseListnerPanel() {
    		addMouseListener(new MouseListener() {
    			/*
    			 *鼠标按下
    			 **/
    			public void mousePressed(MouseEvent e) {
    				System.out.println("Mouse Press");
    			}
    			/*
    			 *鼠标释放
    			 **/
    			public void mouseReleased(MouseEvent e) {
    				System.out.println("Mouse Release");
    			}
    			/*
    			 *鼠标点击（press+release）
    			 **/
    			public void mouseClicked(MouseEvent e) {
    				System.out.println("Mouse Click");
    				/*
    				 *记录连续点击次数
    				 **/
    				System.out.println("鼠标点击次数为：" + e.getClickCount());
    				/*
    				 *同理还有shiftdown、altdown
    				 *这些函数是MouseEvent从InputEvent类继承的
    				 **/
    				System.out.println("Ctrl是否按下：" + e.isControlDown());
    			}
    			/*
    			 *鼠标移入组件范围
    			 **/
    			public void mouseEntered(MouseEvent e) {
    				System.out.println("Component Enter");
    			}
    			/*
    			 *鼠标移除组件范围
    			 **/
    			public void mouseExited(MouseEvent e) {
    				System.out.println("Component Exit");
    			}
    		}
    		);
    	}
    }
}