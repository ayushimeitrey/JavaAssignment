package com.training.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.*;

public class Q3Q4Q9CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<>();
		ar.addAll(Arrays.asList(1,2,3,2,3,4,1,5,6));
		
		String s="hello hello world";
		String [] st=s.split(" ");
		String sCount="aaabbcccddaaaac";
		countElements(ar);
		countStringWords(st);
		countConsecutiveNumbers(sCount);

	}

	private static void countConsecutiveNumbers(String sCount) {
		// TODO Auto-generated method stub
		char [] ch=sCount.toCharArray();
		
		int count=1;
		System.out.println("----------------------");
		System.out.println("Consecutive character frequency");
		
		for(int i=1;i<ch.length;i++) {
			if(ch[i]==ch[i-1]) {
				++count;			
			}
			else {
				System.out.print(ch[i-1]+""+count);
				count=1;		
			}
			
			if(i==ch.length-1) {
				System.out.print(ch[i]+""+count);
			}
		}
		
	}

	private static void countStringWords(String[] st) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		System.out.println("----------------------");
		System.out.println("Count String Words Frequency");
		for(String s:st) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}		
		}
		
		for(Entry e: map.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
	}

	private static void countElements(ArrayList<Integer> ar) {
		HashMap<Integer,Integer> map=new HashMap<>();
		System.out.println("----------------------");
		System.out.println("Count Numbers frequency in an arrayList");
		for(int arr:ar)
		{
			if(map.containsKey(arr)) {
				map.put(arr, map.get(arr)+1);
			}
			else {
				map.put(arr, 1);
			}

		}
		//System.out.println(map.toString().replace("=", ":"));

		for(Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
