package com.neusoft.oop4;

public class Car {

	public void setSpeed(int speed) {
		if(speed <0 || speed >500) {
			this.speed = 0;
		}
	}
	
	public void setGasoline(String gasoLine) {
		if(!"����".equals(gasoLine)) {
			this.gasoline = "�ü�����.";
		}
	}
	
	public void setMoney(String money) {
		if(!"�����".equals(money)) {
			this.money = "��Ҫ�����";
		}
	}
	
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", gasoline=" + gasoline + ", money=" + money + "]";
	}

	private int speed;
	
	private String gasoline;
	
	private String money;
	
}