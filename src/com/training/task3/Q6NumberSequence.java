package com.training.task3;

import java.util.Scanner;

public class Q6NumberSequence {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(b>a & c>b) {
			System.out.println("INCREASING");
		}
		else if(b<a & c<b) {
			System.out.println("DECREASING");
		}
		else {
			System.out.println("Neither increasing or decreasing order");
		}
	}

}
