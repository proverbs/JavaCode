/**
 * @(#)TestImageIcon.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * 测试ImageIcon的使用
 */


import java.awt.*;
import javax.swing.*;

public class TestImageIcon extends JFrame {
	/*
	 *ImageIcon的创建
	 *ImageIcon可以随着组件的大小变化而变化
	 **/
	private ImageIcon girl = new ImageIcon("image/girl.gif");
    private ImageIcon head = new ImageIcon("image/head.gif");
    
    public TestImageIcon() {
    	/*
    	 *JFrame默认的LayoutManager是GridLayout
    	 **/
    	setLayout(new GridLayout(2, 1, 5, 5));
    	/*
    	 *ImageIcon可以通过JButton和JLabel创建
    	 **/
    	add(new JButton(girl));
    	add(new JLabel(head));
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestImageIcon();
    	frame.setTitle("Test ImageIcon");
    	frame.setSize(500, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}