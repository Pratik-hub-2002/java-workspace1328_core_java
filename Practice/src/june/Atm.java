package june;

import java.util.Scanner;

public class Atm {

	public void atm(int balance_amt, int withdrawl_amt) {

		if (withdrawl_amt <= balance_amt) {

			if (withdrawl_amt % 100 == 0) {

				int remaining_balance = balance_amt - withdrawl_amt;

				System.out.println("\nWithdrawl Successful.");
				System.out.println("\nRemaining Balance = " + remaining_balance);
			} else {
				System.out.println("\nInvalid Denomination! Amount should be multiple of 100.");
			}
		} else {
			System.out.println("\nInsufficient Balance");
		}

	}

	public static void main(String[] args) {

		int balance_amt = 50000;

		Scanner sc = new Scanner(System.in);

		System.out.println("Balance Amount = " + balance_amt);

		System.out.println("\nEnter Withdrawl Amount");
		int withdrawl_amt = sc.nextInt();

		Atm a = new Atm();
		a.atm(balance_amt, withdrawl_amt);

		sc.close();

	}
}
