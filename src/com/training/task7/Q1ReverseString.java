package com.training.task7;

public class Q1ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		s="My name is ayushi";
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		
		while(i<j) {
			swap(i,j,c);
			i++;
			j--;
		}
		
		System.out.println(String.valueOf(c));

	}

	private static void swap(int c, int d, char[]a) {
		// TODO Auto-generated method stub
		char temp;
		temp=a[c];
		a[c]=a[d];
		a[d]=temp;
	}

}
