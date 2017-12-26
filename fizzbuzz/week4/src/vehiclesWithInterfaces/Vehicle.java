package vehiclesWithInterfaces;

public abstract class Vehicle {

	//instance variable needed for all vehicles
	protected int rateOfTravelPerHour; // mph

	// fuel instance variables
	private int milesPerGallon;
	private int currentFuelLevel;

	// this means that vehicles must implement this method
	//Show as overridden in their own class
	public abstract String getVehicleType();
	
	//constructor setting variables for all vehicles
	public Vehicle(int rate, int fuel, int mpg) {
		rateOfTravelPerHour = rate;
		currentFuelLevel = fuel;
		milesPerGallon = mpg;
	}

	//no body method tells other classes they must have this method
	public abstract double travelFor(double hours);

	//current range method for all vehicles, overridden in bicycle class
	public int currentRange() {
		return currentFuelLevel * milesPerGallon;
	}

}