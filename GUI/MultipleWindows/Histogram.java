/**
 * @(#)Histogram.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/10/6
 * 另一个程序的组件
 */

import java.awt.*;
import javax.swing.*;

public class Histogram extends JPanel {

	private int[] count;
	
    public Histogram() {
    	
    }
    
    public void showHistogram(int[] count) {
    	this.count = count;
    }
    
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	if (count == null) return;
    	
    	int width = getWidth();
    	int height = getHeight();
    	int interval = (width - 40) / count.length;
    	int individualWidth = (int)(0.6 * interval);
    	
    	int maxCount = 0;
    	for (int i = 0; i < count.length; i++) {
    		maxCount = Math.max(maxCount, count[i]);
    	}
    	
    	int x = 20;
    	
    	g.drawLine(10, height - 45, width - 10, height - 45);
    	for (int i = 0; i < count.length; i++) {
    		int barHeight = (int)((1.0 * count[i] / maxCount) * (height - 55));
    		g.drawRect(x, height - 45 - barHeight, individualWidth, barHeight);
    		g.drawString((char)('A' + i) + "", x, height - 30);
    		x += interval;
    	}
    }
}