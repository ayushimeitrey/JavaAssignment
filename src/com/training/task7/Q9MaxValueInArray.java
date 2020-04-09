package com.training.task7;

import java.util.Scanner;

public class Q9MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, max=0;
		System.out.println("Enter length of array ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter elements of array ");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
			if(A[i]>max) {
				max=A[i];
			}
		}
		
		System.out.println("MAximun value in the array is = "+max);
	}

}
