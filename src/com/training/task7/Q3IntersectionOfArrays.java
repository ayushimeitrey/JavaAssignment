package com.training.task7;

import java.util.*;

public class Q3IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a1=new Integer[]{1,2,3};
		Integer[] a2=new Integer[]{1,2,3,4};
		
		HashSet<Integer> set=new HashSet<>();
		
		set.addAll(Arrays.asList(a1));
		set.retainAll(Arrays.asList(a2));
		
		System.out.println(set);
		
		Integer[] i= {};
		i=set.toArray(i);
		System.out.println(Arrays.toString(i));

	}

}
