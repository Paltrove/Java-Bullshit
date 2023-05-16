/* Programmer: Ethan Liberty
*  Purpose: To make Mr. Simpson's question everything about Java Random
*/
//imports random
import java.util.Random;
//allows us to run the program
public class Coin {
	//useless but you wanted it
	public Coin(){
	//closes method
	}
	//flips a coin
	public double flipCoin(){
		//creates new random number genarator
		Random num = new Random();
		//sets max value to be 1
		int upperbound = 2;
		//give variable a number from 0-1
		int intRandom = num.nextInt(upperbound);
		//returns the variable
		return intRandom;
	//closes method
	}
	//runs main code
	public static void main(String[] args) {
		while (true){
			//creates a new coin to flip
			Coin nickel = new Coin();
			//says if the random number is 0 to do this
			if (nickel.flipCoin() == 0){
				//prints that the virtual coin i created is heads
				System.out.println("Heads!");
			//closes the if statemnt
			}
			//says if its not 0 then do this
			else {
				//prints that the virtual coin i created is tails
				System.out.println("Tails!");
			//closes the else statement
			}
		}
	//stops our main program
	}
//finish our program
}