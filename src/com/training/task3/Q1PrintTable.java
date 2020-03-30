package com.training.task3;

import java.util.Scanner;

public class Q1PrintTable {

	public static void main(String[] args) {
		System.out.println("Enter a number - ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+ num*i);
		}

	}

}
