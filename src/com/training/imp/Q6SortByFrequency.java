package com.training.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q6SortByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar=new ArrayList<>();
		ar.addAll(Arrays.asList(2,2,2,4,4,1,1,3,3));
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int arr:ar) {
			if(map.containsKey(arr)) {
				map.put(arr, map.get(arr)+1);
			}
			else {
				map.put(arr, 1);
			}
		}
		
		List<Map.Entry<Integer, Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
				 { 
					if(o1.getValue().equals(o2.getValue())) {
						return (o2.getKey()).compareTo(o1.getKey());
					}
					else
						return (o2.getValue()).compareTo(o1.getValue()); 
				 }
			
		});
		
		System.out.println(list.toString());
		
		
	}

}
