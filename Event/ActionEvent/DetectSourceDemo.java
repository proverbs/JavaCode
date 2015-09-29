/**
 * @(#)DetectSourceDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/29
 * 测试多个组件共用一个Listener
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DetectSourceDemo extends JFrame {

	private JButton jbtNew = new JButton("New");
	private JButton jbtOpen = new JButton("Open");
	private JButton jbtSave = new JButton("Save");
	private JButton jbtPrint = new JButton("Print");
	
    public DetectSourceDemo() {
    	setLayout(new FlowLayout());
    	add(jbtNew);
    	add(jbtOpen);
    	add(jbtSave);
    	add(jbtPrint);
    	
    	/*
    	 *四个JButton共同使用一个listener
    	 **/
    	ActionListener listener = new ButtonListener();
    	
    	jbtNew.addActionListener(listener);
    	jbtOpen.addActionListener(listener);
    	jbtSave.addActionListener(listener);
    	jbtPrint.addActionListener(listener);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new DetectSourceDemo();
    	frame.setTitle("A Detect Source Demo of Listener Class");
    	/*
    	 *一种setSize的方法
    	 *将全部组件包围
    	 **/
    	frame.pack();
    	
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
    
    private class ButtonListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		/*
    		 *getSource方法可以获取源对象
    		 **/
    		if (e.getSource() == jbtNew) {
    			System.out.println("New File");
    		}
    		else if (e.getSource() == jbtOpen) {
    			System.out.println("Open File");
    		}
    		else if (e.getSource() == jbtSave) {
    			System.out.println("Save File");
    		}
    		else if (e.getSource() == jbtPrint) {
    			System.out.println("Print File");
    		}
    	}
    }
}