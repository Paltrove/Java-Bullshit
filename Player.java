/* Programmer: Ethan Liberty
*   Purpose: Uses the GameBooth file to take the bare structures
*   of the game and adds more functionality to it including the
*   player profiles and allows us to figure out if they have enough
*   money
*/
public class Player {
	
	//private variables for accessing the players funds and their prizes
	private double spendingMoney;
	private String prizesWon;
	
	public Player(double money){
		//allows us to create a player profile including their funds and prizes
		spendingMoney = money;
		prizesWon = "";
	}

	public String play(GameBooth game){
		//takes in our game structure and allows us to check funds
		String newPrize;
		
		//if they don't have the funds tells them they can't play
		if (game.getCost() > spendingMoney){
			return("Sorry, not enough money to play.");
		}
		//Otherwise it runs the game and stores their prize
		else{
			spendingMoney -= game.getCost();
			newPrize = game.start();
			prizesWon = newPrize + ", " + prizesWon;
			return("Prize Won: " + newPrize);
		}
	}
	
	public String showPrizes(){
		//displays their prizes
		return(prizesWon);
	}
	
	public double getMoney(){
		//displays their funds
		return(spendingMoney);
	}

	public String toString(){
		//allows us to print their funds and prizes
		String myOutput = "";
		myOutput += "Your Remaining Funds: "+ this.getMoney() + "\n";
		myOutput += "Your Prizes won: "+ this.showPrizes();
		return myOutput;
    }
	
}
