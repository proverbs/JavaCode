/**
 * @(#)MultipleWindowsDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * 多窗口，统计文本的单词出现次数，绘制直方图
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleWindowsDemo extends JFrame {

	private JTextArea jta = new JTextArea();
	private JButton jb = new JButton("Show Histogram");
	private Histogram histogram = new Histogram();
	private JFrame histogramFrame = new JFrame();
	
    public MultipleWindowsDemo() {
    	JScrollPane scrollPane = new JScrollPane(jta);
    	scrollPane.setPreferredSize(new Dimension(300, 200));
    	jta.setWrapStyleWord(true);
    	jta.setLineWrap(true);
    	
    	add(scrollPane, BorderLayout.CENTER);
    	add(jb, BorderLayout.SOUTH);
    	
    	histogramFrame.add(histogram, BorderLayout.CENTER);
    	histogramFrame.setTitle("Histogram");
    	histogramFrame.setSize(300, 300);
    	histogramFrame.setLocationRelativeTo(null);
    	
    	jb.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			int[] count = countLetters();
    			histogram.showHistogram(count);
    			histogramFrame.setVisible(true);
    		}
    	}
    	);
    }
    
    private int[] countLetters() {
    	int[] count = new int[26];
    	String text = jta.getText();
    	for (int i = 0; i < text.length(); i++) {
    		char c = text.charAt(i);
    		if (c >= 'A' && c <= 'Z') {
    			count[c - 'A']++;
    		}
    		if (c >= 'a' && c <= 'z') {
    			count[c - 'a']++;
    		}
    	}
    	return count;
    }
    
    public static void main(String[] args) {
    	MultipleWindowsDemo frame = new MultipleWindowsDemo();
    	frame.setTitle("Multiple Windows Demo");
    	frame.setSize(400, 400);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}