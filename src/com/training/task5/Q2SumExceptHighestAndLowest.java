package com.training.task5;

import java.util.ArrayList;
import java.util.Collections;

public class Q2SumExceptHighestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(200);
		ar.add(30);
		ar.add(400);
		ar.add(50);
		System.out.println("Entered array is = "+ar);
		Collections.sort(ar);
		
		for(int i=1;i<ar.size()-1;i++) {
			sum+=ar.get(i);
		}
		
		System.out.println("Sum of the elements of array except first and last element is = "+sum);
	}
}

