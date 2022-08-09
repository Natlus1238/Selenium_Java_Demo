package org.selenium;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Inside_String {

	public static void main(String[] args) {

	String s = "This is a \"Java Program\" for \"string inside\" string " ;
//	StringBuilder sb = new StringBuilder();
		
		 String[] split = s.split(" "); 
		 ArrayList<String> al = new ArrayList<String>(Arrays.asList(split));
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).startsWith("\"")) {
				al.add(al.get(i)+al.get(i+1));
				al.remove(i+1);
			}
		}
		 System.out.println(al);
		 
		 
		 
	
//			String replaceall1 = s.replaceAll(" ", "\n");
		
		
		
//		if (replaceall1.equals("\"Java")&&) {
//			String replaceAll2 = replaceall1.replaceAll("\n", " ");
//			System.out.println(replaceAll2);
//		}
		
	}

}
