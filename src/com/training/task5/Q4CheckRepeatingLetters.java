package com.training.task5;

import java.util.HashSet;

public class Q4CheckRepeatingLetters {

	public static void main(String[] args) {
		String s="aancd";
		char[] c=s.toCharArray();
		HashSet<Character> h=new HashSet<>();
		boolean chk;
		
		chk = hasDuplicate(c, h);
		
		if(chk) {
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

	private static boolean hasDuplicate(char[] c, HashSet<Character> h) {
		for(char ch:c) {
			if(h.contains(ch)) {
				return false;
			}
			else {
				h.add(ch);
			}			
		}
		return true;	
	}

}
