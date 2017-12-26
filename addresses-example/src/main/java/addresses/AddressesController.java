package addresses;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressesController {

	private Map<String, AddressCard> addresses = new HashMap<>();

	public AddressesController() {
		AddressCard mary = new AddressCard("Mary", "123 Dunedin", "43214");
		addresses.put("Mary", mary);
		addresses.put("Bobby", new AddressCard("Bobby", "456 Como", "43220"));
		addresses.put("Lucy", new AddressCard("Lucy", "224 Lakeview", "43220"));
	}

	@RequestMapping("/addresses")
	public String fetchAddresses(Model model) {
		model.addAttribute("addressesAsMap", addresses);
		model.addAttribute("addressesAsCollection", addresses.values());
		return "addressIteration";
	
	}
}
