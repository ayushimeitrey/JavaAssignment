package com.training.task2;

import java.util.Scanner;

public class Q7CheckFloat {

	public static void main(String[] args) {
		System.out.println("Enter a floating point number - ");
		Scanner sc=new Scanner(System.in);
		float num=sc.nextFloat();
		
		if(num==0) {
			System.out.println("ZERO");
		}
		if(num>0) {
			System.out.println("Positive");
		}
		if(num<0) {
			System.out.println("Negative");
		}
		if(Math.abs(num)<1) {
			System.out.println("Small");
		}
		if(Math.abs(num)>1000000) {
			System.out.println("Large");
		}
	}

}
