package buisness;

public class PetRandomAge {
	private int value;

	public PetRandomAge() {
		value = 0;
	}
	
	public int roll() {
		return value = (int) (Math.random() * 10) + 1;
	}
	
	public int getValue() {
		return value;
	}

	
	
}
