package com.training.task3;

import java.util.Scanner;

public class Q10PascalTriangle {

	public static void main(String[] args) {
		System.out.println("Input number of rows - ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int [][] A=new int[row][row];
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					A[i][j]=1;
				}
				else {
					A[i][j]=A[i-1][j-1]+A[i-1][j];
				}
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}

	}

}
