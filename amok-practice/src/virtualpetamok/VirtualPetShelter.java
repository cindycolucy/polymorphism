package virtualpetamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	// Map of pets and attributes
	private int litterBox = 50;

	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	public int getLitterBox() {
		return litterBox;
	}

	public void cleanLitterBox() {
		litterBox = 0;
	}

	public void maintainAllRobo() {
		for (VirtualPet d : shelterPets.values()) {
			if (d instanceof RoboticPet) {
				((RoboticPet) d).oilPet();
				((RoboticPet) d).recharge();
			}
		}

	}

	public void cleanDogCages() {
		for (VirtualPet d : shelterPets.values()) {
			if (d instanceof OrgDog) {
				((OrgDog) d).cleanCage();
			}
		}

	}

	public void walkDogs() {
		for (VirtualPet d : shelterPets.values()) {
			if (d instanceof Dog) {
				((Dog) d).walk();
			}
		}
	}

	public void intake(OrganicPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void intake(RoboticPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void feedAllOrganic() {
		for (VirtualPet p : shelterPets.values()) {
			((OrganicPet) p).feed();
			if (p instanceof OrganicPet) {
			}
			litterBox += 10;
		}
	}

	public void waterAllOrganic() {
		for (VirtualPet p : shelterPets.values()) {
			((OrganicPet) p).water();
			if (p instanceof OrganicPet) {
				litterBox += 5;
			}
		}
	}

	// Tick method
	void tickAllPets() {
		for (VirtualPet p : shelterPets.values()) {
			((OrgCat) p).tick();
			if (p instanceof OrgCat) {
				litterBox += 10;
			}
			if (!(p instanceof OrgCat)) {
				if (p instanceof OrgDog)
					;
				((OrgDog) p).tick();
			}
			if (p instanceof RoboticPet) {
				((RoboticPet) p).tick();
			}
		}
	}

	// Method returning collection of all pets in the shelter
	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	// Method to return a pet from the map by name
	public VirtualPet getPet(String name) {
		return shelterPets.get(name);

	}

	// Method to play with one pet
	public void playOne(VirtualPet player) {
		player.play();
	}

	// Method to adopt a pet
	public void adoptPet(VirtualPet pet) {
		shelterPets.remove(pet.getName());

	}
}