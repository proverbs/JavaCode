/**
 * @(#)TestWindowAdapter.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/29
 * ����WindowAdapter�����������пյĺ���ʵ��
 * ֻ����д��Ҫ�ĺ������ɣ���WindowListener��Ϊ����
 * ����������Ҫע����д�еĴ���
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestWindowAdapter extends JFrame {

    public TestWindowAdapter() {
    	addWindowListener(new WindowAdapter() {
    		public void windowActivated(WindowEvent e) {
    			System.out.println("Window Activated");
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestWindowAdapter();
    	frame.setSize(220, 80);
    	frame.setTitle("Test Window Adapter");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}