package com.training.task7;

import java.util.*;

public class Q2FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar=new int[256];
		String s="My name is ayushiM";
		char[] c=s.toCharArray();
		
		for(char ch:c) {
			ar[ch]++;
		}
		
		for(char ch:c) {
			if(ar[ch]==1) {
				System.out.println("First non repeating value is = "+ch);
				break;
			}
		}
		
		
/*		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<c.length;i++) {
			if(hm.containsKey(c[i]))
				hm.put(c[i], hm.get(c[i]) + 1);
			else
				hm.put(c[i],1);
		}
		
		for(char ch : c){
			if(hm.get(ch)==1)
			{
				System.out.print("First non repeating value is = "+ch);
				break;
			}
		}*/
		
		
	}

}
