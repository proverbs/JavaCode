/**
 * @(#)TestJLabel.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/4
 * ����JLabel
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestJLabel extends JFrame {

    public TestJLabel() {
    	ImageIcon image = new ImageIcon("image/thanks.gif");
    	JPanel p = new JPanel();
    	JLabel jl1 = new JLabel("Text Label");
    	/*
    	 *����ͬʱ�����ı���ͼƬ��JLabel
    	 **/
    	JLabel jl2 = new JLabel("wire", image, SwingConstants.CENTER);
    	/*
    	 *�����ı���λ�ã�ˮƽλ��+��ֱλ�ã�
    	 **/
    	jl2.setHorizontalTextPosition(SwingConstants.CENTER);
    	jl2.setVerticalTextPosition(SwingConstants.BOTTOM);
    	p.add(jl1);
    	p.add(jl2);
    	add(p);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestJLabel();
    	frame.setTitle("Test JLabel");
    	frame.setSize(500, 300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}