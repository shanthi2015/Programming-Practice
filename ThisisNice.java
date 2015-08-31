package edu.wbqa.strings;

public class ThisisNice {
	
	
	public static String append(String string){
		string = "This is Nice";
		String[] parts = string.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		part1=new StringBuilder(part1).insert(part1.length(), "1").toString();
		part2=new StringBuilder(part2).insert(part2.length(), "2").toString();
		part3=new StringBuilder(part3).insert(part3.length(), "3").toString();
		String str=part1+ " " +part2 + " "+part3;		
		System.out.println(str);
		return str;
		
	}

	public static void main(String[] args) {
		ThisisNice ts=new ThisisNice();
		String s = "This is Nice";
		ts.append(s);
	
	}

}
