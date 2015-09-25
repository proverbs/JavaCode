/**
 * @(#)TestPaintComponent.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/25
 * ����Graphics�Ļ�������
 */

import java.awt.*;
import javax.swing.*;

public class TestPaintComponent extends JFrame {

    public TestPaintComponent() {
    	add(new TestPaintComponentPanel());
    }
    
    public static void main(String[] args) {
    	TestPaintComponent frame = new TestPaintComponent();
    	frame.setTitle("Test Paint Component");
    	frame.setSize(200, 100);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class TestPaintComponentPanel extends JPanel {
	protected void paintComponent(Graphics  g) {
		/*
		 *��Ҫ�ȵ���ԭ����
		 *Ϊ������׼��
		 **/
		super.paintComponent(g);
		/*
		 *�Ƚ�g��ԭ�����洢����
		 *��������ʱ��Ҫ��ԭ
		 **/
		Color c = g.getColor();
		Font f = g.getFont();
		g.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD + Font.ITALIC, 20));
		g.setColor(Color.RED);
		/*
		 *��ͼ����
		 **/
		g.drawLine(0, 0, 50, 50);
		g.drawString("Banner", 0, 40);
		g.drawOval(10, 10, 50, 30);
		g.setColor(c);
		g.setFont(f);
	}
}