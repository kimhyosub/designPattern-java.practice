package com.example.inter;

public class Banana implements PrintPriceBehavior {

	private int price;

	public Banana() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	@Override
	public void printPrice() {
		// TODO Auto-generated method stub
		System.out.println("BANANA :: " + String.valueOf(this.price) + " Won.");
	}

}
