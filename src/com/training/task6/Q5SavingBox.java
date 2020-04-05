package com.training.task6;

public class Q5SavingBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount a1=new AddAmount();
		AddAmount a2=new AddAmount(20);
		AddAmount a3=new AddAmount();
		AddAmount a4=new AddAmount(20);
		System.out.println("Total amount in saving Box is : "+ AddAmount.getAmount());
		System.out.println("Total transactions on saving Box is : "+ AddAmount.count);
	}

}
class AddAmount{
	private static double amount=50;
	static int count=0;
	
	AddAmount(){
		this.amount+=0;
		count++;
	}
	AddAmount(double amt){
		this.amount+=amt;
		count++;
	}
	public static double getAmount() {
		return amount;
	}
}
