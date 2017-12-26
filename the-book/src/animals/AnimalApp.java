package animals;

public class AnimalApp {
	public static void main(String[] args) {

		Hippo hippo = new Hippo();
		writeDelimiter(hippo);
		doThings(hippo);
		
		Animal cow = new Cow("grass");
		writeDelimiter(cow);
		doThings(cow);
		
		Animal tiger = new Carnivore();
		doThings(tiger);
		
		System.out.println("Feed the cow!");
		cow.feed("grass");
		cow.feed("marbles");
		System.out.println("Now it is " + cow);
		System.out.println("Cow hunger: " + cow.hunger);
		
		System.out.println("Feed the hippo!");
		hippo.feed("grass");
		hippo.feed("marbles");
		System.out.println("After eating: " + hippo);
		
		System.out.println("Feed the tiger!");
		tiger.feed("peanuts");
		System.out.println("Now it is " + tiger);
		System.out.println("Tiger hunger: " + tiger.hunger);
		
	}
	
	public static void writeDelimiter(Object o) {
		System.out.println("With " + o);
	}
	
	public static void doThings(Animal a) {
		a.eat();
		a.sleep();
		a.roam();
		a.makeNoise();
	}
	
}