package edu.wbqa.strings;

public class HashandEquals {

	public static void main(String[] args) {
		
		Student s=new Student();		
		s.setLastName("Mary");
		System.out.println(s.hashCode());		
		System.out.println(s.getLastName().equals("Hello"));

	}

}
