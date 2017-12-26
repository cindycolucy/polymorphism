package vehicles2;

public class Bicycle2 extends Vehicles2 {
	public Bicycle2() {
		super(16, 0, 0, 0.33);
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

