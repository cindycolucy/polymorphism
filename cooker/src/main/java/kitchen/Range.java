package kitchen;

public class Range extends Appliance implements Cooker {

	@Override
	public void cook() {
		System.out.println("Cooking on a hot surface!");
		
	}

}
