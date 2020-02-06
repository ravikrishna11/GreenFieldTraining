package com.oops;

//Abstract class: A class which is created with abstract keyword is known as abstract class.
//It can have both abstract and non-abstract methods.
//
//Abstraction in Java: Abstraction is a process of hiding the implementation details and showing
//only functionality yo the user.
//
//Ways to achieve: Abstraction class (0 to 100%) and Interface 100%


public class TestAbstraction {

	public static void main(String[] args) {
	
		Bike b= new Honda();
		b.run();
		b.changeGear();

	}

}

abstract class Bike{
	
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear changed");
	}
}
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Running salefy");
		
	}
	
}