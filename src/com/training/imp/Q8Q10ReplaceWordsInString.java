package com.training.imp;

import java.util.Scanner;

public class Q8Q10ReplaceWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		/*System.out.println("Enter char to be replaced");
		char c1=sc.next().charAt(0);
		System.out.println("Enter new character");
		char c2=sc.next().charAt(0);*/
		s=replaceWords(s,'a','g');
		s=replaceWords(s,'c','d');
		System.out.println("Replaced String is = "+s);
		
		replaceVowels(s);
		
	}

	private static void replaceVowels(String s) {
		// TODO Auto-generated method stub
		String sNew=s.replaceAll("[AaEeIiOoUu]","X");
		System.out.println("String after replacing Vowels with 'X' is = "+sNew);
		
	}

	private static String replaceWords(String s, char c1, char c2) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c1) {
				ch[i]=c2;
			}
			else if(ch[i]==c2) {
				ch[i]=c1;
			}
			
		/*	if(ch[i]=='a') ch[i]='g';
			else if(ch[i]=='g') ch[i]='a';
			else if(ch[i]=='c') ch[i]='d';
			else if(ch[i]=='d') ch[i]='c';*/
			
		}
		
		//System.out.println("Replaced String is = "+String.valueOf(ch));
		return String.valueOf(ch);
		
	}

}
