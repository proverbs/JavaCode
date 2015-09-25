/**
 * @(#)TestException.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * 一个关于异常的简易加法运算器
 */


public class TestException {
    
    public static void main(String[] args) {
    	int x = 0, y = 0;
    	try {
    		x = Integer.parseInt(args[0]);
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Wrong input:" + args[0]);
    		System.exit(-1);
    	}
    	
    	try {
    		y = Integer.parseInt(args[1]);
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Wrong input:" + args[1]);
    		System.exit(-1);
    	}
    	
    	System.out.println(x + y);
    }
}