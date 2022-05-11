package com.ankit.inheritance;

public class Child  extends Parent{
	
	public Child (){
		
		
		System.out.println("This is Child Constructor");
	}
	
	public void print() {
		
		System.out.println("My Name is " + name);
	}
	
	public static void main(String[] args) {
		
		Child c= new Child();
		c.print();
	}

}
