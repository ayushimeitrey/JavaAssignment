package com.training.task4;

import java.util.Scanner;

public class Q5MoveZeroEnd {

	public static void main(String[] args) {
		int i,count=0;
		
		System.out.println("Enter length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] A= new int[n];
		
		System.out.println("Enter elements of array");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			if(A[i]!=0) {
				A[count++]=A[i];
			}
			
		}
		while(count<n) {
			A[count++]=0;
		}

		for(i=0;i<n;i++)
		{
			System.out.println(A[i]);
		}
	}

}
