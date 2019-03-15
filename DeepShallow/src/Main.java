
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		Cat deep = navi.copy();
		deep.setName("deep");
		deep.getAge().setValue(4);
		deep.getAge().setYear(2015);
		
		
		System.out.println(navi.getName());
		System.out.println(deep.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(deep.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(deep.getAge().getValue());
		
	}
}
