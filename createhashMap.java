package edu.wbqa.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class createhashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		for (Entry<Integer, String> entry : hm.entrySet()) {
			if (entry.getValue().equals("c")) {
				System.out.println(entry.getKey());
			}
		}

	}

}
