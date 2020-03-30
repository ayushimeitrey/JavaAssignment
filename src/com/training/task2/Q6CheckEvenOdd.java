package com.training.task2;

import java.util.Scanner;

public class Q6CheckEvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter a number - ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if (num%2 !=0) {
			System.out.println("NEW");
		}
		else {
			if(num>=2 & num<=5) {
				System.out.println("OLD");
			}
			if(num>=6 & num<=30) {
				System.out.println("NEW");
			}
			if(num>30) {
				System.out.println("OLD");
			}
			
		}

	}

}
