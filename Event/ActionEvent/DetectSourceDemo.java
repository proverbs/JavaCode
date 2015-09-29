/**
 * @(#)DetectSourceDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/29
 * ���Զ���������һ��Listener
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
    	 *�ĸ�JButton��ͬʹ��һ��listener
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
    	 *һ��setSize�ķ���
    	 *��ȫ�������Χ
    	 **/
    	frame.pack();
    	
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
    
    private class ButtonListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		/*
    		 *getSource�������Ի�ȡԴ����
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