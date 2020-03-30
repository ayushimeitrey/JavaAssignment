package com.training.task2;

import java.util.Scanner;

public class Q2ConditionalOperation {

	public static void main(String[] args) {
		int op;
		int first,first1;
		int second,second1;
		int result=0;
		System.out.println("Enter a number to select an operation: \n 1 - Add \n 2 - Subtract \n 3 - Divide \n 4 - Multiply \n 5 - Average");
		Scanner sc=new Scanner(System.in);
		op=sc.nextInt();
		
		System.out.println("Enter two numbers");
		first=sc.nextInt();
		second=sc.nextInt();
		
		switch(op) {
		case 1: 
				result=first+second;
				break;
				
		case 2:
				result=first-second;
				break;
			
		case 3:
				result=first/second;
				break;
			
		case 4:
				result=first*second;
				break;
			
		case 5:
			System.out.println("Enter two more numbers");
			first1=sc.nextInt();
			second1=sc.nextInt();
			result=(first+second+first1+second1)/4;
			break;
		
		default: System.out.println("You selected invalid operation");
		}
		
		if(result<0)
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		else
			System.out.println("Result of the selected operation is - "+ result);
	}

}
