/* Programmer: Ethan Liberty
*   Purpose: Holds all the code relating to the game this includes the setup
*   for how the winner is chosen as well as sets up what prize the person would
*   win
*/

//imports the random number generator
import java.util.Random;

public class GameBooth {
	//private variables that allows us to access our prizes and cost
	private double cost;
	private String firstPrize, consolationPrize;
	
	public GameBooth(double charge, String p1, String p2){
		//allows us to create a game with the price and prizes
		cost = charge;
		firstPrize = p1;
		consolationPrize = p2;
	}
	
	public String start(){
		//our main game structure
		int toss;
		int successes = 0;
		//generates random number
		Random rand = new Random();
		
		//runs loop 3 times and basically flips a coin
		for (int i = 0; i < 3; i++){
			toss = rand.nextInt(2);
			//if the the "toss" is the same as 1 it adds 1 to success
			if (toss == 1){
				successes += 1;
			}
		}
		//if after the 3 attempts success is 3 it returns 1st prize
		if (successes == 3){
			return(firstPrize);
		}
		//otherwise you get a consolation prize
		else{
			return(consolationPrize);
		}
	}
	
	public double getCost(){
		//allows us to access the cost of a game
		return(cost);
	}
}
