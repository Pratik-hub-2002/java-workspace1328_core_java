package CFS_practice.src;

import java.util.*;

public class Loan {

	void checkLoan(int age, float salary) {

		if (age >= 21 && salary >= 25000) {

			System.out.println("Eligible for Loan");
		} else {
			System.out.println("Not Eligible for Loan");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age = ");
		int age = sc.nextInt();

		System.out.println("Enter your salary = ");
		float salary = sc.nextFloat();

		Loan l = new Loan();
		l.checkLoan(age, salary);

		sc.close();
	}

}
