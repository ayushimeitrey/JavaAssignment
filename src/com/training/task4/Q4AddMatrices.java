package com.training.task4;

import java.util.Scanner;

public class Q4AddMatrices {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter row for matrics");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("Enter column for matrics");
		int c=sc.nextInt();
		
		int[][] A=new int[r][c];
		int[][] B=new int[r][c];
		int[][] sum=new int[r][c];
		
		System.out.println("Enter 1st Array");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				A[i][j]=sc.nextInt();
			}			
		}
		System.out.println("Enter 2st Array");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				B[i][j]=sc.nextInt();
			}			
		}
		
		System.out.println("Sum of Array");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				sum[i][j]=A[i][j]+B[i][j];
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}

	}

}
