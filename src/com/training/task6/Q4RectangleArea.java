package com.training.task6;

public class Q4RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		System.out.println("Area of rectangle r1 is : "+r1.getArea());
		Rectangle r2=new Rectangle(10);
		System.out.println("Area of rectangle r2 is : "+r2.getArea());
		Rectangle r3=new Rectangle(10,20);
		System.out.println("Area of rectangle r3 is : "+r3.getArea());
		
	}

}

class Rectangle{
	private double length;
	private double breadth;
	
	public double getArea() {
		return (this.length*this.breadth);
	}
	Rectangle(){
		this.length=0;
		this.breadth=0;
	}
	Rectangle(double len,double bre){
		this.length=len;
		this.breadth=bre;
	}
	Rectangle(double num){
		this.length=num;
		this.breadth=num;
	}
}
