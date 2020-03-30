package com.training.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q10SumClosestZero {

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

		Arrays.sort(A);
		int sum,l=0,r=n-1;
		int minL=l;
		int minR=r;
		int minSum=A[l]+A[r];
		
		while(l<r) {
				sum=A[l]+A[r];
				if(Math.abs(sum)<Math.abs(minSum)) {
					minSum=sum;
					minL=l;
					minR=r;
				}
				if(sum<0) l++;
				else r--;
				
		}
		
		System.out.println("Elements whose sum close to zero are : "+ A[minL]+" and "+A[minR]);
	}

}
