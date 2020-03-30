package com.training.task4;

import java.util.Scanner;

public class Q7DifferenceLargestSmallest {

	public static void main(String[] args) {
		int i,max,min,diff;
		System.out.println("Enter length of array (should be greater than 1)");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int[] A= new int[n];

		while(n>1) {
			System.out.println("Enter elements of array ");
			for(i=0;i<n;i++) {
				A[i]=sc.nextInt();
			}

			max=A[0];
			min=A[0];

			for(i=0;i<n;i++) {
				if(A[i]>max) {
					max=A[i];
				}
				if(A[i]<min) {
					min=A[i];
				}
			}
			diff=max-min;
			System.out.println("Difference between largest and smallest elements of array is "+ diff);

		}
	}

}
