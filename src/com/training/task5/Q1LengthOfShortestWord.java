package com.training.task5;

public class Q1LengthOfShortestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Ayushi Meitrey";
		String[] str = s.split(" ");
		int min=Integer.MAX_VALUE;
		String word="";
		
		for(String st : str) {
			if(st.length()<min)
				{
					min= st.length();
					word=st;
				}
		}

		System.out.println("Shortest word is = "+word);
		System.out.println("Length of the shortest word is = "+min);
	}

}
