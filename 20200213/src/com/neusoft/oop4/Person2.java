package com.neusoft.oop4;

public class Person2 {

	// ι��
	public static void wei(Animal animal) {
		animal.eat();
	}
	
	
	
	public static void main(String[] args) {
		Animal cat = new Dog();
		wei(cat);
	}
}
