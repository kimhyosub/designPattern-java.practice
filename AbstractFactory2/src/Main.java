import abst.Button;
import abst.GuiFactory;
import abst.TextArea;
import concreate.FactoryInstance;

public class Main {
	
	public static void main(String[] args) {
		GuiFactory fac = new FactoryInstance().getGuiFac();
		
		Button button = fac.createButton();
		TextArea textArea = fac.createTextarea();
		
		button.click();
		System.out.println(textArea.getText());
		
		System.out.println(System.getProperty("os.name"));
	}
}
