package org.emp;

public class Employee {
	
	public void empID() {
		System.out.println("3295492");
	}
	
	public void empname() {
		System.out.println("Raja");
	}
	
	public void empDOB() {
	System.out.println("Apr 18th 2022");
	}
	
	public void empphone() {
	System.out.println("1234567890");
	}
	public void empEmail() {
		System.out.println("dskjgfuyrb@gmail.com");
	}
	
	public void empAddress() {
		System.out.println("iuyywuqiivbjvvubvuqe");
	}

	public static void main(String[] args) {
		Employee  e= new Employee ();
		e.empID();
		e.empname();
		e.empphone();
		e.empEmail();
		e.empDOB();
		e.empAddress();
		
	}

}
