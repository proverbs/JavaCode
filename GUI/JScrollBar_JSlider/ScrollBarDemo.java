/**
 * @(#)ScrollBarDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * ���Թ�����JScrollBar��Ҳ��һ�������
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollBarDemo extends JFrame {
	/*
	 *JScrollBar�Ĺ��췽��
	 *��ʾˮƽ������ֱ������
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
    	 *AdjustmentListener������
    	 *��Ҫʵ��adjustmentVauleChanged����
    	 **/
    	jsbHorizontal.addAdjustmentListener(new AdjustmentListener() {
    		public void adjustmentValueChanged(AdjustmentEvent e) {
    			/*
    			 *��ȡ�������ĵ�ǰֵ
    			 **/
    			double value = jsbHorizontal.getValue();
    			/*
    			 *��ȡ�����������ֵ
    			 **/
    			double maximumVaule = jsbHorizontal.getMaximum();
    			/*
    			 *�����µ�����
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