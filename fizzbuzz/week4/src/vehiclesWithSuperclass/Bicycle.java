package vehiclesWithSuperclass;

public class Bicycle extends Vehicle {
	
	public Bicycle() {
		super(16);
	}
	@Override
	public String getVehicleType() {
		return "Scott bicycle, two wheels";
	}

	@Override
	public int currentRange() {
		return 20;
	}
}