package edu.wbqa.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		String[] strArray = new String[] {"one", "two", "three", "two", "one", "four"};
	    Set set = new HashSet();
	    Set un = new HashSet();
	    for(int i = 0; i < strArray.length ; i++ ){
	        boolean b = set.add(strArray[i]);
	        if(b == false){
	            un.add(strArray[i]);
	        }
	    }
	    Iterator it = un.iterator();
	    while (it.hasNext()){
	        System.out.println(it.next());
	    }

	}

}
