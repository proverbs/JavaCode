/**
 * @(#)ListDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * ����JList
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
	 *��ʼ��JList
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
    	 *����ѡ������µı���ɫ��ǰ��ɫ
    	 **/
    	list.setSelectionBackground(Color.BLACK);
    	list.setSelectionForeground(Color.WHITE);
    	
    	/*
    	 *����JList��ѡ��ģʽ����ListSelectionModel�ӿ���
    	 *��ΪMULTIPLE_INTERVAL_SELECTION��SINGLE_SELECTION��SINGLE_INTERVAL_SELECTION
    	 *��ѡ����ѡ������ѡ��
    	 **/
    	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    	
    	JPanel p = new JPanel(new GridLayout(3, 3, 5, 5));
    	
    	for (int i = 0; i < NUMBER_OF_FLAGS; i++) {
    		p.add(label[i] = new JLabel());
    		label[i].setHorizontalTextPosition(SwingConstants.CENTER);
    		label[i].setVerticalTextPosition(SwingConstants.BOTTOM);
    		/*
    		 *JLabel��ʵ����SwingContants�ӿڵ�
    		 *����SwingContants.CENTER��JLabel.CENTER��һ����
    		 **/
    		label[i].setHorizontalAlignment(JLabel.CENTER);
    	}
    	
    	add(p, BorderLayout.CENTER);
    	/*
    	 *JList�޷�����������Ƕ����JScrollPane�У�����������
    	 **/
    	add(new JScrollPane(list), BorderLayout.WEST);
    	
    	list.addListSelectionListener(new ListSelectionListener() {
    		public void valueChanged(ListSelectionEvent e) {
    			/*
    			 *��ȡ����ѡ����Ŀ���±꣬����С��������
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