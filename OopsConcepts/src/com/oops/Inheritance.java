package com.oops;

//Inheritance: It is a mechanism which is one object acquires all the properties and behaviours of 
//the parent object. You can reuse the methods and fields of the parent class.
//Inheritance represents IS-A relationship.
//Why we use Inheritance in JAVA:
//	For method overriding (Runtime polymorphisim)
//    Code reuseability.

public class Inheritance {

	public static void main(String[] args) {
	   
          BabyDog bg=new BabyDog();
          bg.eat();
          bg.bark();
          bg.weep();
	}

}
class Animal{
	
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	
	void bark() {
		System.out.println(" barking");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}