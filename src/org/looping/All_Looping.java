package org.looping;
import java.util.Scanner;
public class All_Looping  {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for (int i=a; i<=15; i++) {
			if (i>10) {
				break;		
			}
			
			if (i>7) {	
				continue;
			}
			System.out.println(i);
		}
		s.close();
	}
}
