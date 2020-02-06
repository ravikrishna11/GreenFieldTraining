package com.oops;

//Polymorphism: It is a concept which we can perform single action iin different ways.
//There are two types of Polymorphism.
//
//1.compile time (method overloading)
//2.Runtime (method overriding)

//Runtime Polymorphism: It is also know as dynamic dispatch. Dynamic polymorphism is a process in
//which is call to an overridden method is resolved at runtime. Then it is called Runtime
//polymorphism. Method overriding is a example of Runtime polymorphism. 
//
//Method Overriding: if the sub-class have same method which is already defined in parent class
//if the child class does not satisfied with parent class implementation. Then child class creates
//the own implementation of the parent class.



public class MethodOverriding {

	public static void main(String[] args) {
	
            Pulsar pl=new Pulsar();
            pl.abs();
	}

}
class Motorcycle{
	
  void twodisc() {
	System.out.println(" two disc");
}
  void abs() {
	  System.out.println("It is not abs control");
  }
}
class Pulsar extends Motorcycle{
	void abs() {
		System.out.println("It is abs control");
	}
}