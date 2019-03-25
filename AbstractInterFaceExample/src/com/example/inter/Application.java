package com.example.inter;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Apple apple = new Apple();
		Banana banana = new Banana();
		Mango mango = new Mango();

		List<PrintPriceBehavior> fruits = new ArrayList<PrintPriceBehavior>();
		apple.setPrice(300);
		fruits.add(apple);
		banana.setPrice(1000);
		fruits.add(banana);
		mango.setPrice(800);
		fruits.add(mango);

		for (PrintPriceBehavior fruit : fruits) {
			fruit.printPrice();
		}

	}

}
