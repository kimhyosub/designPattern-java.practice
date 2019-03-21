package com.design.pattern.mediator;

import com.design.pattern.mediator.contract.Colleague;
import com.design.pattern.mediator.contract.Mediator;

public class ChatMediator extends Mediator{

	@Override
	public void mediate(String data) {
		
		for (Colleague colleague : colleagues) {
			// 중재가능성.
			colleague.handle(data);
		}
	}
	
}
