
public class Cat extends Animal implements Pet {
	
	String name;
	
	public Cat (String name) {
		this.name = name;
		setLegs(4);
	}
	
	public Cat() {
		setLegs(4);
		setName();
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName() {
		setName("");
	}
	
	public String getName() {
		return name;
	}
	
	public void play() {
		String a = ("The cat is playing with a ball of yarn");
		System.out.println(a);
	}
	
	public String eat() {
		
		String a = ("The cat is eating");
		return a;
	}
	
	
	
	

}
