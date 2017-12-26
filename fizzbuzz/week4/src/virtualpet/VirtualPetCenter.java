package virtualpet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetCenter {

	// VirtualPets by name
	// map id general type (it's an interface)
	// HashMap is the specific (concrete type)

	private Map<String, VirtualPet> petsByName = new HashMap<String, VirtualPet>();

	//return values in PetsByName
	public Collection<VirtualPet> pets() {
		return petsByName.values();

	}
	//get each pet in petsByName
	public VirtualPet getPet(String name) {
		return petsByName.get(name);
	}

	// add pets to the shelter
	public void intake(VirtualPet pet){ //pet is random variable for the pet we're adding
		petsByName.put(pet.getName(), pet);
	}
	

	// remove pets from the shelter
	public void adopt(VirtualPet pet) {
		VirtualPet thePetIJustRemoved = petsByName.remove(pet.getName());

	}

	// feed all pets
	public void feedPets() {
		for (VirtualPet pet : pets()) { // pets is the method from above that returns petsByName.values()
			pet.feed();
		}
	}

	public void playWith(String name) {
		getPet(name).play();
	}

	public void tick() {
		for (VirtualPet pet : pets()) {
			pet.tick();
		}

	}
}
