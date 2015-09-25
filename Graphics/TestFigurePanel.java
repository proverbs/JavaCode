/**
 * @(#)TestFigurePanel.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/25
 * 测试一些基本图形的绘制
 */


import java.awt.*;
import javax.swing.*;

public class TestFigurePanel extends JFrame {

    public TestFigurePanel() {
    	setLayout(new GridLayout(2, 3, 5, 5));
    	add(new FigurePanel(FigurePanel.LINE));
    	add(new FigurePanel(FigurePanel.RECTANGLE));
    	add(new FigurePanel(FigurePanel.ROUND_RECTANGLE));
    	add(new FigurePanel(FigurePanel.OVAL));
    	add(new FigurePanel(FigurePanel.RECTANGLE, true));
    	add(new FigurePanel(FigurePanel.ROUND_RECTANGLE, true));
    }
    
    public static void main(String[] args) {
    	TestFigurePanel frame = new TestFigurePanel();
    	frame.setTitle("Test Figure Panel");
    	frame.setSize(400, 200);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class FigurePanel extends JPanel {
	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int ROUND_RECTANGLE = 3;
	public static final int OVAL = 4;
	
	private int type = 1;
	private boolean filled = false;
	
	public FigurePanel(int _type) {
		type = _type;
	}
	
	public FigurePanel(int _type, boolean _filled) {
		type = _type;
		filled = _filled;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		Color c = g.getColor();
		
		if (type == LINE) {
			g.setColor(Color.BLACK);
			g.drawLine(10, 10, width - 10, height - 10);
			g.drawLine(width - 10, 10, 10, height - 10);
		}
		else if (type == RECTANGLE) {
			g.setColor(Color.BLUE);
			if (filled) {
				g.fillRect(10, 10, width - 20, height - 20);
			}
			else {
				g.drawRect(10, 10, width - 20, height - 20);
			}
		}
		else if (type == ROUND_RECTANGLE) {
			g.setColor(Color.RED);
			if (filled) {
				g.fillRoundRect(10, 10, width - 20, height - 20, 3, 3);
			}
			else {
				g.drawRoundRect(10, 10, width - 20, height - 20, 3, 3);
			}
		}
		else if (type == OVAL) {
			g.setColor(Color.GREEN);
			if (filled) {
				g.fillOval(10, 10, width - 20, height - 20);
			}
			else {
				g.drawOval(10, 10, width - 20, height - 20);
			}
		}
		g.setColor(c);
	}
}