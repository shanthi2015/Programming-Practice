package edu.wbqa.loops;

import java.util.Scanner;

public class CmdLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String username = scanner.next();
		System.out.println("Welcome!" + username);
	}

}
