package com.training.task4;

import java.util.Scanner;

public class Q8ReturnNewlength {

	public static void main(String[] args) {
		int i,count=0;
		
		System.out.println("Enter length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] A= new int[n];
		int[] B = new int[n];

		System.out.println("Enter elements of array");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}

		for(i=0;i<n-1;i++) {
			if (A[i] != A[i+1]) 
	            B[count++] = A[i];
			
		}
		B[count++] = A[n-1]; 
		
		System.out.println("Elements of New array without duplicates");
		for(i=0;i<count;i++)
		{
			System.out.print(B[i]);
		}
		
		System.out.println("\nLength of New array without duplicates is "+count);
	}


	}


