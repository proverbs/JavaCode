/**
 * @(#)TestSwingCommonFeature.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * ̽��Swing����Ĺ�ͬ����
 */


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TestSwingCommonFeature extends JFrame {

    public TestSwingCommonFeature() {
    	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
    	JButton jbtLeft = new JButton("Left");
    	JButton jbtCenter = new JButton("Center");
    	JButton jbtRight = new JButton("Right");
    	/*
    	 *���ñ���ɫ
    	 **/
    	jbtLeft.setBackground(Color.WHITE);
    	jbtCenter.setBackground(Color.GREEN);
    	/*
    	 *��������ڰ�ť֮��ʱ����ʾ
    	 **/
    	jbtRight.setToolTipText("This is the Right button");
    	
    	p1.add(jbtLeft);
    	p1.add(jbtCenter);
    	p1.add(jbtRight);
    	/*
    	 *���ñ߽磺����߽磨��Ŀ��
    	 **/
    	p1.setBorder(new TitledBorder("Three Buttons"));
    	
    	Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
    	/*
    	 *�����߽磺�߽߱磨��ɫ����ȣ�
    	 **/
    	Border lineBorder = new LineBorder(Color.BLACK, 2);
    	
    	JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
    	JLabel jlbRed = new JLabel("Red");
    	JLabel jlbOrange = new JLabel("Orange");
    	/*
    	 *����ǰ��ɫ
    	 **/
    	jlbRed.setForeground(Color.RED);
    	jlbOrange.setForeground(Color.ORANGE);
    	jlbRed.setFont(largeFont);
    	jlbOrange.setFont(largeFont);
    	
    	jlbRed.setBorder(lineBorder);
    	jlbOrange.setBorder(lineBorder);
    	
    	p2.add(jlbRed);
    	p2.add(jlbOrange);
    	
    	p2.setBorder(new TitledBorder("Two Labels"));
    	
    	setLayout(new GridLayout(2, 1, 5, 5));
    	add(p1);
    	add(p2);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestSwingCommonFeature();
    	frame.setTitle("Test Swing Common Freature");
    	frame.setSize(300, 150);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}