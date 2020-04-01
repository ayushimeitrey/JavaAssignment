package com.training.task5;

public class Q6ChangeCaseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My Name Is Ayushi Meitrey";
		String s2;
		char[] ch=s.toCharArray();
		System.out.println("Original string => "+s);
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		
		s2=String.valueOf(ch);
		System.out.println();
		System.out.println("New string with inverted case => "+s2);

	}

}
