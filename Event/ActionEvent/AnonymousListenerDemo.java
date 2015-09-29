/**
 * @(#)AnonymousListenerDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * 测试匿名内部类
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AnonymousListenerDemo extends JFrame {

    public AnonymousListenerDemo() {
    	JButton jbtNew = new JButton("New");
    	JButton jbtOpen = new JButton("Open");
    	JButton jbtSave = new JButton("Save");
    	JButton jbtPrint = new JButton("Print");
    	
    	setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    	
    	add(jbtNew);
    	add(jbtOpen);
    	add(jbtSave);
    	add(jbtPrint);
    	/*
    	 *匿名内部类的书写方法
    	 **/
    	jbtNew.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("New File");
    		}
    	}
    	);
    	
    	jbtOpen.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("Open File");
    		}
    	}
    	);
    	
    	jbtSave.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("Save File");
    		}
    	}
    	);
    	
    	jbtPrint.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("Print File");
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new AnonymousListenerDemo();
    	frame.setTitle("Test Anonymous Listener");
    	frame.setSize(300, 100);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}