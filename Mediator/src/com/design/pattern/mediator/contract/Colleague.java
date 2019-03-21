package com.design.pattern.mediator.contract;

public abstract class Colleague {
	private Mediator mediator;
	
	public boolean join(Mediator mediator) {
		if(mediator != null) {
			this.mediator = mediator;
			return mediator.addColleague(this);
		} else {
			return false;
		}
	}
	
	public void sendData(String data) {
		if(mediator != null) {
			mediator.mediate(data);
		}
	}
	
	public abstract void handle(String data);
}
