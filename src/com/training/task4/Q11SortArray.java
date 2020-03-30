package com.training.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q11SortArray {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter length of array ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		System.out.println("Enter elements of array ");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		
		int j=0,k=n-1,count=0;
		
		while(j<k) {
			B[count++]=A[k];
			B[count++]=A[j];
			k--;
			j++;
			
		}
		if(n%2!=0) {
			B[count++]=A[(n-1)/2];	
		}
		
		System.out.println("Sorted Array is ");
		for(int z=0;z<n;z++) {
			System.out.print(B[z]+" ");
		}
	}

}
