/**
 * @(#)SliderDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * ���Ի���JSlider
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
    	 *�������ֵ
    	 **/
    	jsVertical.setMaximum(10);
    	/*
    	 *�ڿ̶�����ʾ��ǩ��ֻ��ʾ���̶�
    	 **/
    	jsVertical.setPaintLabels(true);
    	/*
    	 *�ڻ����ϻ��ƿ̶�
    	 **/
    	jsVertical.setPaintTicks(true);
    	/*
    	 *�������̶ȵķֶ�ֵ
    	 *���̶ȵķֶ�ֵ
    	 **/
    	jsVertical.setMajorTickSpacing(10);
    	jsVertical.setMinorTickSpacing(1);
    	/*
    	 *��ʾ�����켣
    	 **/
    	jsVertical.setPaintTrack(true);
    	/*
    	 *���û��鷭ת
    	 **/
    	jsVertical.setInverted(true);
    	
    	/*
    	 *ChangeListener����������swing.event�У�
    	 *��Ҫʵ��stateChanged����
    	 **/
    	jsHorizontal.addChangeListener(new ChangeListener() {
    		public void stateChanged(ChangeEvent e) {
    			/*
    			 *��ȡ����ĵ�ǰֵ
    			 **/
    			double value = jsHorizontal.getValue();
    			/*
    			 *��ȡ��������ֵ
    			 **/
    			double maximumVaule = jsHorizontal.getMaximum();
    			/*
    			 *�����µ�����
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