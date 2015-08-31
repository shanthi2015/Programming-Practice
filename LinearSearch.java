package edu.wbqa.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		  int count, num, item;	     
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter number of elements: ");
	      num = sc.nextInt(); 	     
	      int[] array = new int[num]; 
	      System.out.println("Enter " + num + " values: ");	     
	      for (count = 0; count < num; count++)
	      array[count] = sc.nextInt();
	      System.out.println("Enter the value to be searched: ");
	      item = sc.nextInt();
	      for (count = 0; count < num; count++)
	      {
	         if (array[count] == item) 
	         {
	           System.out.println(item+" is present at location "+(count+1));
	           break;
	         }
	      }
	      if (count == num)
	        System.out.println(item + " doesn't exist in array.");

	}

}
