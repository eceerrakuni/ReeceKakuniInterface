
public class Fish extends Animal implements Pet {
	
	String name;
	
	public Fish() {
		setName("Piscene");
	}
	
	
	public String walk() {
		String a = ("Fish do not have legs and can't walk");
		return a;
	}
	
	public void play() {
		String a = ("The fish is blowing bubbles.");
		System.out.println(a);
	}
	
	
	public String getName() {
		return name;
	}
	
	public String eat() {
		String a = ("Fish do not have legs and can't walk");
		return a;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}	
	
	
	
	
	

}
