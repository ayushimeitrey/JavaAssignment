package com.training.task5;

import java.util.ArrayList;

public class Q5RemoveEvenFromOdd {

	public static void main(String[] args) {
		ArrayList<Integer> A=new ArrayList<Integer>();
		int even=0,odd=0;
		int evenCount=0,oddCount=0;
		
		A.add(23);
		A.add(25);
		A.add(74);
		A.add(87);
		A.add(47);
		A.add(89);
		
		for(int i=0;i<A.size();i++) {
			
			if(A.get(i) %2==0) {
				even=i; evenCount++;
			}
			else {
				odd=i; oddCount++;
			}
		}
		
		if(oddCount>evenCount) {
			System.out.println("Even Number at "+ even);
			A.remove(even);
			System.out.println("New Array is = "+A);
		}
		else {
			System.out.println("Odd Number at "+ odd);
			A.remove(odd);
			System.out.println("New Array is = "+A);
		}

	}

}
