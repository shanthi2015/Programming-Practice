package edu.wbqa.oops;

public class Overloading {

	public void load(int a)
    {
       System.out.println ("a: " + a);
    }
    public void load(int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    public double load(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }

  public static void main (String args [])
    {
    	Overloading obj = new Overloading();
        double result;
        obj.load(10);
        obj.load(10, 20);
        result = obj.load(5.5);
        System.out.println(result);
    
}
	
}
