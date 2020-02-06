package com.oops;

//Super keyword: It is in java is a reference variable which is used to refer immediate parent
//class object.


public class TestSuperKeyword {

	public static void main(String[] args) {
		
		Dogs d = new Dogs();
		d.work();

	}

}

class Animals{
	
	void eats() {
		System.out.println("Animal Eating");
	}
}
class Dogs extends Animals{
	
	void eat() {
		System.out.println(" Dog eating");
	}
	void bark() {
		System.out.println("Dog barking");
	}
	void work() {
		super.eats();
		bark();
	}
}