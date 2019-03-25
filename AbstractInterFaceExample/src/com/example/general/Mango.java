package com.example.general;

public class Mango extends Fruits {
	private int price;

	public Mango() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public void printPrice() {
		System.out.println("MANGO :: " + String.valueOf(this.price) + " Won.");
	}
}
