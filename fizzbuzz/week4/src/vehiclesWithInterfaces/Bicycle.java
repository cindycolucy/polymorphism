package vehiclesWithInterfaces;

public class Bicycle extends Vehicle {
	
	//constructor?
	public Bicycle() {
		super(16, 0, 0);
	}
	//overridden method from Vehicle Class
	@Override
	public String getVehicleType() {
		return "Scott bicycle, two wheels";
	}
	//overridden method from Vehicle Class
	@Override
	public int currentRange() {
		return 20;
	}
	//overridden method from Vehicle Class
	@Override
	public double travelFor(double hours) {
		return hours * rateOfTravelPerHour;
	}
}
