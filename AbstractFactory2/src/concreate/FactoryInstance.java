package concreate;

import abst.GuiFactory;
import linux.LinuxFactory;
import mac.MacFactory;
import win.WinFactory;

public class FactoryInstance {

	public GuiFactory getGuiFac() {
		
		switch (getOsCode()) {
		case 0: return new MacFactory();
		case 1: return new LinuxFactory();
		case 2: return new WinFactory();
		}
		return null;
	}

	private int getOsCode() {
		if(System.getProperty("os.name").equals("Windows 10")) {
			return 2;
		} 
		return 0;
	}
	
}
