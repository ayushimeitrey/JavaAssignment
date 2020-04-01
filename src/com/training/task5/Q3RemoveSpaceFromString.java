package com.training.task5;

public class Q3RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Ayushi Meitrey";
		String s2=s.replaceAll("\\s", "");
		System.out.println("Original string => "+s);
		System.out.println();
		System.out.println("String without spaces => "+s2);

	}

}
