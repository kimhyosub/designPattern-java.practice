package com.example.general;

public class Apple extends Fruits {
	private int price;

	public Apple() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public void printPrice() {
		System.out.println("APPLE :: " + String.valueOf(this.price) + " Won.");
	}
}
