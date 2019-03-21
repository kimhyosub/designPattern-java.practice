package com.design.pattern.memento;

import java.util.Stack;

import com.design.pattern.memento.abc.Memento;
import com.design.pattern.memento.abc.Originator;

public class Application {
	public static void main(String[] args) {
		
		Stack<Memento> mementos = new Stack();
		
		Originator originator = new Originator();
		originator.setState("state 1");
		mementos.push(originator.createMemento()); 
		originator.setState("state 2");
		
//		Protected로 선언하면 보안성이 향상 됩니다.
//		Memento memento = originator.createMemento();
//		memento = new Memento();
		
		mementos.push(originator.createMemento());
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState()); // state Final
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState()); // state 3
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState()); // state 2
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState()); // state 1
		
	}
}
