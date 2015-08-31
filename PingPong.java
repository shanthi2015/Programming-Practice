package edu.wbqa.loops;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the value of i: ");
	    int i = s.nextInt();
	    if(i%3==0 && i%5==0)
		{
			System.out.println("ping pong");
		}
	    else if(i%3==0){
			System.out.println("ping");
		}
		else if(i%5==0)
		{
			System.out.println("pong");
		}		 
		else
		{
			System.out.println(i);
		}
	    
	}

}
