//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import java.util.Random;

public class StringMethods2 {
	public static void main(String[] args) {
		Random r = new Random();
		int t = r.nextInt(10);
		
		String p = "PoIuYtReWq";
		
		System.out.println(p.toUpperCase());

		System.out.println(p.toLowerCase());

		System.out.println(p.substring(0,3));

		System.out.println(p.charAt(t));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		System.out.println(p.substring(p.length()-3,p.length()));
	}


}

