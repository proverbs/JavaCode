/**
 * @(#)JTextAreaDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/5
 * 测试JTextArea
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
		 *设置文本的换行策略，默认false
		 *true表示当行的长度大于所分配的宽度时，将换行
		 **/
		jta.setLineWrap(true);
		/*
		 *设置文本换行方式，默认false
		 *如果设置为 true，则当行的长度大于所分配的宽度时，将在单词边界（空白）处换行
		 **/
		jta.setWrapStyleWord(true);
		/*
		 *设置文本区域为可编辑，默认为true
		 **/
		jta.setEditable(true);
		/*
		 *将JTextArea嵌套在JScrollPane中可以在其中加入滚动条
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