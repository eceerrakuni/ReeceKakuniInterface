
public abstract class Animal {
	
	protected int legs;
	
	public void setLegs(int amnt) {
		legs = amnt;
	}
	
	public abstract String eat();

	public String walk() {
		String a = ("This animal walks with " + legs + " legs.");
		return a;
	}
	
	
}
