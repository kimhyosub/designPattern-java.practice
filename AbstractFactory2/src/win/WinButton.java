package win;

import abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("Windows BUTTON");
	}

}
