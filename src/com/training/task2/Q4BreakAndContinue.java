package com.training.task2;

import java.util.Scanner;

public class Q4BreakAndContinue {

	public static void main(String[] args) {
		int num;
		boolean check=true;
		while(check)
		{
			System.out.println("Enter a number - ");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			if(num<0)
			{
				System.out.println("It's Over");			
				break;
			}
			else
			{
				System.out.println("Good Going");
				continue;
			}
		}

	}

}
