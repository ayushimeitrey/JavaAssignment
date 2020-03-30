package com.training.task4;

public class Q3SecondSmallest {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,4,21,34};
		int small=Integer.MAX_VALUE;
		int secSmall=Integer.MAX_VALUE;

		System.out.println("Array is ");
		for(int i=0;i<a.length;i++)
		{  
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				secSmall=small;
				small=a[i];
			}
			else if(a[i]<secSmall) {
				secSmall=a[i];
			}
		}
		System.out.println("\nSecond smallest element in the Array is "+ secSmall);
	}

}
