package com.training.task1;

import java.util.Scanner;

public class Q1Swapping {
public static void main(String[] args) {
	int first;
	int second;
	int temp;
	
	System.out.println("Enter two numbers");
	Scanner sc=new Scanner(System.in);
	first=sc.nextInt();
	second=sc.nextInt();
	
	System.out.println("Before swapping numbers are:");
	System.out.println("First Number:"+first+" Second Number:"+second);
	
	temp=first;
	first=second;
	second=temp;
	
	System.out.println("After swapping numbers are:");
	System.out.println("First Number:"+first+" Second Number:"+second);
	
	first=first+second;
	second=first-second;
	first=first-second;
	System.out.println("After swapping without using temp variable, the numbers are:");
	System.out.println("First Number:"+first+" Second Number:"+second);
	}
}
