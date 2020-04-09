package com.training.task7;

import java.util.Scanner;

public class Q6ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int a,sum=0;
		int temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			sum+=(a*a*a);
		}
		
		if(temp==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("NOT Armstrong number");
		}
	}

}
