package com.training.task6;

import java.util.Date;

public class Q2PrintClassInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Robert",1994,"64C- Walls Streat");
		Employee e2=new Employee("Sam",2000,"68D- Walls Streat");
		Employee e3=new Employee("John",1999,"26B- Walls Streat");
		
		System.out.println(e1.getName()+"\t"+e1.getYear()+"\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t"+e2.getYear()+"\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t"+e3.getYear()+"\t"+e3.getAddress());
	}

}

class Employee{
	private String name;
	private int joinYear;
	private double salary;
	private String address;
	
	Employee(String name,int i,String add){
		this.name=name;
		this.joinYear=i;
		this.address=add;
	}
	
	public void setName(String name) {
		this.name=name;	
	}
	public void setYear(int year) {
		this.joinYear=year;	
	}
	public void setSalary(Double salary) {
		this.salary=salary;	
	}
	public void setAddress(String address) {
		this.address=address;	
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return joinYear;
	}
	public Double getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
}
