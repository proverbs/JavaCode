/**
 * @(#)GetFont.java
 *
 *
 * @author 
 * @version 1.00 2015/9/21
 */

import java.awt.*;

public class GetFont {

    public GetFont() {
    }
    
    public static void main(String[] args) {
    	GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	String[] fontnames = e.getAvailableFontFamilyNames();
    	
    	for (int i = 0; i < fontnames.length; i++) {
    		System.out.println(fontnames[i]);
    	}
    }
}