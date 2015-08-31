package edu.wbqa.arrays;

import java.util.Arrays;

public class ArrSort {
	
	public static int[] sortArray(int [] s){
		int[] a=s;
	    Arrays.sort(s);
		return a;
		
	}

	public static void main(String[] args) {
		int[] n = { 10, 9, 7, 4, 5 };
		ArrSort as=new ArrSort();
		as.sortArray(n);
		for (int temp : n) {
			System.out.println(temp);
		}

	}

}
