package com.scanner;
import java.util.Scanner;
public class Input_Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+b;
		System.out.println("The final output is: " + c);
		
		System.out.println("Enter your name ");
		String d = s.next();
		System.out.println("Your name is: " + d);
		
		System.out.println("Enter your Full name ");
		String e = s.nextLine();
		System.out.println("Your Full name is: " + e);
		s.close();
		
		
		
	}
		
}
