package com.training.task3;

import java.util.Scanner;

public class Q8LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a Year ");
		Scanner sc=new Scanner(System.in);	
		int y=sc.nextInt();
		if (y%4==0) {
			System.out.println("Entered year is a Leap Year");
		}
		else
			System.out.println("Entered year is NOT a Leap Year");
	}

}
