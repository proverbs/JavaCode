/**
 * @(#)ScrollBarDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * 测试滚动条JScrollBar（也是一种组件）
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollBarDemo extends JFrame {
	/*
	 *JScrollBar的构造方法
	 *表示水平或者竖直滚动条
	 **/
	private JScrollBar jsbHorizontal = new JScrollBar(JScrollBar.HORIZONTAL);
	private JScrollBar jsbVertical = new JScrollBar(JScrollBar.VERTICAL);
	
	private MessagePanel messagePanel = new MessagePanel("Welcome to Java");
	
    public ScrollBarDemo() {
    	setLayout(new BorderLayout());
    	add(messagePanel, BorderLayout.CENTER);
    	add(jsbHorizontal, BorderLayout.SOUTH);
    	add(jsbVertical, BorderLayout.EAST);
    	/*
    	 *AdjustmentListener监听器
    	 *需要实现adjustmentVauleChanged方法
    	 **/
    	jsbHorizontal.addAdjustmentListener(new AdjustmentListener() {
    		public void adjustmentValueChanged(AdjustmentEvent e) {
    			/*
    			 *获取滚动条的当前值
    			 **/
    			double value = jsbHorizontal.getValue();
    			/*
    			 *获取滚动条的最大值
    			 **/
    			double maximumVaule = jsbHorizontal.getMaximum();
    			/*
    			 *计算新的坐标
    			 **/
    			double newX = (value * messagePanel.getWidth() / maximumVaule);
    			messagePanel.setXCoordinate((int)newX);
    		}
    	}
    	);
    	
    	jsbVertical.addAdjustmentListener(new AdjustmentListener() {
    		public void adjustmentValueChanged(AdjustmentEvent e) {
    			double value = jsbVertical.getValue();
    			double maximumValue = jsbVertical.getMaximum();
    			double newY = (value * messagePanel.getHeight() / maximumValue);
    			messagePanel.setYCoordinate((int)newY);
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	ScrollBarDemo frame = new ScrollBarDemo();
    	frame.setTitle("ScrollBar Demo");
    	frame.setSize(500, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}