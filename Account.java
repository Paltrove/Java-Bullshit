
public class Account {
	private double balance;
	private Customer cust;
	public Account(double bal,String fName,String lName,String street,String city,String province,String postalCode){
		balance = bal;
		cust = new Customer(fName, lName, street, city, postalCode, province);
	}
	
	public void changeAccount(String street,String city,String province,String postalCode){
		cust.setCity(city);
		cust.setStreet(street);
		cust.setProvince(province);
		cust.setPostalCode(postalCode);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amt){
		balance += amt;
	}
	
	public String toString(){
		String output = "";
		output += cust.getfName() +" " + cust.getlName()+"\n"+cust.getStreet()+"\n"+cust.getCity()+" " + cust.getPostalCode();
		return output;
    }
	
	public void withdrawal(double amt){
		if (amt <= balance){
			balance -= amt;
		} else {
			System.out.println("Insufficient Funds");
		}
	}
}
