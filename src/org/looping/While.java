package org.looping;
import java.util.Scanner;

public class While {
	

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			int a = s.nextInt();
			
			
			do {
				
				if (a<=7) {
								
					System.out.println(a);
				
			}
				a++;			
			
		}
			while (a<=10);
			
			s.close();
}
}
