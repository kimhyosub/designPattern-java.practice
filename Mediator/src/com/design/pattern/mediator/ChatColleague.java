package com.design.pattern.mediator;

import com.design.pattern.mediator.contract.Colleague;

public class ChatColleague extends Colleague{

	@Override
	public void handle(String data) {
		System.out.println(this + " - " + data);
	}

}
