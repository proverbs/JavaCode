/**
 * @(#)JTextAreaDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/5
 * ����JTextArea
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JTextAreaDemo extends JFrame {

	private DescriptionPanel descriptionPanel = new DescriptionPanel();
	
    public JTextAreaDemo() {
    	descriptionPanel.setTitle("China");
    	String description = "China\n" + "A developing country.\n";
    	descriptionPanel.setDescription(description);
    	descriptionPanel.setImageIcon(new ImageIcon("image/China.png"));
    	
    	setLayout(new BorderLayout());
    	add(descriptionPanel, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new JTextAreaDemo();
    	frame.pack();
    	frame.setTitle("JTextArea Demo");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
}

class DescriptionPanel extends JPanel {
	
	private JLabel jl = new JLabel();
	private JTextArea jta = new JTextArea();
	
	public DescriptionPanel() {
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setHorizontalTextPosition(JLabel.CENTER);
		jl.setVerticalTextPosition(JLabel.BOTTOM);
		
		jl.setFont(new Font("SansSerif", Font.BOLD, 16));
		jta.setFont(new Font("Serif", Font.PLAIN, 14));
		/*
		 *�����ı��Ļ��в��ԣ�Ĭ��false
		 *true��ʾ���еĳ��ȴ���������Ŀ��ʱ��������
		 **/
		jta.setLineWrap(true);
		/*
		 *�����ı����з�ʽ��Ĭ��false
		 *�������Ϊ true�����еĳ��ȴ���������Ŀ��ʱ�����ڵ��ʱ߽磨�հף�������
		 **/
		jta.setWrapStyleWord(true);
		/*
		 *�����ı�����Ϊ�ɱ༭��Ĭ��Ϊtrue
		 **/
		jta.setEditable(true);
		/*
		 *��JTextAreaǶ����JScrollPane�п��������м��������
		 **/
		JScrollPane jsp = new JScrollPane(jta);
		
		setLayout(new BorderLayout(5, 5));
		add(jsp, BorderLayout.CENTER);
		add(jl, BorderLayout.WEST);
	}
	
	public void setTitle(String s) {
		jl.setText(s);
	}
	
	public void setImageIcon(ImageIcon icon) {
		jl.setIcon(icon);
	}
	
	public void setDescription(String s) {
		jta.setText(s);
	}
}