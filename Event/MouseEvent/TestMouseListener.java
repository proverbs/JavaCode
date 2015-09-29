/**
 * @(#)TestMouseListener.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/30
 * ����MouseListener��MouseEvent
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
    			 *��갴��
    			 **/
    			public void mousePressed(MouseEvent e) {
    				System.out.println("Mouse Press");
    			}
    			/*
    			 *����ͷ�
    			 **/
    			public void mouseReleased(MouseEvent e) {
    				System.out.println("Mouse Release");
    			}
    			/*
    			 *�������press+release��
    			 **/
    			public void mouseClicked(MouseEvent e) {
    				System.out.println("Mouse Click");
    				/*
    				 *��¼�����������
    				 **/
    				System.out.println("���������Ϊ��" + e.getClickCount());
    				/*
    				 *ͬ����shiftdown��altdown
    				 *��Щ������MouseEvent��InputEvent��̳е�
    				 **/
    				System.out.println("Ctrl�Ƿ��£�" + e.isControlDown());
    			}
    			/*
    			 *������������Χ
    			 **/
    			public void mouseEntered(MouseEvent e) {
    				System.out.println("Component Enter");
    			}
    			/*
    			 *����Ƴ������Χ
    			 **/
    			public void mouseExited(MouseEvent e) {
    				System.out.println("Component Exit");
    			}
    		}
    		);
    	}
    }
}