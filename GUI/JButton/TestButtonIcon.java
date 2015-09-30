/**
 * @(#)TestButtonIcon.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/1
 * ����ΪJButton���ImageIcon
 */

import java.awt.*;
import javax.swing.*;

public class TestButtonIcon extends JFrame {

    public TestButtonIcon() {
    	ImageIcon icon1 = new ImageIcon("image/icon1.gif");
    	ImageIcon icon2 = new ImageIcon("image/icon2.gif");
    	ImageIcon icon3 = new ImageIcon("image/icon3.gif");
    	/*
    	 *���û����ͣ�ڰ�ť��ʱ��ͼ��
    	 **/
    	JButton jbt = new JButton("Click it", icon1);
    	/*
    	 *�����ʱ��ͼ��
    	 **/
    	jbt.setPressedIcon(icon2);
    	/*
    	 *�����ͣ��������ʱ��ͼ��
    	 **/
    	jbt.setRolloverIcon(icon3);
    	
    	add(jbt);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestButtonIcon();
    	frame.setTitle("Test Button Icon");
    	frame.setSize(500, 400);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}