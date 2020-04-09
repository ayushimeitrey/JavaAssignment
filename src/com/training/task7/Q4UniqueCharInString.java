package com.training.task7;

public class Q4UniqueCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unique=0;
		int ar[]=new int[256];
		String s="My name";
		char[] ch=s.toCharArray();
		
		for(char c:ch) {
			ar[c]++;
		}
		
		for(char c:ch) {
			if(ar[c]>1) {
				System.out.println("String does NOT contain unique characters");
				unique=0;
				break;
			}
			else
				unique=1;
		}
		
		if(unique==1) {
			System.out.println("String contains ALL unique characters");
		}
	}

}
