package com.training.task3;

import java.util.Scanner;

public class Q5DisplayDigit {

	public static void main(String[] args) {
		System.out.println("Enter a Long number  ");
		Scanner sc=new Scanner(System.in);
		Long n=sc.nextLong();
		
		int size=n.toString().length();
		int sum=0;
		
		for(int i=0;i<size;i++) {
			
			sum+=n%10;
			n=n/10;
			
		}
		System.out.println("Number of digits "+size);
		System.out.println("Sum of digits "+sum);
	}

}
