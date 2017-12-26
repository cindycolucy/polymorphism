package vehiclesWithInterfaces;

public class DeliveryVan extends Vehicle implements GasPowered {
	
	//instance variable only needed by delivery van
	private double refuelingTimeInHours;

	//constructor?
	public DeliveryVan() {
		super(60, 17, 15);
		refuelingTimeInHours = 0.25;
	}
	//overridden method from Vehicle Class
	@Override
	public String getVehicleType() {
		return "Shiny battered van with dark windows.";
	}
	//overridden method from Vehicle Class
	@Override
	public double travelTimeBeforeRefueling() {
		// (double) value causes the value to be treated like a double
		return (double) currentRange() / rateOfTravelPerHour;
	}
	
	/**
	 * Travels for <code>hours</code>, then returns the distance traveled.
	 */
	//Method for delivery van only, overridden from vehicle class
	@Override
	public double travelFor(double hours) {
		if (hours >= travelTimeBeforeRefueling()) {
			return (hours - refuelingTimeInHours) * rateOfTravelPerHour;
		}
		return hours * rateOfTravelPerHour;
	}
}