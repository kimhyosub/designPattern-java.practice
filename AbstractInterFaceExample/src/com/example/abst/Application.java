package com.example.abst;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Fruits> fruits = new ArrayList<Fruits>();

		Apple apple = new Apple();
		Banana banana = new Banana();
		Mango mango = new Mango();

		apple.setPrice(200);
		fruits.add(apple);
		banana.setPrice(1000);
		fruits.add(banana);
		mango.setPrice(700);
		fruits.add(mango);

		for (Fruits fruit : fruits) {
			fruit.printPrice();
			fruit.printFeatures();
			System.out.println();
		}
	}
}
