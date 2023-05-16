import java.util.Scanner;

public class TimeConversion {
	static boolean Loop = true;
	//converts seconds to minutes
	public static void secondsToMinuites() {
		double sec, min;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Time In Seconds: "); 
		sec = input.nextDouble();
		input.close();
		min = sec / 60;
		System.out.println("The Time In Minutes is " + min);
		System.out.println("Wish To Continue (y/n): ");
		Scanner input1 = new Scanner(System.in);
		String result = input.nextLine();
		input1.close();
		if (result == "y"){
			Loop = true;
		}else{
			Loop = false;
		}
		
	}
	
	//converts minutes to seconds
	public static void minuitesToSeconds(){
		double min, sec;
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter Time In Minutes: ");
		min = input.nextDouble();
		input.close();
		sec = min*60;
		System.out.println("The Time In Seconds is " + sec);
		System.out.println("Wish To Continue (y/n): ");
		Scanner input2 = new Scanner(System.in);
		String result = input.nextLine();
		input2.close();
		if (result == "y"){
			Loop = true;
		}else{
			Loop = false;
		}
	}
	
	//converts minutes to hours
	public static void minutesToHours(){
		double min, hour;
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter Time In Minutes: ");
		min = input.nextDouble();
		input.close();
		hour = min*60;
		System.out.println("The Time In Hours is " + hour);
		System.out.println("Wish To Continue (y/n): ");
		Scanner input3 = new Scanner(System.in);
		String result = input.nextLine();
		input3.close();
		if (result == "y"){
			Loop = true;
		}else{
			Loop = false;
		}
	}
	
	//converts hours to minutes 
	public static void hoursToMinuites() {
		double hours, min;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Time In Hours: "); 
		hours = input.nextDouble();
		input.close();
		min = hours / 60;
		System.out.println("The Time In Minutes is " + min);
		System.out.println("Wish To Continue (y/n): ");
		Scanner input4 = new Scanner(System.in);
		String result = input.nextLine();
		input4.close();
		if (result == "y"){
			Loop = true;
		}else{
			Loop = false;
		}
	}

	public static void main(String[] args) {
		while (Loop){
			int choice;
			Scanner input = new Scanner(System.in);
			/* Prompt user for type of conversion */
			System.out.println("1. Seconds To Minutes conversion."); 
			System.out.println("2. Minutes To Seconds conversion.");
			System.out.println("3. Minutes To Hours conversion."); 
			System.out.println("4. Hours To Minutes conversion.");
			System.out.print ("Enter your choice: ");
			choice = input.nextInt();
			if (choice == 1) { 
				secondsToMinuites();
			} else if (choice == 2) {
				minuitesToSeconds();
			} else if (choice == 3) {
				minutesToHours();
			} else if (choice == 4) {
				hoursToMinuites();
			}
			input.close();
		}
	}
}
