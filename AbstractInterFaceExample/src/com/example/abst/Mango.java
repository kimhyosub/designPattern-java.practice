package com.example.abst;

public class Mango extends Fruits {

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

	@Override
	public void printFeatures() {
		// TODO Auto-generated method stub
		System.out.println("빙수만들어 먹으면 좋지요.");
	}

}
