import java.util.*;

public class ATM_Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");

		System.out.println("Choose any above = ");
		int choose = sc.nextInt();

		switch (choose) {

		case 1:
			System.out.println("Check Balance");
			break;

		case 2:
			System.out.println("Withdraw");
			break;

		case 3:
			System.out.println("Exit");
			break;

		case 4:
			System.out.println("Exit");
			break;

		default:
			System.out.println("Invalid Input");
		}
	}

}
