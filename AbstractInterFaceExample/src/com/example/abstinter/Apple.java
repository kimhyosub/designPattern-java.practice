package com.example.abstinter;

public class Apple extends Fruits implements DutyBehavior {

	private int price;

	public Apple() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	@Override
	public void printPrice() {
		// TODO Auto-generated method stub
		System.out.println("APPLE :: " + String.valueOf(this.price) + " Won.");
	}

	@Override
	public void printFeatures() {
		// TODO Auto-generated method stub
		System.out.println("아침에 먹어야 좋습니다. 노화예방에 좋은 과일입니다.");
	}

	@Override
	public void printDuty() {
		// TODO Auto-generated method stub
		System.out.println("APPLE, DUTY FREE !!");
	}

}
