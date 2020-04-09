package com.training.task7;

import java.util.HashSet;

public class Q10CombinationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String res= "";
		Combination(res,s);

	}

	private static void Combination( String res,String s) {
		// TODO Auto-generated method stub
		
		char[] ch=s.toCharArray();
		
		System.out.print(res+" ");
				
		for(int i=0;i<s.length();i++) {
			Combination(res+ch[i],s.substring(i+1));
		}
	}

}
