package com.training.task3;

import java.util.Scanner;

public class Q11CheckFloating {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 floating point numbers - ");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		
		if(Math.abs(a-b)<=0.01)
		{
			System.out.println("Entered 2 floating point numbers are same upto two decimal points ");
		}
		else 
			System.out.println("Entered 2 floating point numbers are NOT same upto two decimal points ");
	}

}
