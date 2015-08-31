package edu.wbqa.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExampleList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println("the list is:"+al);
		Iterator i=al.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
		ListIterator l=al.listIterator(al.size());
		while (l.hasPrevious()) {
		System.out.println(l.previous());
		}
	}

}
