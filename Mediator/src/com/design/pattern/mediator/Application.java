package com.design.pattern.mediator;

import com.design.pattern.mediator.contract.Colleague;
import com.design.pattern.mediator.contract.Mediator;

public class Application {
	public static void main(String[] args) {
		
		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		System.out.println("colleague1 - " + colleague1);
		System.out.println("colleague2 - " + colleague2);
		System.out.println("colleague3 - " + colleague3);
		
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");
		
		
		
		
	}
}
