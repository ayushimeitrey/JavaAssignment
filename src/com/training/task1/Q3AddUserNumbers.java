package com.training.task1;

import java.util.Scanner;

public class Q3AddUserNumbers {

	public static void main(String[] args) {
		int first;
		int second;
		int z,result;
		
		System.out.println("Enter two numbers between 1 and 10");
		Scanner sc=new Scanner(System.in);
		first=sc.nextInt();
		second=sc.nextInt();
		if (first>10 | second>10|first<0 |second<0) {
			System.out.println("Numbers should be between 1 and 10");
			return;
		}
		z=first+second;
		result=z+30;

		System.out.println("Result is :"+result);

	}

}
