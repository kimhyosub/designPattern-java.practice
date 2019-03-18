package linux;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class LinuxFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextarea() {
		return new LinuxTextArea();
	}

}
