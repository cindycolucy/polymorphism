package kitchen;

import java.util.ArrayList;
import java.util.Collection;

public class KitchenManager {
	private Collection<Cooker> cookers = new ArrayList<>();
	
	public void add(Cooker toAdd){
		cookers.add(toAdd);
	}
	public void doYourJob(){
		System.out.println("KM doing my job.");
		for (Cooker c: cookers){
			c.cook();
		}
	}
}
