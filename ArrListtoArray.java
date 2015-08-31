package edu.wbqa.collections;

import java.util.ArrayList;

public class ArrListtoArray {

	public static void main(String[] args) {
		ArrayList arrl = new ArrayList();
        arrl.add("1");
        arrl.add("2");
        arrl.add("3");
        arrl.add("4");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        for(String str:strArr){
            System.out.println(str);
        }


	}

}
