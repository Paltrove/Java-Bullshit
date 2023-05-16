import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Wordle {
	Vector<String> dictionary = new Vector<String>();
	static String answer = "";
	static String attempt = "";
	static boolean Loop = true;
	String[] attemptList = attempt.split("");
	String[] answerList = answer.split("");

	public void populate(){
		try{
			File textFile = new File("src/words.txt");
			Scanner filereader = new Scanner(textFile);
			while(filereader.hasNextLine()){
				String data = filereader.nextLine();
				dictionary.add(data);
			}
			filereader.close();
		}
		catch(Exception e){
			System.err.println("File not found");
		}
	}

	public void wordGrabber(){
		//fills my array with random variables
		Random rand = new Random();
		int word = rand.nextInt(dictionary.size());
		answer = dictionary.get(word);
	}

	public boolean wordChecker(){
		for (int i=0; i<dictionary.size(); i++){
			if (attempt.equals(dictionary.get(i))){
				return true;
			}
		}
		return false;
	}

	public boolean wordComparison(){
		if (attempt.equals(answer)){
			Loop = false;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Wordle a = new Wordle();
		a.populate();
		a.wordGrabber();
		Scanner answerInput = new Scanner(System.in);
		while(Loop){
			System.out.println("Answer: "+answer);
			System.out.print("Attempt: ");
			attempt = answerInput.nextLine();
			System.out.println("Is A Word In Dictionary: "+a.wordChecker());
			System.out.println("Is This The Word: "+a.wordComparison());
		}
		answerInput.close();
	}	
}