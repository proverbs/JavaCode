/**
 * @(#)TestImageIcon.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * ����ImageIcon��ʹ��
 */


import java.awt.*;
import javax.swing.*;

public class TestImageIcon extends JFrame {
	/*
	 *ImageIcon�Ĵ���
	 *ImageIcon������������Ĵ�С�仯���仯
	 **/
	private ImageIcon girl = new ImageIcon("image/girl.gif");
    private ImageIcon head = new ImageIcon("image/head.gif");
    
    public TestImageIcon() {
    	/*
    	 *JFrameĬ�ϵ�LayoutManager��GridLayout
    	 **/
    	setLayout(new GridLayout(2, 1, 5, 5));
    	/*
    	 *ImageIcon����ͨ��JButton��JLabel����
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