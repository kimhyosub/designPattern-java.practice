package com.example.general;

public class Banana extends Fruits {
	private int price;

	public Banana() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public void printPrice() {
		System.out.println("BANANA :: " + String.valueOf(this.price) + " Won.");
	}
}
