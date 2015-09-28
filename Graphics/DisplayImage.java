/**
 * @(#)DisplayImage.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/28
 * Image对象的使用
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
	 *由ImageIcon转Image
	 *Image相比ImageIcon具有更好的操控性
	 **/
	private ImageIcon imageIcon = new ImageIcon("image/girl.gif");
	private Image image = imageIcon.getImage();
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (image != null) {
			/*
			 *参数依次是：
			 *Image对象，左上角位置，长宽，显示图像的对象
			 **/
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
	}
}