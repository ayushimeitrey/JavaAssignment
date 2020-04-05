package com.training.task6;

import java.util.Scanner;

public class Q1ArithmeticOperationComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1,r2,c1,c2;
		char op;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter real part of 1st number - ");
		r1=sc.nextInt();
		System.out.println("Enter real part of 2nd number - ");
		r2=sc.nextInt();
		System.out.println("Enter complex part of 1st number - ");
		c1=sc.nextInt();
		System.out.println("Enter complex part of 2nd number - ");
		c2=sc.nextInt();
		System.out.println("Enter operation on complex numbers (+,-,*) - ");
		op=sc.next().charAt(0);
		
		Complex c=new Complex();
		
		switch(op) {
		
		case '+': c.addComplex(r1,c1,r2,c2);break;
		case '-': c.subComplex(r1,c1,r2,c2);break;
		case '*': c.multiplyComplex(r1,c1,r2,c2);break;
		default : System.out.println("Invalid Operation"); break;
		}
		
	}
}
	
class Complex{
	 public void addComplex(int r1, int c1, int r2, int c2) {
		// TODO Auto-generated method stub
		int s1,s2;
		s1=r1+r2;
		s2=c1+c2;
		System.out.println("Sum of two complex numbers is : " +s1+" + i "+s2);
	}

	 public void subComplex(int r1, int c1, int r2, int c2) {
		// TODO Auto-generated method stub
		int d1,d2;
		d1=r1-r2;
		d2=c1-c2;
		System.out.println("Difference of two complex numbers is : " +d1+" + i "+d2);
		
	}

	public void multiplyComplex(int r1, int c1, int r2, int c2) {
		// TODO Auto-generated method stub
		int m1,m2;
		m1=r1*r2;
		m2=c1*c2;
		System.out.println("Multiplication of two complex numbers is : " +m1+" + i "+m2);
	}

}
