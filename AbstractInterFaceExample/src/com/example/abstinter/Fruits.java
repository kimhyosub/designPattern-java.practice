package com.example.abstinter;

public abstract class Fruits {
	private int price;

	public Fruits() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	abstract public void printPrice();

	abstract public void printFeatures();
}
