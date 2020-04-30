package com.training.imp;

import java.util.Scanner;

public class Q1Q2ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		reverseString(s);
		reverseStringWord(s);
	}

	private static void reverseStringWord(String s) {
		// TODO Auto-generated method stub
		String[] st=s.split(" ");
		int i=0;int j=st.length-1;
		String temp=null;
		while(i<j) {
			temp=st[i];
			st[i]=st[j];
			st[j]=temp;
			i++;j--;
		}
		for(String newStr: st)
		System.out.print(newStr+" ");
	}

	private static void reverseString(String s) {
		char [] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		
		while(i<j) {
			swap(ch,i,j);
			i++;j--;
		}
		System.out.println(String.valueOf(ch));
	}

	private static void swap(char[] ch, int i, int j) {
		// TODO Auto-generated method stub
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}

}
