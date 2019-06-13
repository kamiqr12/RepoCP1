
import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your first and last name? ");
		String name = kin.nextLine();
		System.out.println("Hello " + name + ", it's nice to meet you!");
		System.out.print("What is your address? ");
		kin.nextLine();
		System.out.print("What is your city? ");
		kin.nextLine();
		System.out.print("What is your zipcode? ");
		kin.nextLine();

	}
}
