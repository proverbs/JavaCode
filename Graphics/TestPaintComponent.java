/**
 * @(#)TestPaintComponent.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/25
 * 测试Graphics的基本功能
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
		 *需要先调用原方法
		 *为绘制做准备
		 **/
		super.paintComponent(g);
		/*
		 *先将g的原参数存储起来
		 *函数结束时需要还原
		 **/
		Color c = g.getColor();
		Font f = g.getFont();
		g.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD + Font.ITALIC, 20));
		g.setColor(Color.RED);
		/*
		 *绘图方法
		 **/
		g.drawLine(0, 0, 50, 50);
		g.drawString("Banner", 0, 40);
		g.drawOval(10, 10, 50, 30);
		g.setColor(c);
		g.setFont(f);
	}
}