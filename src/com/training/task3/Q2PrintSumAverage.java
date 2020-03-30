package com.training.task3;

import java.util.Scanner;

public class Q2PrintSumAverage {

	public static void main(String[] args) {
		
		System.out.println("Enter 10 numbers - ");
		Scanner sc=new Scanner(System.in);
		int num=0;
		double avg=0;
		
		for(int i=1;i<=10;i++)
		{
			num+=sc.nextInt();
		}
		
		System.out.println("Sum of entered 10 numbers is - " + num);
		
		avg=num/10;
		System.out.println("Average of entered 10 numbers is - " + avg);
	}

}
