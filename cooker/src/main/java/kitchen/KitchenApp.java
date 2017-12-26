package kitchen;

public class KitchenApp {

	public static void main(String[] args) {
		Range range = new Range();
		
		
		Microwave microwave = new Microwave();
		
		
		Cooker pizzaOven = new PizzaOven();
		
		
		Appliance dishwasher = new Dishwasher();
		
		GeneralManager gm = new GeneralManager();
		gm.add(range);
		gm.add(microwave);
		gm.add(dishwasher);
		
		KitchenManager km = new KitchenManager();
		km.add(pizzaOven);
		km.add(microwave);
		km.add(range);
		
		gm.doYourJob();
		km.doYourJob();
		
	}

}
