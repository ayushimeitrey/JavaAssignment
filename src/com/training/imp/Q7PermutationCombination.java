package com.training.imp;

public class Q7PermutationCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		String res="";
		System.out.println("-------Permutation---------");
		permute(s,res);
		System.out.println("-------Combination---------");
		combination(s,res);
	}

	private static void combination(String s, String res) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		
		System.out.println(res);
		
		for(int i=0;i<ch.length;i++) {
			String st=s.substring(i+1);
			combination(st,res+ch[i]);
		}
		
	}

	private static void permute(String s, String res) {
		// TODO Auto-generated method stub
		
		char[] ch=s.toCharArray();
		
		if(s.length()==0) {
			System.out.println(res);
			return;
		}
		for(int i=0;i<ch.length;i++) {
			String st=s.substring(0,i)+s.substring(i+1);
			permute(st,res+ch[i]);
		}
	}

}
