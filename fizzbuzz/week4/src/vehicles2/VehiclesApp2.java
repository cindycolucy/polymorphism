package vehicles2;

public class VehiclesApp2 {

	public static void main(String[] args) {
		
		Vehicles2 van = new DeliveryVan();
		deliverStuffWith(van);

		System.out.println();
		
		Vehicles2 truck = new BoxTruck();
		deliverStuffWith(truck);
		
		System.out.println();
		
		Vehicles2 bicycle = new Bicycle2();
		deliverStuffWith(bicycle);
	}
	
	private static void deliverStuffWith(Vehicles2 v) {
		System.out.println("My vehicle is a " + v.getVehicleType());
		System.out.println("My vehicles current range is " + v.currentRange());
		System.out.println("I have enough gas for " + v.travelTimeBeforeRefueling() + " hours");
		System.out.println("In 3 hours, I travel " + v.travelFor(3));
		System.out.println("In 6 hours, I travel " + v.travelFor(6));
	}

}