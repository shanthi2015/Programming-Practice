package edu.wbqa.loops;

import java.util.Scanner;

public class PrimeNum {
	public static boolean isPrimeNum(int n) {

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNum pm = new PrimeNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:  ");
		int i=sc.nextInt();		
		System.out.println(pm.isPrimeNum(i));

	}

}
