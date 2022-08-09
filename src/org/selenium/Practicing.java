package org.selenium;

import java.util.HashMap;

public class Practicing {

	public static void main(String[] args) {
		String str = "Mohammad Sultan";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				Integer inte = hm.get(str.charAt(i));
				hm.put(str.charAt(i), inte+1);
			}
				else {
					hm.put(str.charAt(i), 1);
				}	
				
			}
			
			System.out.println(hm);
				
			}
		}
		
		