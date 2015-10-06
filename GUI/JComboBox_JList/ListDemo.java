/**
 * @(#)ListDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * 测试JList
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo extends JFrame {

	final int NUMBER_OF_FLAGS = 9;
	
	private String[] flagTitle = {
		"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "UK", "America"};
	/*
	 *初始化JList
	 **/
	private JList list = new JList(flagTitle);
	
	private ImageIcon[] flagIcon = {
		new ImageIcon("image/Canada.png"),
		new ImageIcon("image/China.png"),
		new ImageIcon("image/Denmark.png"),
		new ImageIcon("image/France.png"),
		new ImageIcon("image/Germany.png"),
		new ImageIcon("image/India.png"),
		new ImageIcon("image/Norway.png"),
		new ImageIcon("image/UK.png"),
		new ImageIcon("image/America.png")};
	
	private JLabel[] label = new JLabel[NUMBER_OF_FLAGS];
	
    public ListDemo() {
    	list.setBackground(Color.YELLOW);
    	/*
    	 *设置选中情况下的背景色和前景色
    	 **/
    	list.setSelectionBackground(Color.BLACK);
    	list.setSelectionForeground(Color.WHITE);
    	
    	/*
    	 *设置JList的选择模式，在ListSelectionModel接口中
    	 *分为MULTIPLE_INTERVAL_SELECTION、SINGLE_SELECTION、SINGLE_INTERVAL_SELECTION
    	 *多选，单选，连续选择
    	 **/
    	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    	
    	JPanel p = new JPanel(new GridLayout(3, 3, 5, 5));
    	
    	for (int i = 0; i < NUMBER_OF_FLAGS; i++) {
    		p.add(label[i] = new JLabel());
    		label[i].setHorizontalTextPosition(SwingConstants.CENTER);
    		label[i].setVerticalTextPosition(SwingConstants.BOTTOM);
    		/*
    		 *JLabel是实现了SwingContants接口的
    		 *所以SwingContants.CENTER与JLabel.CENTER是一样的
    		 **/
    		label[i].setHorizontalAlignment(JLabel.CENTER);
    	}
    	
    	add(p, BorderLayout.CENTER);
    	/*
    	 *JList无法滚动，所以嵌套在JScrollPane中，创建滚动条
    	 **/
    	add(new JScrollPane(list), BorderLayout.WEST);
    	
    	list.addListSelectionListener(new ListSelectionListener() {
    		public void valueChanged(ListSelectionEvent e) {
    			/*
    			 *获取所有选中项目的下标，并由小到大排列
    			 **/
    			int[] indices = list.getSelectedIndices();
    			
    			int i = 0;
    			for (; i < indices.length; i++) {
    				label[i].setIcon(flagIcon[indices[i]]);
    				label[i].setText(flagTitle[indices[i]]);
    			}
    			
    			for (; i < NUMBER_OF_FLAGS; i++) {
    				label[i].setIcon(null);
    				label[i].setText(null);
    			}
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	ListDemo frame = new ListDemo();
    	frame.setSize(650, 600);
    	frame.setTitle("List Demo");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}