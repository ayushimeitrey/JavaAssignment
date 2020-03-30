package com.training.task4;

public class Q1RemoveDuplicate {

	public static void main(String[] args) {
		int[] ar=new int[]{1,2,3,2,5,6,1,7};
		
		System.out.println("Initial Array");
		for(int i=0;i<ar.length;i++)
		{  
			System.out.print(ar[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[i]==ar[j])
						ar[j]=0;
			}
		}
		System.out.println("\nArray After deplicate value removed");
		for(int i=0;i<ar.length;i++)
		{  if(ar[i]!=0)
			System.out.print(ar[i]);
		}
	}

}
