package com.training.task7;

import java.util.*;
import java.util.Map.Entry;

public class Q11SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1,81);
		map.put(4,61);
		map.put(2,11);
		map.put(3,1);
		map.put(5,31);
		
		ArrayList<Integer> ar=new ArrayList<>(map.keySet());
		Collections.sort(ar);
		System.out.println("Sorting based on keys ");
		for(int i:ar) {
			System.out.println("Key = "+i+" Value = "+map.get(i));
		}
		
		System.out.println();
		
		System.out.println("Sorting based on Values ");
		ArrayList<Entry<Integer, Integer>> arr=new ArrayList<>(map.entrySet());
		Comparator<Entry<Integer, Integer>> c=new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1,Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		Collections.sort(arr, c);
		for(Entry i:arr)
			System.out.println("Key = "+ i.getKey() +" value = "+ i.getValue());
	}

}
