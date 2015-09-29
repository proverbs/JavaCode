/**
 * @(#)TestWindowEvent.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/29
 * ���Դ����¼�
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestWindowEvent extends JFrame {

    public TestWindowEvent() {
    	addWindowListener(new WindowListener() {
    		/*
    		 *���ڴ���С��״̬������״̬�����ڻ�ԭ��
    		 **/
    		public void windowDeiconified(WindowEvent e) {
    			System.out.println("Window Deiconified");
    		}
    		/*
    		 *���ڴ�����״̬����С��״̬��������С����
    		 **/
    		public void windowIconified(WindowEvent e) {
    			System.out.println("Window Iconified");
    		}
    		/*
    		 *���ڱ�Ϊ����ڣ�������״̬��
    		 **/
    		public void windowActivated(WindowEvent e) {
    			System.out.println("Window Activated");
    		}
    		/*
    		 *���ڱ�Ϊ�ǻ����
    		 **/
    		public void windowDeactivated(WindowEvent e) {
    			System.out.println("Window Deactivated");
    		}
    		/*
    		 *���ڱ���
    		 **/
    		public void windowOpened(WindowEvent e) {
    			System.out.println("Window Opened");
    		}
    		/*
    		 *�������ڱ��ر�
    		 **/
    		public void windowClosing(WindowEvent e) {
    			System.out.println("Window Closing");
    		}
    		/*
    		 *�����ѱ��ر�
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