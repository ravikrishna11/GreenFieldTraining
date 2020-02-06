package com.oops;

//Encapsulation: It is a process of wrapping code and data together into a single unit, we can
//create a fully encapsulated class in java by making all the members of the class private. Now 
//we can use getter and setter methods to set and get the data.

//How to Achieve: Data hiding in java. b/c other class will not be able to access the data through
//the private data members.

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Student s= new Student();
		s.setName("Ravi");
		s.setRoll(40);
		s.setAge(25);
		System.out.println("Student Name is: "+s.getName());
		System.out.println("Student roll number is: "+s.getRoll());
		System.out.println("Student age is: "+s.getAge());
		
	
		

	}

}

 class Student{
	
	private String name;
	private int roll;
	private int age;
	
	public void setName(String n) {
		name=n;
	}
	public void setRoll(int r) {
		roll=r;
	}
	public void setAge(int a) {
		age=a;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public int getAge() {
		return age;
	}
}
