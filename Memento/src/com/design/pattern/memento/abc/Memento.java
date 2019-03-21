package com.design.pattern.memento.abc;

public class Memento {
	
	private String state;
	
	protected Memento(String state) {
		this.state = state;
	}
	
	protected String getState() {
		return this.state;
	}
}
