package edu.wbqa.arrays;

public class ArrLargest {

	public static int findmax(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]){
				max=arr[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		ArrLargest al=new ArrLargest();
		int[] arr={10,20,30,40,50};
		System.out.println(al.findmax(arr));
		
	}

}
