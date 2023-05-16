
public class Customer {
	String fName, lName, street, city, postalCode, province;
	public Customer(String fName, String lName, String street, String city, String postalCode, String province) {
		this.setfName(fName);
		this.setlName(lName);
		this.setStreet(street);
		this.setCity(city);
		this.setPostalCode(postalCode);
		this.setProvince(province);
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
