/* Programmer: Ethan Liberty
*   Purpose: To generate 2 random numbers between 0 and 20
*   and create a game that gives you points based on how many
*   attempts it takes for you to add said numbers
*/

//Imports random number gen and a scanner for input
import java.util.Random;
import java.util.Scanner;

public class Adder {
	
	//makes intRandom public variable
	int intRandom;
	public Adder(){
		this.intRandom = 0;
	}
	
	public void randomNum(){
		//generates random number
		Random num = new Random();
		int upperbound = 21;
		this.intRandom = num.nextInt(upperbound);
	}
	
	public int getIntRandom() {
		//allows us to get our random number
		return intRandom;
	}
	
	public int addNum(Adder a, Adder b){
		//adds our 2 random numbers
		int total = a.getIntRandom() + b.getIntRandom();
		return total;
	}
	
	public static void main(String[] args) {
		//creates 2 storages random numbers
		Adder a = new Adder();
		Adder b = new Adder();
		//creates a points variable
		int points = 0;
		//sets up our while loop
		boolean game = true;
		while(game){
			//gets 2 random numbers
			a.randomNum();
			b.randomNum();
			//opens our scanner
			Scanner input = new Scanner(System.in);
			//adds numbers
			int total = a.addNum(a, b);
			//Ask our question
			System.out.print(a.getIntRandom()+" + "+b.getIntRandom()+" = ");
			int result = input.nextInt();
			
			if (result == 999){
				//allows us to quit our game
				game = false;
			}
			else if (result == total){
				//says if there first answer is right give 3 points
				points += 3;
				game = true;
			}
			else if (result != total){
				//Tells them there wrong and gives them a second attempt
				System.out.println("Wrong Answer");
				System.out.print("Enter another answer: ");
				int result2 = input.nextInt();
				
				if (result2 == 999){
					//allows us to quit our game
					game = false;
				}
				else if (result2 == total){
					//says if there second answer is right give 2 points
					points += 2;
					game = true;
				}
				else if (result != total){
					//Tells them there wrong and gives them a second attempt
					System.out.println("Wrong Answer");
					System.out.print("Enter another answer: ");
					int result3 = input.nextInt();
					
					if (result3 == 999){
						//allows us to quit our game
						game = false;
					}
					else if (result3 == total){
						//says if there third answer is right give 1 points
						points += 1;
						game = true;
					}
					else if (result != total){
						//Tells them there wrong and gives them no points
						System.out.println("Wrong Answer");
					}
				}
			}
		}
	//prints our score
	System.out.print("Your Score Is: " + points);
	}
}