package com.training.task4;

public class Q2SecondLargestElement {

	public static void main(String[] args) {
		int[] a=new int[] {1,22,1,13,5,6,10, 99, 73,38,40,29,39,44,100,39,22,31};
		int temp;
		int size=a.length;
		
		System.out.println("Array is ");
		for(int i=0;i<size;i++)
		{  
			System.out.println(a[i]);
		}
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < size; i++)
		{
			if(a[i] > max) {
				secMax = max;
				max = a[i];			
			}
			else if ( a[i] > secMax) {
				secMax = a[i];
			}
		}
		
		System.out.println("\nSecond lasrgest element in the Array is "+ secMax);
		
	}

}
