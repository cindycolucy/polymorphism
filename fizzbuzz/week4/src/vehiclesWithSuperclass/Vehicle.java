package vehiclesWithSuperclass;

public abstract class Vehicle {

	protected int rateOfTravelPerHour; // mph

	// this means that vehicles must implement this method
	public abstract String getVehicleType();
	
	public Vehicle(int rate) {
		rateOfTravelPerHour = rate;
	}

	// subclasses would override this to change how it's calculated
	public double travelFor(double hours) {
		return hours * rateOfTravelPerHour;
	}
	
	public abstract int currentRange();

}