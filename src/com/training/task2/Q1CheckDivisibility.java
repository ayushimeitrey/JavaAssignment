package com.training.task2;

import java.util.Scanner;

public class Q1CheckDivisibility {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter a number - ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num % 3 == 0 & num % 5 == 0)
		{
			System.out.println("Consultadd Java Training");
			return;
		}
		
		if(num % 3 == 0)
		System.out.println("Consultadd");
		
		if(num % 5 == 0)
		System.out.println("Java Training");

	}

}
