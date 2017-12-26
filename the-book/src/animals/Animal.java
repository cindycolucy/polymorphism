package animals;

//abstract classes can't be instantiated
//(unlike concrete classes)
public abstract class Animal {

	private String food;

	// protected from things:
	// - outside of the class hierarchy
	// - outside of the package
	// (must be same package or a subclass to access)
	protected int hunger = 50;

	private Object boundaries;
	private Object location;

	// this indicates that animals make noise
	// in an interface this would look like:
	// void makeNoise();
	public abstract void makeNoise();
	
	public Animal(String preferredFood) {
		this.food = preferredFood;
		System.out.println(this + " likes to eat " + food);
	}
	public void feed (String foodToEat){
		if(foodToEat.equals(food)){
		eat();
		}else{
			System.out.println("I don't eat " + foodToEat);
		}
	}

	public void eat() {
		System.out.println("yum");
		hunger -= 5;
	}

	public void sleep() {
		System.out.println("zzzzz");
	}

	public void roam() {
		System.out.println("wander");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ", hunger is " + hunger;
	}
}