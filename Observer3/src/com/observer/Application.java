package com.observer;

import com.observer.Observable.Observer;

public class Application {
	
	public static void main(String[] args) {
		
		// 1. 제네릭
		// 2. 델리게이트
		// 3. 내부에 옵저버를 넣는다.
		
		Button button = new Button();
		
		button.addObserver(new Observer<String>() {
			
			@Override
			public void update(Observable<String> o, String arg) {
				System.out.println(o + "is Clicked");
			}
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
		
		
	}
}
