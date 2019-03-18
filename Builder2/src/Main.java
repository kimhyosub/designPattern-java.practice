
public class Main {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder
				.startWithCpu("i7")
				.setRam("8G")
				.setStorage("256G ssd")
				.build();
		
		System.out.println(computer.toString());
	}
}
