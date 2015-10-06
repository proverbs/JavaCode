/**
 * @(#)ComboBoxDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * ������Ͽ�JComboBox
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame {

	private String[] flagTitle = {
		"China", "America", "EU"};
	
	private ImageIcon[] flagIcon = {
		new ImageIcon("image/China.png"),
		new ImageIcon("image/America.png"),
		new ImageIcon("image/EU.png")};
	
	private String[] flagDescription = {
		"Description for China...\n" + "China, officially the People's Republic of China (PRC), is a sovereign state in East Asia. It is the world's most populous country, with a population of over 1.35 billion. The PRC is a single-party state governed by the Communist Party of China, with its seat of government in the capital city of Beijing.[16] It exercises jurisdiction over 22 provinces, five autonomous regions, four direct-controlled municipalities (Beijing, Tianjin, Shanghai and Chongqing), and two mostly self-governing special administrative regions (Hong Kong and Macau). The PRC also claims the territories governed by the Republic of China (ROC), a separate political entity today commonly known as Taiwan, as a part of its territory, which includes the island of Taiwan as Taiwan Province, Kinmen and Matsu as a part of Fujian Province and islands the ROC controls in the South China Sea as a part of Hainan Province and Guangdong Province. These claims are controversial because of the complex political status of Taiwan.[17]",
		"Description for America...\n",
		"Description for EU...\n"};
	
	private DescriptionPanel descriptionPanel = new DescriptionPanel();
	/*
	 *JComboBox�Ĺ��췽����Ĭ��ѡ���±�Ϊ0��ѡ��
	 *ps��addItem�������Լ�����JComboBox�����ѡ��
	 **/
	private JComboBox jcb = new JComboBox(flagTitle);
	
    public ComboBoxDemo() {
    	setDisplay(0);
    	add(jcb, BorderLayout.NORTH);
    	add(descriptionPanel, BorderLayout.CENTER);
    	
    	/*
    	 *�˴����ItemListener
    	 *ActionListener���ܴ���ButtonGroup��������JComboBox
    	 *���Ǵ˴�Ӧ��������
    	 *�Ƽ�ʹ��ItemListener
    	 **/
    	
    	jcb.addItemListener(new ItemListener() {
    		public void itemStateChanged(ItemEvent e) {
    			/*
    			 *��ȡѡ��ѡ����±�
    			 **/
    			setDisplay(jcb.getSelectedIndex());
    		}
    	}
    	);
    }
    
    public void setDisplay(int x) {
    	descriptionPanel.setTitle(flagTitle[x]);
    	descriptionPanel.setImageIcon(flagIcon[x]);
    	descriptionPanel.setDescription(flagDescription[x]);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new ComboBoxDemo();
    	frame.setTitle("JComboBox Demo");
    	frame.pack();
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