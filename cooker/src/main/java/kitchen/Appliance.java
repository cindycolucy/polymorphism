package kitchen;

public abstract class Appliance {
	public void powerOn(){
		System.out.println("Turning power on for " + getClass().getSimpleName());;
	}

}
