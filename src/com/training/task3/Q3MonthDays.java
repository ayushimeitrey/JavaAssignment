package com.training.task3;

import java.util.Scanner;

public class Q3MonthDays {

	public static void main(String[] args) {
		System.out.println("Enter month number (Ex: Select 1 for Jan, 2 for Feb)  ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a>12| a<0)
		{
			System.out.println("Invalid Details");
		}
		else if(a==2)
		{
			System.out.println("Number of Days are 28");
		}
		else if(a==4 | a==6 |a==9 |a==11)
		{
			System.out.println("Number of Days are 30");
		}
		else
		{
			System.out.println("Number of Days are 31");
		}

	}

}
