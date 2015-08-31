package edu.wbqa.loops;

import java.util.Scanner;

public class Armstrong {

	public static boolean isArmstrong(int n) {

		int length = String.valueOf(n).length();
		int sum = 0;
		int value = n;
		for (int i = 1; i <= length; i++) {
			int digit = value % 10;
			value = value / 10;
			sum = sum + (int) Math.pow(digit, length);
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int number = sc.nextInt();
		if (isArmstrong(number)) {
			System.out.println(number + " is an armstrong number!");

		} else {

			System.out.println(number + " is an not an armstrong number!");

		}

	}

}
