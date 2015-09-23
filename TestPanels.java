/**
 * @(#)TestPanels.java，一个微波炉的控制面板
 *
 *
 * @author proverbs
 * @version 1.00 2015/9/21
 */

import java.awt.*;
import javax.swing.*;
/*JFrame 的默认布局是BorderLayout*/
public class TestPanels extends JFrame {
    public TestPanels() {
    	JPanel p1 = new JPanel();
    	p1.setLayout(new GridLayout(4, 3));/*GridLayout的构造方法*/
    	JButton jb = null;
    	for (int i  = 1; i <= 9; i++) {
    		jb = new JButton("" + i);
    		/*创建字体*/
    		Font ft = new Font("Microsoft YaHei UI Light", Font.BOLD + Font.ITALIC, 20 + i);
    		/*设置JButton的字体*/
    		jb.setFont(ft);
    		/*设置JButton的前景色和背景色
    		 *这两个方法是Component类的方法
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