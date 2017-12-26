package addresses;

public class AddressCard {
	private String name;
	private String address;
	private String zip;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getZip() {
		return zip;
	}

	public AddressCard(String name, String address, String zip) {
		this.name = name;
		this.address = address;
		this.zip = zip;
	}
}
