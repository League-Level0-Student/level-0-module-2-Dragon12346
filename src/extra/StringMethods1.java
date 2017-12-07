//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;


public class StringMethods1 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to whatever you want
		String one = "waffles";

		System.out.println(one.charAt(2));
		System.out.println(one.length());
		for (int i = 0; i < one.length(); i++) {
			System.out.println(one.charAt(i));	
		}

		for (int i = 0; i < one.length(); i++) {
			if (one.charAt(i) == 'f') {
				System.out.println(i);
			}
		}
		
	}
}




