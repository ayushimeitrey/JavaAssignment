package com.training.task5;

public class Q4AReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="My name is Ayushi Meitrey";
		String[] s=st.split(" ");
		
		System.out.println("Original String = "+st);
		
		System.out.print("New String = ");
		for(String snew:s) {
			reverse(snew);
		}
	}

	 static void reverse(String snew) {
		// TODO Auto-generated method stub
		 char[] c = snew.toCharArray();
		 int r= c.length-1;
		 int l=0;
		 
		 while(l<r) {
			 swap(c,l,r);
			 l++;
			 r--;
		 }
		 
		 System.out.print(String.valueOf(c)+" ");
		
	}

	 static void swap(char[] c, int l, int r) {
		// TODO Auto-generated method stub
		char temp;
		temp=c[l];
		c[l]=c[r];
		c[r]=temp;
		
	}

}
