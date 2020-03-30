package com.training.task3;

import java.util.Scanner;

public class Q4SumNNum {

	public static void main(String[] args) {
		System.out.println("Enter a number  ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum=n*(n+1)/2;
		}
		
		/*for(int i=1;i<=n;i++) {
			sum+=i;
		}*/
		
		System.out.println("sum of "+n+" natural numbers is "+sum);
	}

}
