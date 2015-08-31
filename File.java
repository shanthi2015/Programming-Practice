package edu.wbqa.files;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class File {

	public void scan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter value for b: ");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("The sum is:  " + c);

	}
	public void reader() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value for a: ");
		String s = br.readLine();
		int i = Integer.parseInt(s);
		System.out.println("Enter value for b: ");
		String s1 = br.readLine();
		int j = Integer.parseInt(s1);
		int c = i + j;
		System.out.println("The sum is:  " + c);
	}
    public void dataStream() throws IOException {
    	
    	DataInputStream dis = new DataInputStream(System.in);
    	System.out.println("Enter value for a: ");
    	Console console = System.console();
        String s = console.readLine();
        int i = Integer.parseInt(console.readLine());
    }
	
	public static void main(String[] args) throws IOException {

		File f = new File();
		//f.scan();
		f.reader();

	}

}
