/* Programmer: Ethan Liberty
*   Purpose: Makes the entire carnival game pretty 
*   as well as creates our games with their cost and
*   prizes as well creates our players and lets them 
*   play games
*/
public class Carnival {

	public static void main(String[] args) {
		//creates our game and players
		GameBooth balloonDartToss = new GameBooth (2, "tiger plush", "sticker"); 
		GameBooth ringToss = new GameBooth (2, "bear keychain", "pencil");
		GameBooth breakAPlate = new GameBooth (1.5, "pig plush", "plastic dinosaur"); 
		Player shonda = new Player(5);
		Player luis = new Player (3);
		
		//plays a game
		System.out.print ("Shonda goes to Balloon Dart Toss. "); 
		System.out.println(shonda. play (balloonDartToss));
		
		//plays a game
		System.out.print("Luis goes to Ring Toss. "); 
		System.out.println(luis.play(ringToss));
		
		//plays a game
		System.out.print ("Shonda goes to Ring Toss. "); 
		System.out.println(shonda.play(ringToss));
		
		//plays a game
		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(luis.play (breakAPlate));
		
		//prints prizes won
		System.out.println("Shonda won: " + shonda.showPrizes());
		System.out.println("Luis won: " + luis.showPrizes());
		
		//prints their prizes with remaining funds
		System.out.println("\n" + "Shonda:\n" + shonda);
		System.out.print("\n" + "Luis:\n" + luis);
	}

}
