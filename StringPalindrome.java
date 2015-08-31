package edu.wbqa.strings;

import java.util.Scanner;

public class StringPalindrome {
	
	
 public static String strPalindrome(String s){
	 
	 StringBuffer str=new StringBuffer(s);
     StringBuffer str2=new StringBuffer(str.reverse());
     String s2=new String(str2);
     if(s.equals(s2))    
           System.out.println("It is a Palindrome");
       else
           System.out.println("It is not a Palindrome");
	return s;
       }
		 
 
 	public static void main(String[] args) {
		StringPalindrome sp=new StringPalindrome();
		String s="ale";
		sp.strPalindrome(s);
		

}
}