package hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VirtualPetController {

	private Map<String, VirtualPet> pets = new HashMap<>();
	
	public VirtualPetController() {
		VirtualPet fido = new VirtualPet("fido", 59, 234);
		pets.put("fido", fido);
		pets.put("bobo", new VirtualPet("bobo", 34, 29));
		pets.put("fifoo", new VirtualPet("fifoo", 29, 16));
	}
	
	@RequestMapping("/pets")
	public String fetchPets(Model model) {
		model.addAttribute("petsAsMap", pets);
		model.addAttribute("petsAsCollection", pets.values());
		return "petIteration";
	}
}