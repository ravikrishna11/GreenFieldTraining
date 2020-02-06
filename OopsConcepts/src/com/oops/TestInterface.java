package com.oops;

//Interface: Interface is a mechanism to achieve abstraction. It can have only abstract methods 
//without body. It is used to acheieve multiple inheritance.

public class TestInterface {

	public static void main(String[] args) {
		
		A1 a= new A1();
		a.print();
		a.show();

	}

}

interface Printable{
	void print();
}

interface Showable{
	void show();
}

class A1 implements Printable,Showable{

	@Override
	public void show() {
		System.out.println("Hello showing");
		
	}

	@Override
	public void print() {
		System.out.println("Welcome printing");
		
	}
	
	
}