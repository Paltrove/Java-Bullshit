/* Programmer: Ethan Liberty
*   Purpose: To Calculate The Total Amount Of Money Saved Up
*   And Be Able To Display It In The Proper Format And Withdrawal
*   However Much You Please
*/

//Imports a scanner and num generator
import java.text.NumberFormat;
import java.util.Scanner;

public class MySavings {
	
	//public key variables that allow us to use total and money format everywhere
	double total;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public MySavings(){
		//creates our savings account
		this.total = 0;
	}
	
	public String getTotal(){
		//grabs our total for us to see
		return this.money.format(total);
	}
	
	public void addPennies(double p){
		//converts our amount of pennies to their value
		this.total += (0.01*p);
	}
	
	public void addNickles(double n){
		//converts our amount of nickels to their value
		this.total += (0.05*n);
	}
	
	public void addDimes(double d){
		//converts our amount of dimes to their value
		this.total += (0.10*d);
	}
	
	public void addQuarters(double q){
		//converts our amount of quarters to their value
		this.total += (0.25*q);
	}
	
	public void withdrawal(double amt){
		//allows us to check if the amount they are withdrawing is over their balance and if not then removes those funds from total
		if (amt <= this.total){
			this.total -= amt;
			System.out.println(getTotal());
		} else if (amt >= this.total){
			System.out.println("Insufficient Funds\n");
		}
	}
	
	public String toString(){
		//Creates our main menu
		String myOutput = "";
		myOutput += "1. Show Total Bank\n";
		myOutput += "2. Add Pennies\n";
		myOutput += "3. Add Nickles\n";
		myOutput += "4. Add Dimes\n";
		myOutput += "5. Add Quarters\n";
		myOutput += "6. Remove Funds\n";
		myOutput += "Enter 0 To Quit\n";
		myOutput += "Enter Your Choice: ";
		return myOutput;
	}
	
	public static void main(String[] args) {
		//creates our savings account
		MySavings a = new MySavings();
		
		//creates our scanner for input
		Scanner input = new Scanner(System.in);
			
		//creates a while loop
		boolean loop = true;
		while (loop){
			
			//prints our menu
			System.out.println(a);
			//takes the users input
			double result = input.nextDouble();
			
			//runs first if case to quit loop
			if (result == 0){
				loop = false;
			}
			//runs second if case to print total
			else if (result == 1){
				System.out.println(a.getTotal());
			}
			//runs third if case to add pennies
			else if (result == 2){
				System.out.println("Enter Amount Of Pennies: ");
				double amount = input.nextDouble();
				a.addPennies(amount);
			}
			//runs forth if case to add nickels
			else if (result == 3){
				System.out.println("Enter Amount Of Nickles: ");
				double amount = input.nextDouble();
				a.addNickles(amount);
			} 
			//runs fifth if case to add dimes
			else if (result == 4){
				System.out.println("Enter Amount Of Dimes: ");
				double amount = input.nextDouble();
				a.addDimes(amount);
			}
			//runs sixth if case to add quarters
			else if (result == 5){
				System.out.println("Enter Amount Of Quarters: ");
				double amount = input.nextDouble();
				a.addQuarters(amount);
			}
			//runs seventh if case to withdrawal funds
			else if (result == 6){
				System.out.println("Enter Amount You To Withdrawal: ");
				double amount = input.nextDouble();
				a.withdrawal(amount);
			}
		}
	}
}
