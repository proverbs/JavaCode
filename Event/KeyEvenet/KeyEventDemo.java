/**
 * @(#)KeyEventDemo.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/30
 * ����KeyEvent�ĳ���
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame {

	private KeyboardPanel keyboardPanel = new KeyboardPanel();
	
    public KeyEventDemo() {
    	add(keyboardPanel);
    	/*
    	 *ֻ������Ϊ�ɾ۽����ܶ�ȡ�����̲���
    	 *JPanelĬ��Ϊ���ɾ۽�
    	 **/
    	keyboardPanel.setFocusable(true);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new KeyEventDemo();
    	frame.setTitle("A KeyEvent Demo");
    	frame.setSize(300, 300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
    
   	class KeyboardPanel extends JPanel {
   		private int x = 100;
   		private int y = 100;
   		private char keyChar = 'A';
   		
   		public KeyboardPanel() {
   			addKeyListener(new KeyAdapter() {
   				public void keyPressed(KeyEvent e) {
   					/*
   					 *��ȡkey������ֵ��int
   					 **/
   					int key = e.getKeyCode();
   					if (key == KeyEvent.VK_DOWN) y += 10;
   					else if (key == KeyEvent.VK_UP) y -= 10;
   					else if (key == KeyEvent.VK_LEFT) x -= 10;
   					else if (key == KeyEvent.VK_RIGHT) x += 10;
   					/*
   					 *��ȡӢ����ĸ��char
   					 **/
   					else keyChar = e.getKeyChar();
   					repaint();
   				}
   			}
   			);
   		}
   		
   		protected void paintComponent(Graphics g) {
   			super.paintComponent(g);
   			g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
   			g.drawString(String.valueOf(keyChar), x, y);
   		}
   	}
}