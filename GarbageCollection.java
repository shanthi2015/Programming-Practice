package edu.wbqa.general;

import java.lang.ref.WeakReference;

public class GarbageCollection {

	public static void main(String[] args) {
		A a = new A("Hello");
		a = null;
 		System.gc();

	}
	}
	 class A {
		private String color;
	 
		public A(String color) {
			this.color = color;
		}
	 
		
	}


