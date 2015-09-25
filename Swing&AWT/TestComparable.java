/**
 * @(#)TESTComparable.java
 *
 *
 * @author Proverbs
 * @version 1.00 2015/9/24
 * 实现comparable接口，利用Arrays.sort()实现排序
 */

import java.util.*;

public class TestComparable implements Comparable<TestComparable> {
	private String s = null;
	
    public TestComparable(String _s) {
    	s = _s;
    }
    
    public int compareTo(TestComparable tc) {
    	return s.compareTo(tc.s);
    }
    
    public String toString() {
    	return s;
    }
    
    public static void main(String[] args) {
    	TestComparable[] stringArray = new TestComparable[]{new TestComparable("4"), new TestComparable("2"), new TestComparable("3")};
    	Arrays.sort(stringArray);
    	for (int i = 0; i < stringArray.length; i++) {
    		System.out.println(stringArray[i]);
    	}
    }
}