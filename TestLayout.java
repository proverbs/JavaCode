/**
 * @(#)TestLayout.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * �������ֲ�ͬ����LayoutManager
 */

import java.awt.*;
import javax.swing.*;

public class TestLayout extends JFrame {
	/*
	 *JFrame��Ĭ�ϲ�����GridLayout
	 *JPanel��Ĭ�ϲ�����FlowLayout
	 **/
    public TestLayout() {
    	/*
    	 *����GirdLayout���У��У��м�����м����
    	 **/
    	setLayout(new GridLayout(2, 1, 5, 5));
    	/*
    	 *����һ��FlowLayout�����뷽ʽ���м�����м����
    	 **/
    	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
    	/*
    	 *����һ��BorderLayout���м�����м����
    	 *add��������������
    	 **/
    	JPanel p2 = new JPanel(new BorderLayout(5, 5));
    	
    	for (int i = 0; i < 7; i++) {
    		p1.add(new JButton("" + i));
    	}
    	
    	p2.add(new JButton("" + 1), BorderLayout.EAST);
    	p2.add(new JButton("" + 2), BorderLayout.WEST);
    	p2.add(new JButton("" + 3), BorderLayout.NORTH);
    	p2.add(new JButton("" + 4), BorderLayout.SOUTH);
    	p2.add(new JButton("" + 5), BorderLayout.CENTER);
    	
    	add(p1);
    	add(p2);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestLayout();
    	frame.setTitle("Test Layout");
    	frame.setSize(500, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}