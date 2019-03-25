package com.example.inter;

public class Mango implements PrintPriceBehavior {

	private int price;

	public Mango() {
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	@Override
	public void printPrice() {
		// TODO Auto-generated method stub
		System.out.println("MANGO :: " + String.valueOf(this.price) + " Won.");
	}

}
