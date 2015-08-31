package edu.wbqa.exception;

public class Nullpointer {

	public static void main(String[] args) {
		try
		{
		Object obj = null;
        obj.hashCode();
        }
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("hello");
		}
			
		

	}

}
