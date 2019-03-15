
public class ComputerFactory {
	
	private Blueprint print;
	
	public void setBlueprint(Blueprint print) {
		this.print = print;
	}

	public Computer make() {
		print.setCpu();
		print.setRam();
		print.setStorage();
		return null;
	}

	public Computer getComputer() {
		return print.getComputer();
	}
}
