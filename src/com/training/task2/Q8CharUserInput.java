package com.training.task2;

import java.util.Scanner;

public class Q8CharUserInput {

	public static void main(String[] args) {
		System.out.println("Enter a character - ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch=='r' |ch=='a' |ch=='n' |ch=='d' |ch=='o' |ch=='m' |ch=='R' |ch=='A' |ch=='N' |ch=='D' |ch=='O' |ch=='M') {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
