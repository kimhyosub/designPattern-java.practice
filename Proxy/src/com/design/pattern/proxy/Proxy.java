package com.design.pattern.proxy;

public class Proxy implements Subject{
	
	private Subject real;
	
	public Proxy(Subject real) {
		this.real = real;
	}

	@Override
	public void action1() {
		System.out.println("간단한 업무 By Proxy");
		
	}

	@Override
	public void action2() {
		real.action2();
	}

}
