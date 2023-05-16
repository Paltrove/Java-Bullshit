import java.util.Scanner;
import java.text. NumberFormat;

public class Bank {
	public static void main(String[] args) {
		Account munozAccount = new Account (250, "Ohian", "Ohiaoma", "420 Ohian Street", "Ohio", "Oh", "69");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println(munozAccount);
		System.out.println("********************");
		
		munozAccount.changeAccount("111 Glade Street", "Ohio", "On", "33434");
		System.out.println(munozAccount);
		System.out.println("********************");
		
		System.out.print ("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit (data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance ()));
		
		System.out.print ("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance ()));
		input.close();
	}
}