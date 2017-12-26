package vehiclesWithSuperclass;

public class DeliveryVan extends GasPoweredVehicle {
	
	public DeliveryVan() {
		super(60, 17, 15, 0.25);
	}
	
	@Override
	public String getVehicleType() {
		return "Shiny battered van with dark windows.";
	}
	
}