package com.training.task6;

public class Q6PrintProgrammingLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming p1=new Programming();	
		Programming p2=new Programming(new String[]{"java","python"});
	}

}

class Programming{
	
	Programming(){
		System.out.println("I love programming languages");
	}
	
	Programming(String[] lang){
		for(int i=0;i<lang.length;i++)
			{
			System.out.println("I love "+lang[i]);
			}
	}
}