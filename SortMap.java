package edu.wbqa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMap {
	
	public static void sortMap(){
		Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 16);
        map.put("two", 45);
        map.put("three",20);
        map.put("four", 67);
        map.put("five", 26);
        map.put("six", 75);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
	}

	public static void main(String[] args) {
		SortMap sm=new SortMap();
		sm.sortMap();

	}

}
