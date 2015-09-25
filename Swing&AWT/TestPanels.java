/**
 * @(#)TestPanels.java��һ��΢��¯�Ŀ������
 *
 *
 * @author proverbs
 * @version 1.00 2015/9/21
 */

import java.awt.*;
import javax.swing.*;
/*JFrame ��Ĭ�ϲ�����BorderLayout*/
public class TestPanels extends JFrame {
    public TestPanels() {
    	JPanel p1 = new JPanel();
    	p1.setLayout(new GridLayout(4, 3));/*GridLayout�Ĺ��췽��*/
    	JButton jb = null;
    	for (int i  = 1; i <= 9; i++) {
    		jb = new JButton("" + i);
    		/*��������*/
    		Font ft = new Font("Microsoft YaHei UI Light", Font.BOLD + Font.ITALIC, 20 + i);
    		/*����JButton������*/
    		jb.setFont(ft);
    		/*����JButton��ǰ��ɫ�ͱ���ɫ
    		 *������������Component��ķ���
    		 **/
    		jb.setBackground(Color.BLACK);
    		jb.setForeground(Color.WHITE);
    		p1.add(jb);
    	}
    	p1.add(new JButton("" + 0));
    	p1.add(new JButton("Start"));
    	p1.add(new JButton("Stop"));
    	
    	JPanel p2 = new JPanel();
    	p2.setLayout(new BorderLayout());
    	p2.add(new JTextField("Time to be displayed here."), BorderLayout.NORTH);
    	p2.add(p1, BorderLayout.CENTER);
    	
    	setLayout(new BorderLayout());
    	add(new JButton("Food to be placed here."), BorderLayout.WEST);
    	add(p2, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
    	TestPanels tp = new TestPanels();
    	tp.setTitle("Proverbs Microwave Oven");
    	tp.setSize(400, 250);
    	tp.setLocationRelativeTo(null);
    	tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	tp.setVisible(true);
    }
}