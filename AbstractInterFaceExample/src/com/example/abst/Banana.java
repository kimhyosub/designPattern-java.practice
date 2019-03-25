package com.example.abst;

public class Banana extends Fruits {

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

	@Override
    public void printFeatures() {
        // TODO Auto-generated method stub
        System.out.println("비타민 A,D가 풍부하고, 소화가 잘되는 탄수화물 식품입니다.");
    }

}
