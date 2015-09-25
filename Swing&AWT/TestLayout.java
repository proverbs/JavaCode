/**
 * @(#)TestLayout.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * 测试三种不同给的LayoutManager
 */

import java.awt.*;
import javax.swing.*;

public class TestLayout extends JFrame {
	/*
	 *JFrame的默认布局是GridLayout
	 *JPanel的默认布局是FlowLayout
	 **/
    public TestLayout() {
    	/*
    	 *设置GirdLayout（行，列，行间隔，列间隔）
    	 **/
    	setLayout(new GridLayout(2, 1, 5, 5));
    	/*
    	 *创建一个FlowLayout（对齐方式，行间隔，列间隔）
    	 **/
    	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
    	/*
    	 *创建一个BorderLayout（行间隔，列间隔）
    	 *add方法具有特殊性
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