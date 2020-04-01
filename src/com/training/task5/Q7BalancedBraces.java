package com.training.task5;

public class Q7BalancedBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="({{)}[}]()";
		char[] c=s.toCharArray();
		int counter1=0,counter2=0,counter3=0;
		
		for(int i=0;i<c.length;i++) {
			
			if(c[i]=='{') counter1++;
			if(c[i]=='}') counter1--;
			if(c[i]=='(') counter2++;
			if(c[i]==')') counter2--;
			if(c[i]=='[') counter3++;
			if(c[i]==']') counter3--;
				
		}
		if(counter1==0 && counter2==0 && counter3==0)
		{
			System.out.println("Balanced Braces");
		}
		else
			System.out.println("Unbalanced Braces");
	}

}
