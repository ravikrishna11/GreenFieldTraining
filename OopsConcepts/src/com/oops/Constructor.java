package com.oops;

//Constructor:  A Constructor is a block of code similar to method. It is called when an instance 
//of class is created. At the time of calling constructor, memory for the object is allocated
//in the memory
//
//It is a specia type of method which is used to initialize the object.

public class Constructor {

	public static void main(String[] args) {
		
		Students s1=new Students(40, "ravi");
		Students s2=new Students(41, "pavan");
		
		s1.display();
		s2.display();

	}

}

class Students{
	
	int id;
	String name;
	
	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}