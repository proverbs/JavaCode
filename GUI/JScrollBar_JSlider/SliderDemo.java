/**
 * @(#)SliderDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * 测试滑块JSlider
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame {

	private JSlider jsHorizontal = new JSlider(JSlider.HORIZONTAL);
	private JSlider jsVertical = new JSlider(JSlider.VERTICAL);
	
	private MessagePanel messagePanel = new MessagePanel("Welcome to Java");
	
    public SliderDemo() {
    	setLayout(new BorderLayout(5, 5));
    	add(messagePanel, BorderLayout.CENTER);
    	add(jsHorizontal, BorderLayout.SOUTH);
    	add(jsVertical, BorderLayout.EAST);
    	
    	jsHorizontal.setMaximum(50);
    	jsHorizontal.setPaintLabels(true);
    	jsHorizontal.setPaintTicks(true);
    	jsHorizontal.setMajorTickSpacing(10);
    	jsHorizontal.setMinorTickSpacing(1);
    	jsHorizontal.setPaintTrack(false);
    	
    	/*
    	 *设置最大值
    	 **/
    	jsVertical.setMaximum(10);
    	/*
    	 *在刻度上显示标签，只显示主刻度
    	 **/
    	jsVertical.setPaintLabels(true);
    	/*
    	 *在滑块上绘制刻度
    	 **/
    	jsVertical.setPaintTicks(true);
    	/*
    	 *设置主刻度的分度值
    	 *副刻度的分度值
    	 **/
    	jsVertical.setMajorTickSpacing(10);
    	jsVertical.setMinorTickSpacing(1);
    	/*
    	 *显示滑动轨迹
    	 **/
    	jsVertical.setPaintTrack(true);
    	/*
    	 *设置滑块翻转
    	 **/
    	jsVertical.setInverted(true);
    	
    	/*
    	 *ChangeListener监听器（在swing.event中）
    	 *需要实现stateChanged方法
    	 **/
    	jsHorizontal.addChangeListener(new ChangeListener() {
    		public void stateChanged(ChangeEvent e) {
    			/*
    			 *获取滑块的当前值
    			 **/
    			double value = jsHorizontal.getValue();
    			/*
    			 *获取滑块的最大值
    			 **/
    			double maximumVaule = jsHorizontal.getMaximum();
    			/*
    			 *计算新的坐标
    			 **/
    			double newX = (value * messagePanel.getWidth() / maximumVaule);
    			messagePanel.setXCoordinate((int)newX);
    		}
    	}
    	);
    	
    	jsVertical.addChangeListener(new ChangeListener() {
    		public void stateChanged(ChangeEvent e) {
    			double value = jsVertical.getValue();
    			double maximumVaule = jsVertical.getMaximum();
    			double newY = (value * messagePanel.getHeight() / maximumVaule);
    			messagePanel.setYCoordinate((int)newY);
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	SliderDemo frame = new SliderDemo();
    	frame.setTitle("JSlider Demo");
    	frame.setSize(500, 300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}