package win;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class WinFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextarea() {
		return new WinTextArea();
	}

}
