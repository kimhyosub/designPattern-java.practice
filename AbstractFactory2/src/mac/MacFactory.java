package mac;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class MacFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextarea() {
		return new MacTextArea();
	}

}
