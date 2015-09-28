/**
 * @(#)DisplayImage.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * Image�����ʹ��
 */

import java.awt.*;
import javax.swing.*;

public class DisplayImage extends JFrame {

    public DisplayImage() {
    	add(new ImagePanel());
    }
    
    public static void main(String[] args) {
    	DisplayImage frame = new DisplayImage();
    	frame.setTitle("Test Display Image");
    	frame.setSize(300, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class ImagePanel extends JPanel {
	/*
	 *��ImageIconתImage
	 *Image���ImageIcon���и��õĲٿ���
	 **/
	private ImageIcon imageIcon = new ImageIcon("image/girl.gif");
	private Image image = imageIcon.getImage();
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (image != null) {
			/*
			 *���������ǣ�
			 *Image�������Ͻ�λ�ã�������ʾͼ��Ķ���
			 **/
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
	}
}