package edu.wbqa.loops;

import java.util.Scanner;

public class Fibonacci {
	public static int fib(int n)
	{		
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for(int i=2; i < n; i++){
            a[i] = a[i-1] + a[i-2];
        }

        for(int i=0; i< n; i++){
                System.out.print(a[i] + " ");
        }
		return n;


	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the value of n: ");
	    int n = s.nextInt();
	    fib(n);
		
	}

}
