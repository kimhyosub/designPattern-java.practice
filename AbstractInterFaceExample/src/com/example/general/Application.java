package com.example.general;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Fruits> fruits = new ArrayList<Fruits>();
		Apple apple = new Apple();
		Banana banana = new Banana();
		Mango mango = new Mango();

		apple.setPrice(300);
		banana.setPrice(1000);
		mango.setPrice(900);

		fruits.add(apple);
		fruits.add(banana);
		fruits.add(mango);

		for (Fruits fruit : fruits) {
			fruit.printPrice();
		}
	}
}
