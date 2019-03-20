package com.facade;

import com.facade.system.Facade;

public class Application {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.process();
	}
}
