package edu.wbqa.strings;

public class StringReverse {

	public static void main(String[] args) {
		
		String s="reverse the string";
		char[] array = s.toCharArray();
	    char tmp;
	    for(int i=array.length/2; i >= 0; i--) {
	        tmp = array[i];
	        array[i] = array[array.length-1-i];
	        array[array.length-1-i] = tmp;
	    }
	    
	   System.out.println(array);
	}

}
