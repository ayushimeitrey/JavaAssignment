package com.training.task6;

public class Q3PrintStudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student("Ayushi Meitrey");
		System.out.println("Name of student s1 is : "+s1.getName());
		System.out.println("Name of student s2 is : "+s2.getName());

	}

}
class Student{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	Student(){
		this.name="Unknown";
	}
	Student(String name){
		this.name=name;
	}
}