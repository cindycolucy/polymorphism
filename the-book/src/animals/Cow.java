package animals;

public class Cow extends Animal {

	public Cow(String preferredFood) {
		super(preferredFood);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("mOO");
	}

	public boolean wantsCud() {
		return hunger >= 0;
	}
	
	// need to eat grass
}