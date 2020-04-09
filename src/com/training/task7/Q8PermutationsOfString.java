package com.training.task7;

public class Q8PermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		String res= "";
		
		permute(s,res);

	}

	private static void permute(String s,String res) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		
		if(s.length()==0) {
			System.out.print(res+ " ");
			return;
		}
		
		for(int i=0;i<s.length();i++) {
			String st=s.substring(0, i)+s.substring(i+1);
			permute(st,res+ch[i]);
		}
		
	}

}
