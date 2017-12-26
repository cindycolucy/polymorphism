package vehiclesWithInterfaces;

//interfaces are always abstract, so no need to say 'abstract'
public interface GasPowered {
	// always public abstract, so we don't need to specify
	//instance variable for gas-powered only
	double travelTimeBeforeRefueling();
}