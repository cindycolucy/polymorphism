package vehiclesWithSuperclass;

public abstract class GasPoweredVehicle extends Vehicle {

	protected double refuelingTimeInHours;
	protected int milesPerGallon;
	protected int currentFuelLevel;

	public GasPoweredVehicle(int rate, int fuelLevel, int mpg, double refuelingTime) {
		super(rate);
		this.currentFuelLevel = fuelLevel;
		this.milesPerGallon = mpg;
		this.refuelingTimeInHours = refuelingTime;
	}

	public double travelTimeBeforeRefueling() {
		// (double) value causes the value to be treated like a double
		return (double) currentRange() / rateOfTravelPerHour;
	}

	/**
	 * Travels for <code>hours</code>, then returns the distance travelled.
	 */
	@Override
	public double travelFor(double hours) {
		if (hours >= travelTimeBeforeRefueling()) {
			return (hours - refuelingTimeInHours) * rateOfTravelPerHour;
		}
		return hours * rateOfTravelPerHour;
	}

	@Override
	public int currentRange() {
		return getCurrentFuelLevel() * getMilesPerGallon();
	}

	public int getCurrentFuelLevel() {
		return currentFuelLevel;
	}

	public int getMilesPerGallon() {
		return milesPerGallon;
	}

}