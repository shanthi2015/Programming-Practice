package edu.wbqa.arrays;

import java.util.Arrays;

public class ArrMissing {

public static int findMissingNumber(int[] numbers){
		
		Arrays.sort(numbers);
		int missingNumber=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++){
			if(i!=0 && numbers[i]!=numbers[i-1]+1){
				missingNumber=numbers[i-1]+1;
			}
		}
		return missingNumber;
		
	}
	
	public static void main(String[] args) 
	{
		ArrMissing am=new ArrMissing();
		int[] a={1,2,3,4,5,6,8,9,10};		
		System.out.println(am.findMissingNumber(a));
		
	}
}
