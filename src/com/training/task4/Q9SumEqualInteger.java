package com.training.task4;

import java.util.Scanner;

public class Q9SumEqualInteger {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter length of array ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter elements of array ");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("Enter value which is equal to sum of integers ");
		int val=sc.nextInt();
		
		int currSum=0;
		int l=0;
		int r=n-1;
		while(l<r) {
			currSum=A[l]+A[r];
			if(currSum==val)
			{
				System.out.println("Array elemnts whose sum equal to given integer "+val+" are "+A[l]+" and "+A[r]);
			}
			if(currSum<val) {	
				l++;
			}
			else r--;
		}
		
	}

}
