
public class Cat implements Cloneable {
	private String name;
	private Age age;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Age getAge() {
		return age;
	}
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		Cat ret = (Cat)this.clone();
		
		// 깊은복사시 명시적으로 깊은복사가 되도록 해준다.
		ret.setAge(new Age(this.age.getYear(), this.age.getYear()));
		
		return ret;
	}
}
