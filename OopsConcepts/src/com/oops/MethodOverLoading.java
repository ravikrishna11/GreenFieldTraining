package com.oops;

//Polymorphism: It is a concept which we can perform single action iin different ways.
//There are two types of Polymorphism.
//
//1.compile time (method overloading)
//2.Runtime (method overriding)
//
//Compile time polymorphism: It is resolved during compiler time is known as static polymorphism.
//Method overloading is example of compile time polymorphism
//
//
//Method overloading: If the class have same method names but with different parameters is known as
//method overloading.


public class MethodOverLoading {

	public static void main(String[] args) {
		
		Calculator ca=new Calculator();
		System.out.println(ca.add(10, 11));
		System.out.println(ca.add(10, 11, 12));

	}

}
class Calculator{
	
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}