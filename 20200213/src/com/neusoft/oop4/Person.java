package com.neusoft.oop4;

public class Person {

	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(-100);
		car.setMoney("��Ԫ");
		car.setGasoline("����");
		new Person().driver(car);
	}
	public void driver(Car car) {
		System.out.println(car);
	}
}