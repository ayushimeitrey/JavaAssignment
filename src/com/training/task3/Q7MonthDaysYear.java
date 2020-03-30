package com.training.task3;

import java.util.Scanner;

public class Q7MonthDaysYear {

	public static void main(String[] args) {		
		String month="";
		int day=0;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Input Month Number ");
		int n=sc.nextInt();
		System.out.println("Input Year ");
		int y=sc.nextInt();
			
		if(n>12| n<0)
		{
			System.out.println("Invalid Details");
		}
		
		else if(n==2)
		{
			if(y%4==0)
				day=29;
			else 
				day=28;
				
		}
		else if(n==4 | n==6 |n==9 |n==11)
		{
			day=30;
		}
		else
		{	day=31;}
		
		switch(n)
		{
		case 1: month="January";break;
		case 2: month="February";break;
		case 3: month="March";break;
		case 4: month="April";break;
		case 5: month="May";break;
		case 6: month="June";break;
		case 7: month="July";break;
		case 8: month="August";break;
		case 9: month="September";break;
		case 10: month="October";break;
		case 11: month="November";break;
		case 12: month="December";break;
		default: month="N/A";
		}
		
		
		System.out.println(month+" "+y+" has "+day+" days ");

	}

}
