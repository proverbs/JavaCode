/**
 * @(#)TestWindowEvent.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/29
 * 测试窗口事件
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestWindowEvent extends JFrame {

    public TestWindowEvent() {
    	addWindowListener(new WindowListener() {
    		/*
    		 *窗口从最小化状态到正常状态（窗口还原）
    		 **/
    		public void windowDeiconified(WindowEvent e) {
    			System.out.println("Window Deiconified");
    		}
    		/*
    		 *窗口从正常状态到最小化状态（窗口最小化）
    		 **/
    		public void windowIconified(WindowEvent e) {
    			System.out.println("Window Iconified");
    		}
    		/*
    		 *窗口变为活动窗口（可输入状态）
    		 **/
    		public void windowActivated(WindowEvent e) {
    			System.out.println("Window Activated");
    		}
    		/*
    		 *窗口变为非活动窗口
    		 **/
    		public void windowDeactivated(WindowEvent e) {
    			System.out.println("Window Deactivated");
    		}
    		/*
    		 *窗口被打开
    		 **/
    		public void windowOpened(WindowEvent e) {
    			System.out.println("Window Opened");
    		}
    		/*
    		 *窗口正在被关闭
    		 **/
    		public void windowClosing(WindowEvent e) {
    			System.out.println("Window Closing");
    		}
    		/*
    		 *窗口已被关闭
    		 **/
    		public void windowClosed(WindowEvent e) {
    			System.out.println("Window Closed");
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestWindowEvent();
    	frame.setSize(300, 200);
    	frame.setTitle("Test Window Event");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}