package edu.wbqa.loops;

import java.util.Scanner;

public class Factorial {
	public void fact1(){
		int n, c, fact = 1; 

		System.out.println("Enter a value: "); 
		Scanner in = new Scanner(System.in); 
		n = in.nextInt(); 
		if ( n < 0 ) 
		System.out.println("Enter a positive number"); 
		else 
		{ 
		for ( c = 1 ; c <= n ; c++ ) 
		fact = fact*c; 

		System.out.println("Factorial of "+n+" is: "+fact); 
		} 

	}
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.fact1();
		
	}

}
