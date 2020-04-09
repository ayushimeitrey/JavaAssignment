package com.training.task7;

import java.util.HashSet;

public class Q7CountEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[256];
		String s="test test";
		char[] ch=s.toCharArray();
		
		HashSet<Character> hs = new HashSet<>();
		
		for(char c:ch) {
			ar[c]++;
			hs.add(c);
		}
		for(char c:hs) {
			System.out.println("Character = "+c+" and count = "+ar[c]);
		}

	}

}
