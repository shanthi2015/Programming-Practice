package edu.wbqa.strings;

public class StringSub {

	public static void main(String[] args) {

		String s = "Hello world";
		String sub = s.substring(6, 11);
		System.out.println(sub);
		String s1 = sub.replaceAll(sub, "Welcome");
		System.out.println(s1);

	}

}
