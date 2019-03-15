
public class Main {

	public static void main(String[] args) {

		// 설계도를 가지고있고 설계도를 바탕으로 만들고 가져오는 역할
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		factory.make();
		
		Computer computer = factory.getComputer();
		
		//Computer computer = new Computer("i7", "8G", "500G SSD");
		
		System.out.println(computer.toString());
	}
	
}
