/**
 * @(#)TestWindowAdapter.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/29
 * 测试WindowAdapter，适配器具有空的函数实现
 * 只需重写需要的函数即可，较WindowListener更为方便
 * （适配器需要注意重写中的错误）
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestWindowAdapter extends JFrame {

    public TestWindowAdapter() {
    	addWindowListener(new WindowAdapter() {
    		public void windowActivated(WindowEvent e) {
    			System.out.println("Window Activated");
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new TestWindowAdapter();
    	frame.setSize(220, 80);
    	frame.setTitle("Test Window Adapter");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}